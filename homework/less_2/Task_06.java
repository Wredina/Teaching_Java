package homework.less_2;

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task_06 {
  /**
   * @param args
   */

  public static void main(String[] args) {
    StringBuilder requestPart = new StringBuilder();

    String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    s = s.replace("{", "");
    s = s.replace("}", "");
    String[] filters = s.split(", ");

    for (String filter : filters) {
      String[] keyValue = filter.split(":");
      String key = keyValue[0].replace("\"", "");
      String value = keyValue[1].replace("\"", "");

      if (!"null".equals(value)) {
        if (requestPart.length() > 0) {
          requestPart.append(" AND ");
        }
        requestPart
            .append(key).append(" = '")
            .append(value).append("'");
      }
    }

    String sqlQuery = "SELECT * FROM students WHERE " + requestPart;
    System.out.println(sqlQuery);
  }

}
