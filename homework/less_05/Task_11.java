package homework.less_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_11 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Создать множество, ключь и значение строки.
    Map<String, String> mp_1 = new HashMap<>();
    // Создать второе множество с таким же обобщением.
    Map<String, String> mp_2 = new HashMap<>();
    ArrayList<String> list = new ArrayList<>(List.of("один", "два", "три", "четыре", "пять", "шесть"));
    // Добавить шесть элементов.
    for (int i = 0; i < list.size(); i++) {
      mp_1.put(Integer.toString(i + 1), list.get(i));
    }
    // Вывести в консоль значения.
    System.out.println(mp_1.values());

    // Добавить ко всем значениям символ "!".
    for (int i = 0; i < mp_1.size(); i++) {
      mp_1.compute(Integer.toString(i + 1), (k, v) -> v = v + "!");
    }
    System.out.println(mp_1.values());
    System.out.println(mp_1.keySet());

    // Ключи второго множества частично совпадают с ключеми первого.
    for (int i = 0, j = 0; i < (list.size() * 2); i += 2, j++) {
      mp_2.put(Integer.toString(i), list.get(j));
    }
    System.out.println(mp_2.keySet());

    // Объеденить значания во втором множестве и первом если ключи совподают.
    // Вывести результат в консоль. Реализовать с использованием merge

    for (String k : mp_2.keySet()) {
      if (mp_1.containsKey(k)) {
        mp_2.merge(k, mp_1.get(k), (oldV, newV) -> oldV + newV);
      }
    }
    System.out.println(mp_2.values());

    // и без использования метода merge.
    for (String k : mp_2.keySet()) {
      if (mp_1.containsKey(k)) {
        mp_2.replace(k, mp_2.get(k) + mp_1.get(k));
        mp_1.replace(k, mp_1.get(k) + mp_2.get(k));
      }
    }
    System.out.println(mp_2.values());
  }
}