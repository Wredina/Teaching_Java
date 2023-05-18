package Java;

import java.util.Scanner;

/**
 * program
 */
public class program {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("введите имя: ");
    // String tmp = scanner.nextLine();
    // System.out.println("добрый день, " + tmp);
    // scanner.close();

    // int[] arr = new int[] { 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 };

    // int count = 0;
    // int a = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 1) {
    // count++;
    // } else if (count > a) {
    // a = count;
    // count = 0;
    // } else
    // count = 0;
    // }
    // System.out.println(a);

    // Добро пожаловать на курс Java --> Java курс на пожаловать Добро
    // String s = "Добро пожаловать на курс Java";
    // String[] array = s.split(" ");

    // for (int i = array.length - 1; i >= 0; i--) {
    // System.out.print(array[i] + " ");
    // }

    // степень
    System.out.println(fDiv(2, -0.3f));
  }

  private static float fDiv(int a, float b) {
    float f = (float) Math.pow(a, b);
    return f;
  }
}