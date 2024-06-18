package p03_method;

public class Ex02GetterSetter {
  public static void main(String[] args) {
    Person p1 = new Person();
    //속성에 private을 붙이면 외부에서 접근불가
    //p1.id = "admin";
    //p1.pass = "1234";
    //p1.pass = "1111";

    p1.setName("JSP");
    p1.setId("admin");
    p1.setPass("11111");
    p1.setMoblie("010-3446-7374");
    p1.PrintData();
    System.out.println(p1.getName());
  }
}
//incapsulation
class Person {

  private String name;
  private String id;
  private String pass;
  private String moblie;

  //사람이라는 틀을 만들어준 것
  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getId() {
    return id;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getPass() {
    return pass;
  }
  public void setPass(String pass){
    this.pass = pass;
  }
  public String getMoblie() {
    return moblie;
  }
  public void setMoblie(String moblie){
    this.moblie = moblie;
  }
  public void PrintData(){
    System.out.println(this.name);
    System.out.println(this.id);
    System.out.println(this.pass);
    System.out.println(this.moblie);
  }
}
