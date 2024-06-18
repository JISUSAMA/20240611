package p03_method;

public class Ex03Constructor {
  public static void main(String[] args) {
    Car gv70 = new Car(); //인스턴스를 만들면서 초기화 됨
    // 기본 생성자로 인해서 Black으로 기본값이 출력됨
    System.out.println(gv70.getColor());
  }
}

//클래스 명과 동일한 메소드를 기본 생성자라고 함
//JVM에 의해서 기본적으로 생성되어 있음
class Car {
  public Car() {
    //생성자는 없어도 기본 생성자가 자동으로 생성
    //생성자는 new에 의해서 인스턴스가 생성
    //생성자도 Overloading이 된다
    //사용자가 생성자를 등록하면 기본 생성자는 자동추가 안됨.

    //this 는 자신이 속한 클래스 .자신이 속한 멤버변수(속성)
    this("gv80", "white", "hd");

    model = "gv70";
    color = "black";
    maker = "HD";

  }

  public Car(String model, String color, String maker) {
    this.model = model;
    this.color = color;
    this.maker = maker;
  }

  private String model;
  private String color;
  private String maker;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }
}
