package Console;

import java.io.IOException;
import java.util.Random;

public class ConsoleAnimation {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";
    public static final String CYAN = "\u001B[36m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) throws InterruptedException, IOException {
        Random random = new Random();
        String[] stars = {"*", ".", "+", "o", "★", "✧"};
        String[] starColors = {YELLOW, WHITE, CYAN}; // 별들이 가질 수 있는 색상들
        
        String message = PURPLE + " ✨ Good Night ✨ " + RESET;
        int width = 60;
        
        System.out.println(CYAN + "★ 컬러 별비가 내립니다... (Enter를 누르면 정지) ★" + RESET + "\n");
        Thread.sleep(1000);

        while (System.in.available() == 0) {
            StringBuilder line = new StringBuilder();
            
            if (random.nextInt(50) < 1) {
                int padding = Math.max(0, (width - 20) / 2); // 메시지 길이에 맞춰 패딩 조절
                line.append(" ".repeat(padding)).append(message);
            } else {
                for (int i = 0; i < width; i++) {
                    if (random.nextInt(15) < 1) {
                        String color = starColors[random.nextInt(starColors.length)];
                        String shape = stars[random.nextInt(stars.length)];
                        // 색상 적용 후 다시 RESET으로 초기화해줘야 다음 공백에 영향이 없습니다.
                        line.append(color).append(shape).append(RESET);
                    } else {
                        line.append(" ");
                    }
                }
            }

            System.out.println(line.toString());
            Thread.sleep(150); 
        }

        System.out.println("\n" + PURPLE + "[시스템] 별비가 그쳤습니다. 좋은 꿈 꾸세요! 🌙" + RESET);
    }
}