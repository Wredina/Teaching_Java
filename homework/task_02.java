package homework;

// 2) Вывести все простые числа от 1 до 1000
public class task_02 {
  public static void main(String[] args) {
    int num = 0;
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < 1000; j++) {
        if (i != j && i > j) {
          if (i % j == 0) {
            num = i;
            j = 1000;
          }
        }
      }
      if (num != i) {
        System.out.print(i + " ");
      }
    }
  }
}
