import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число (через запятую): ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Ошибка ввода. Введите дробное число: ");
            scanner.next();
        }
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}