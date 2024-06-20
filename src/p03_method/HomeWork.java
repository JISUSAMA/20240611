package p03_method;

import javax.swing.*;

public class HomeWork {
  //가위바위보게임 만들기
  public static void main(String[] args) {
    int me;
    do {
      int you = (int) (Math.random() * 2);
      String input = JOptionPane.showInputDialog("가위(0), 바위(1), 보(2) 중에 입력하세요!");
      me = Integer.parseInt(input);
      int result = me - you;
      if(result == -2  ||  result ==1)
      {
        System.out.printf("이겼습니다! COM : %d ME: %d ", you, me);
      }
      else if(result ==0){
        System.out.printf("비겼습니다 COM : %d ME: %d ", you, me);
      }
      else if(result == -1 || result==2 ){
        System.out.printf("졌습니다 COM : %d ME: %d ", you, me);
      }
      try {
        me = Integer.parseInt(input);
      } catch (Exception e) {
        continue;
      }
    }
    while (true);
  }
}