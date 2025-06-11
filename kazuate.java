import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        // プログラマが設定した2桁の正の整数 (例：57)
        final int answer = 57;
        final int maxTries = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲームを始めます！");
        System.out.println("2桁の正の整数を当ててください。");

        for (int attempt = 1; attempt <= maxTries; attempt++) {
            System.out.print(attempt + "回目の入力：");
            int guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("当たり！");
                break;
            } else {
                int diff = Math.abs(guess - answer);

                if (diff >= 20) {
                    System.out.println("20以上差があります。");
                } else if (guess > answer) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (attempt == maxTries) {
                    System.out.println("残念！正解は " + answer + " でした。");
                }
            }
        }

        scanner.close();
    }
}
