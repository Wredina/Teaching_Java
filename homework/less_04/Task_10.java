package homework.less_04;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;

public class Task_10 {
  public static void main(String[] args) throws Exception {

    // 2.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
    // Фамилии, имена, отчества, возрас и пол в отдельных списках.
    LinkedList<String> ll = new LinkedList<>();
    LinkedList<String> f_name = new LinkedList<>();
    LinkedList<String> s_name = new LinkedList<>();
    LinkedList<String> l_name = new LinkedList<>();
    LinkedList<Integer> age = new LinkedList<>();
    LinkedList<Boolean> gender = new LinkedList<>();
    LinkedList<Integer> id = new LinkedList<>();
    // 1.Загрузить из файла многострочный текст формата ФИО возраст и пол через
    // пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
    BufferedReader br = new BufferedReader(
        new FileReader("D:\\программирование\\Обучение_тестировщик\\java\\homework\\less_04\\file.txt"));
    String str;
    while ((str = br.readLine()) != null) {
      ll.add(str);
      String[] arr = str.split(" ");
      id.add(age.size()); // хранит индексы
      f_name.add(arr[0]);
      s_name.add(arr[1]);
      l_name.add(arr[2]);
      age.add(Integer.valueOf(arr[3]));
      gender.add(arr[4].toLowerCase().contains("м"));

      // System.out.printf("%s\n", str);
    }

    // 3.Отсортировать по возрасту используя дополнительный список индексов.
    Boolean flag = false;
    while (flag == false) {
      flag = true;
      for (int i = 0; i < age.size() - 1; i++) {
        if (age.get(id.get(i)) > age.get(id.get(i + 1))) {
          flag = false;
          int num = id.get(i);
          id.set(i, id.get(i + 1));
          id.set(i + 1, num);
        }
      }
    }

    // 4.Отсортировать по полу используя дополнительный список индексов.
    id.sort(new Comparator<Integer>() {
      public int compare(Integer o1, Integer o2) {
        if (gender.get(o1))
          return -1;
        if (!gender.get(o2))
          return 1;
        return 0;
      }
    });

    // 5.*Сортировка по полу и возрасту.
    id.sort(new Comparator<Integer>() {
      public int compare(Integer o1, Integer o2) {
        if (gender.get(o1) && age.get(o1) < age.get(o2))
          return -1;
        if (!gender.get(o2) && age.get(o1) < age.get(o2))
          return 1;
        return 0;
      }
    });

    for (int i = 0; i < age.size(); i++) {
      String str_gen;
      if (gender.get(id.get(i))) {
        str_gen = "м";
      } else {
        str_gen = "ж";
      }
      System.out.println(f_name.get(id.get(i)) + " " + s_name.get(id.get(
          i)).toUpperCase().charAt(0) + "."
          + l_name.get(id.get(i)).toUpperCase().charAt(0) + ". " + age.get(id.get(i)) + " "
          + str_gen);
    }
    br.close();

  }
}
