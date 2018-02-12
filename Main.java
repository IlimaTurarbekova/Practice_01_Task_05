import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a * b * c;
        System.out.printf("Объем параллелепипеда (%d x %d x %d) равен %d", a, b, c, result  );
    }
}
