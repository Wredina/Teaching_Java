package homework.less_1;

import java.util.Arrays;

import java.util.Random;

public class Task_05 {
  public static void main(String[] args) {
    // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    Random random = new Random();
    int i = random.nextInt(2000);
    System.out.println(i);
    // *Пункты реализовать в разных методах
    int n = num_n(i);
    System.out.println(n);
    String[] m1 = arr_max_value(n, i);
    System.out.println(Arrays.toString(m1));
    String[] m2 = arr_min_value(n, i);
    System.out.println(Arrays.toString(m2));
  }

  // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
  static int num_n(int num_i) {
    int n = 1 << 2000;
    while (n > num_i) {
      n >>= 1;
    }
    return n;
  }

  // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
  // массив m1

  static String[] arr_max_value(int num_n, int num_i) {
    Short sh_value = new Short(Short.MAX_VALUE);
    String arr = "";
    for (int i = num_i; i <= sh_value; i++) {
      if (i % num_n == 0) {
        arr = arr.concat(Integer.toString(i));
        arr = arr + " ";
      }
    }
    return arr.split(" ");
  }

  // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в
  // массив m2
  static String[] arr_min_value(int num_n, int num_i) {
    Short sh_value = new Short(Short.MIN_VALUE);
    String arr = "";
    for (int i = sh_value; i <= num_i; i++) {
      if (i % num_n == 1) {
        arr = arr.concat(Integer.toString(i));
        arr = arr + " ";
      }
    }
    return arr.split(" ");
  }
}
