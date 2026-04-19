package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AutoPlayer {
    // 색상 코드
    public static final String RESET = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001b[95m";

    public static void main(String[] args) {
            // [변경 포인트] 파일 이름만 바꾸면 다른 곡도 바로 재생 가능!
            String songName = "Loose"; 
            String wavPath = "src/test/" + songName + ".wav";
            String lrcPath = "src/test/" + songName + ".lrc";

            // 1. 음악 먼저 재생 (별도 스레드)
            playWav(wavPath);

            // 2. 가사 출력 시작
            displayLyrics(lrcPath);
        }

        private static void playWav(String path) {
            new Thread(() -> {
                try {
                    File file = new File(path);
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start(); // 음악 재생
                } catch (Exception e) {
                    System.out.println("❌ 음악 파일 재생 실패: " + e.getMessage());
                }
            }).start();
        }

        private static void displayLyrics(String path) {
            long startTime = System.currentTimeMillis();
            boolean isFirstLine = true;

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String fileLine;
                while ((fileLine = br.readLine()) != null) {
                    if (fileLine.startsWith("[")) {
                        // 시간 및 가사 추출
                        int closeIndex = fileLine.indexOf("]");
                        int min = Integer.parseInt(fileLine.substring(1, 3));
                        double sec = Double.parseDouble(fileLine.substring(4, closeIndex));
                        long targetTime = (long) ((min * 60 + sec) * 1000);
                        String content = fileLine.substring(closeIndex + 1);

                        // 박자 맞추기
                        while (System.currentTimeMillis() - startTime < targetTime) {
                            Thread.sleep(10);
                        }

                        // 첫 줄 강조
                        if (isFirstLine) System.out.print(CYAN);

                        // 타이핑 효과
                        for (char c : content.toCharArray()) {
                            System.out.print(c);
                            System.out.flush();
                            Thread.sleep(60);
                        }

                        System.out.println(RESET);
                        isFirstLine = false;
                    }
                }
                System.out.println("\n" + PURPLE + "✨ 노래가 종료되었습니다." + RESET);
            } catch (Exception e) {
                System.out.println("❌ 가사 파일을 읽는 중 오류 발생: " + e.getMessage());
            }
        }
    }