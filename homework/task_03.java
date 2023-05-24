package homework;

import java.util.Random;
// Реализовать простой калькулятор
import java.util.Scanner;

public class task_03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int num_x = random.nextInt(100);
    int num_y = random.nextInt(100);
    System.out.println("Первое число: " + num_x + ", Второе число: " + num_y);
    System.out.print("введите операцию для чисел (*, /, +, - ): ");
    String op = scanner.nextLine();
    if (op.equals("*")) {
      System.out.println(num_x * num_y);
    }
    if (op.equals("/")) {
      System.out.println(num_x / num_y);
    }
    if (op.equals("+")) {
      System.out.println(num_x + num_y);
    }
    if (op.equals("-")) {
      System.out.println(num_x - num_y);
    }
    scanner.close();
  }
}
