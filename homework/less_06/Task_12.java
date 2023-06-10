package homework.less_06;

import java.util.HashMap;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task_12 {
  public static void main(String[] args) {
    // Разработать программу, имитирующую поведение коллекции HashSet.
    MySet<Integer> num = new MySet<>();
    for (int i = 0; i < 10; i++) {
      num.addN(new Random().nextInt(10));
    }

    num.myString();

    System.out.println(num.myIndex(new Random().nextInt(10)));
    System.out.println(num.myRemove(new Random().nextInt(10)));
    System.out.println(num.myContains(new Random().nextInt(10)));

    Iterator<Integer> iter = num.iterator();
    while (iter.hasNext()) {
      int a = iter.next();
      if (a % 2 == 0) {
        System.out.println(a);
      }
    }

  }
}

class MySet<T> {
  private HashMap<T, Object> myMap = new HashMap<>();
  private final static Object OBJ = new Object();

  // В программе содать метод add добавляющий элемент
  public boolean addN(T i) {
    return myMap.put(i, OBJ) == null;
  }

  // метод toString возвращающий строку с элементами множества
  public void myString() {
    System.out.println(myMap.keySet().toString());
  }

  // метод позволяющий читать элементы по индексу
  public T myIndex(Integer i) {
    int indx = 0;
    for (T el : myMap.keySet()) {
      if (indx == i) {
        return el;
      } else {
        indx++;
      }
    }
    return null;
  }

  // *Реализовать все методы из семинара.
  public boolean myRemove(T i) {
    return myMap.remove(i) == OBJ;
  }

  public boolean myContains(T i) {
    return myMap.containsKey(i);
  }

  // public String forString(){
  // StringBuilder str = new StringBuilder("[");
  // Iterator<T> iter = myMap.keySet().iterator();

  // while(iter.hasNext()){
  // str.append(iter.next() + ",");
  // }
  // str.append("]");
  // return str.toString();
  // }

  public Iterator iterator() {
    return (Iterator) myMap.keySet().iterator();
  }
}
