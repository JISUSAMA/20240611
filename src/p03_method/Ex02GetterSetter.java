package p03_method;

public class Ex02GetterSetter {
  public static void main(String[] args) {
    Person p1 = new Person();
    //속성에 private을 붙이면 외부에서 접근불가
    //p1.id = "admin";
    //p1.pass = "1234";
    //p1.pass = "1111";
    System.out.println(p1.getName("admin"));
  }
}

//incapsulation
class Person {

  private String name;
  private String id;
  private String pass;
  private String moblie;

  public String getName(String name) {
    return name;
  }
}
