import java.util.Scanner;
    public class Arithmetic{
    public static void main(String args[]) {
    int first, second, add, subtract, multiply;
    float divide;
    Scanner scanner = new Scanner(System.in);
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}
