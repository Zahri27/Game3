import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(11);
        int attempts = 3;

        System.out.println("Компьютер загадал число от 0 до 10. У вас есть 3 попытки.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Попытка " + (i + 1) + ": Введите ваше предположение: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Поздравляем! Вы угадали число " + numberToGuess + "!");
                return;
            } else {
                System.out.println("Неверно.");
                if (i < attempts - 1) {
                    System.out.println("Попробуйте еще раз.");
                }
            }
        }

        System.out.println("Вы проиграли. Компьютер загадал число " + numberToGuess + ".");
    }
}



