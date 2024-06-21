package p05_Inherit;

import java.util.Objects;

public class Ex05Override {
  public static void main(String[] args) {
    Data d1 = new Data(1);
    Data d2 = new Data(1);
    System.out.println(d1);
    System.out.println(d2);
    //주소값이 같아서 ,출력되지 않음 => 숫자를 비교함
    if (d1 == d2) {
      System.out.println("같다");
    }
    //equals를 재정의 해주어야함
    if (d1.equals(d2)) {
      System.out.println("같다");
    }
  }
}

class Data {
  int value;

  public Data(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "value : " + value;
  }

  //  @Override // 생략 가능
  public boolean equals(Object obj) {
    if (obj instanceof Data) {
      Data d = (Data) obj;
      return value == d.value;
    }
    return false;
  }

  @Override
  public int hashCode() {
    //hashCode의 값이 동일할 때
    return Objects.hash(value);
  }
}
