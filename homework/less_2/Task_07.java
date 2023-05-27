package homework.less_2;

import java.util.Arrays;

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации вывести в консоль.
public class Task_07 {
  public static void main(String[] args) {
    int[] arr = { 3, 5, 2, 6, 1, 8, 0 };
    Boolean flag = false;

    while (flag == false) {
      flag = true;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          flag = false;
          int num = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = num;
          System.out.println(Arrays.toString(arr)); // поставила сюда, что было видно именно движение цифр в массиве
        }

      }
    }
  }
}
