package Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Program_1 {
  public static void main(String[] args) throws Exception {
    System.out.println("введите 1, чтобы продолжить или нажми что угоднов для выхода");
    Scanner sc = new Scanner(System.in);
    String answer = sc.nextLine();
    if (answer.equals("1")) {
      ArrayList<String> ls = new ArrayList<>();
      BufferedReader br = new BufferedReader(
          new FileReader("D:\\программирование\\Обучение_тестировщик\\java\\Java\\text.txt"));
      String str;
      while ((str = br.readLine()) != null) {
        ls.add(str);
        System.out.printf("%s\n", str);
      }
      br.close();
      System.out.println(ls);
      ls.sort(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          int a = Integer.parseInt(o1.split(" ")[3]);
          int b = Integer.parseInt(o2.split(" ")[3]);
          return a - b;
        }
      });
      System.out.println(ls);
    } else {
      System.out.println("конец работы");
    }
  }
}
