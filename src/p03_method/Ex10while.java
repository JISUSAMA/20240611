package p03_method;

import javax.swing.*;

public class Ex10while {
  public static void main(String[] args) {
    //조건, 명령
    int i = 0;
    int sum = 0;
    while (i < 10) {
      // sum +=i;
      // i++;
      sum += i++;
    }
    i = 2;
    int j = 1;
    while (j < 10) {
      i = 2;
      while (i < 10) {
        System.out.printf("%d * %d = %2d \t", i, j, i++ * j);
      }
      j++;
      System.out.println();
    }
  /*
    System.out.println("=======내 마음의 숫자를 맞추기 게임=======");
    boolean stop = false;
    while (true) {
      int random = (int) (Math.random() * 100) + 1;
      if (stop) break;
      while (true) {
        String input = JOptionPane.showInputDialog("숫자를 입력하세요(종료하려면 Q,q)");
        if (input.toLowerCase().equals("q")) {
          stop = true;
          break;
        } else {
          int answer = Integer.parseInt(input);
          if (answer > random) {
            System.out.printf("%d 보다 작습니다.\n", answer);
          } else if (answer < random) {
            System.out.printf("%d 보다 큽니다.\n", answer);
          } else {
            System.out.println("정답입니다.");
          }
        }
      }
   }*/

    //do~while
    //
    do {
      //int you =
      String input = JOptionPane.showInputDialog("가위(0), 바위(1), 보(2) 중에 입력하세요!");
      int me = 3;
      try {
        me = Integer.parseInt(input);
      } catch (Exception e) {
        //Exception 이 발생하면 무조건 처음으로 돌아감
        continue; // 반복문 처음으로 돌아감
      }
    } while(true);
  }
}
