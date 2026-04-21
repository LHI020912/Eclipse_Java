package Console;
import java.io.IOException;
import java.util.Random;

// 1. 별의 속성을 담는 클래스
class Star {
    private static final String[] SHAPES = {"*", ".", "+", "o", "★", "✧"};
    private static final String[] COLORS = {
        "\u001B[33m", // YELLOW
        "\u001B[37m", // WHITE
        "\u001B[36m", // CYAN
        "\u001B[35m"  // PURPLE
    };
    private static final String RESET = "\u001B[0m";
    private static final Random RANDOM = new Random();

    public static String getRandomStar() {
        String color = COLORS[RANDOM.nextInt(COLORS.length)];
        String shape = SHAPES[RANDOM.nextInt(SHAPES.length)];
        return color + shape + RESET;
    }
}

// 2. 애니메이션 로직을 담당하는 엔진 클래스
class StarfallEngine {
    private final int width;
    private final String message;
    private final int speed;

    public StarfallEngine(int width, String message, int speed) {
        this.width = width;
        this.message = "\u001B[35m ✨ " + message + " ✨ \u001B[0m";
        this.speed = speed;
    }

    public void start() throws InterruptedException, IOException {
        System.out.println("\u001B[36m★ 별비 엔진 가동... (Enter를 누르면 정지) ★\u001B[0m\n");
        Random random = new Random();

        while (System.in.available() == 0) {
            if (random.nextInt(50) < 1) {
                printMessage();
            } else {
                printStarLine(random);
            }
            Thread.sleep(speed);
        }
        stop();
    }

    private void printStarLine(Random random) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < width; i++) {
            line.append(random.nextInt(15) < 1 ? Star.getRandomStar() : " ");
        }
        System.out.println(line.toString());
    }

    private void printMessage() {
        int padding = Math.max(0, (width - 20) / 2);
        System.out.println(" ".repeat(padding) + message);
    }

    private void stop() {
        System.out.println("\n\u001B[35m[SYSTEM] 엔진이 정지되었습니다. 편안한 밤 되세요! 🌙\u001B[0m");
    }
}

// 3. 실행을 위한 메인 클래스
public class Main {
    public static void main(String[] args) {
        try {
            // 설정값만 바꿔서 바로 실행 가능
            StarfallEngine engine = new StarfallEngine(60, "Good Night", 150);
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}