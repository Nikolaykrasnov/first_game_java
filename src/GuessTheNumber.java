import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Компьютер загадывает число от 1 до 100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Я загадал число от 1 до 100. Попробуй угадать его!");

        while (true) {
            System.out.print("Введите ваше число: ");
            int userGuess;

            // Проверка на корректность ввода
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                // Проверка на угадал ли пользователь
                if (userGuess == secretNumber) {
                    System.out.println("Поздравляю! Вы угадали число " + secretNumber + " за " + attempts + " попыток.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Я сам в шоке, но, загаданное число больше, брат.");
                } else {
                    System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат.");
                }
            } else {
                System.out.println("Пожалуйста, введите целое число.");
                scanner.next(); // Сбрасываем некорректный ввод
            }
        }

        scanner.close();
    }
}
