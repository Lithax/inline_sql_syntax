public class A {
  public static void main(String[] args) {
    String test = """
      --sql
      SELECT id, name
      FROM users
      WHERE id = 1;
      """;

      String query = "--sql;SELECT FROM AND";

      String notAQuery = "SELECT FROM AND";
  }
}
