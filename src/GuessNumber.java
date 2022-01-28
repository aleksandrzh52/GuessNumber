import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int max = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальное число: ");
        int numScannerMin = scanner.nextInt();
        System.out.print("Введите максимальное число: ");
        int numScannerMax = scanner.nextInt();
        System.out.print("Выберите любое число от " + numScannerMin + " до " + numScannerMax + ": ");
        Random random = new Random();
        int randInt = random.nextInt(numScannerMin,numScannerMax) + 1;


        while (true) {
            int scannerInt = scanner.nextInt();
            if (randInt == scannerInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                break;
            } else if (randInt < scannerInt) {
                System.out.println("Загаданное мною число меньше.");
            } else {
                System.out.println("Загаданное мною число больше.");
            }
            if (--max != 0) {
                System.out.print("Попробуйте еще раз: ");
            } else {
                System.out.print("Увы.. Колличество попыток ограниченно.");
                break;
            }

        }
    }
}
