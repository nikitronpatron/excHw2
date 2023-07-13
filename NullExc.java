import java.util.Scanner;

public class NullExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("Недопустимо вводить пустые строки!");
        } else {
            System.out.println("Вы ввели: " + input);
        }
        scanner.close();
    }
}