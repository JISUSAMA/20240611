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
    System.out.println("내 마음의 숫자를 맞춰봐 (1~100)");
    int random  = (int)(Math.random()*100)+1;
    int count = 0;
    System.out.println(random);
    while(true){
      int answer =Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요! (1~100)"));
      if(random == answer){
        System.out.printf("정답 입니다! 정답은 %d 시도 횟수 : %d\n",answer,count);
        break;
      }
      else if(random > answer){
        count++;
        System.out.printf("%d 보다 값이 큽니다! 시도 횟수 : %d\n",answer,count);
      }
      else if(random < answer){
        count++;
        System.out.printf("%d 보다 값이 작습니다! 시도 횟수 : %d\n",answer,count);
      }
    }
  }
}
