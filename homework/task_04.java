package homework;

import java.lang.reflect.Array;
import java.util.Scanner;

// Задано уравнение вида q + w = e
// q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class task_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("введите первое число и на неизвестные цифры поставьте знак '?': ");
    String num_1 = scanner.nextLine();
    String new_num_1 = num_1;
    System.out.println();
    System.out.print("введите первое число и на неизвестные цифры поставьте знак '?': ");
    String num_2 = scanner.nextLine();
    String new_num_2 = num_2;
    System.out.println();
    System.out.print("введите сумму и на неизвестные цифры поставьте знак '?': ");
    String sum = scanner.nextLine();
    String new_sum = sum;
    System.out.println();

    System.out.println(num_X(new_num_1));

  }

  static String num_X(String nums) {
    for (int i = 0; i < nums.length(); i++) {
      if (nums.charAt(i).equals('?')) {
        nums.replace(nums.charAt(i), '0');
      } else {
        nums.replace(nums.charAt(i), 'x');
      }
    }
    return nums;
  }
}
