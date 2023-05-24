package homework;
//  Вычислить n-ое треугольного число (сумма чисел от 1 до n), 

// n! (произведение чисел от 1 до n)

public class task_01 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int n = (int) (Math.random() * 10);
    System.out.println("треугольное число = T" + n);
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
      if (i != n) {
        System.out.print(i + " + ");
      } else {
        System.out.print(i + " = ");
      }
    }
    System.out.println(sum);
    System.out.println();

    int fact = (int) (Math.random() * 10);
    System.out.println("факториал = " + fact + "!");
    int mult = 1;
    for (int i = 1; i <= fact; i++) {
      mult = mult * i;
      if (i != fact) {
        System.out.print(i + " * ");
      } else {
        System.out.print(i + " = ");
      }
    }
    System.out.println(mult);
  }
}
