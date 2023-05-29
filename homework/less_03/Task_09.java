package homework.less_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Task_09 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // Пусть дан произвольный список целых чисел.
    for (int i = 0; i < new Random().nextInt(5, 20); i++) {
      list.add(new Random().nextInt(10));
    }
    System.out.println(list);

    // 1) Нужно удалить из него чётные числа

    // Пробо итератора
    // Iterator<Integer> list1 = list.iterator();
    // while (list1.hasNext()) {
    // int i = list1.next();
    // if (i % 2 == 0) {
    // System.out.println(i);
    // list1.remove();
    // }
    // }

    int i = 0;
    while (i < list.size()) {
      int num_ls = list.get(i);
      if (num_ls % 2 == 0) {
        list.remove(i);
      } else {
        i++;
      }
    }
    System.out.println(list);

    // 2) Найти минимальное значение
    list.sort(Comparator.naturalOrder());
    System.out.println(list);
    int min = list.get(0);
    System.out.println("min = " + min);
    // 3) Найти максимальное значение
    int max = list.get(list.size() - 1);
    System.out.println("max = " + max);
    // 4) Найти среднее значение
    int sum = 0;
    for (int j = 0; j < list.size(); j++) {
      sum = sum + list.get(j);
    }
    int m_value = sum / 2;
    System.out.println("mean value = " + m_value);
  }
}
