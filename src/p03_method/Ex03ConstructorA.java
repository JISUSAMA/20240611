package p03_method;

public class Ex03ConstructorA {
  public static void main(String[] args) {
    //Employee e = new Employee("박지수", 11, "2024-06-18", 29, "여");
    //System.out.println(e.getEname());
    Employee e1 = new Employee();
    Employee e2 = new Employee();
  }
}

class Employee {
  //초기화 블럭
  {
    System.out.println("Initial Block instance");
  }
  static {
    System.out.println("Initial Block static");
  }

  private String ename;
  private int number;
  private String hiredate;
  private int age;
  private String gender;

  //  public  Employee(){
  //  this("박지수", 11, "2024-06-18", 29, "여" );
  //  }
  public Employee() {
  }

  public Employee(String ename, int number, String hiredate, int age, String gender) {
    this.ename = ename;
    this.number = number;
    this.hiredate = hiredate;
    this.age = age;
    this.gender = gender;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String isGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}

