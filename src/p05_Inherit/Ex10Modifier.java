package p05_Inherit;

import p05_Inherit.common.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10Modifier {

  //접근 제어자
  public String publicVar;
  protected String protectedVar; //p05_Inherit.common 패키지에서 사용
  String defaultVar;
  private String privateVar;

  //메서드 앞에도 접근 제어자 4가지가 다 붙을 수 있다
  public static void main(String[] args) {
//  private int num=1; // 지역변수 선언 불가
    final int result = 10;//final이 붙은 지역변수는 변경불가
    new JButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(result); //상수라서 사용은 가능하지만
//        result =10;  //지역변수는 익명객체에서 변경이 불가능하다
      }
    });

    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);

    var name = "LGH";
    Utils.typeOf(name);

    //    var name2;
//    name2 ="LGH";
//    Utils.typeOf(name);
  }
}

final class FinalClass {
}
//class FinalParents extends FinalClass{}
