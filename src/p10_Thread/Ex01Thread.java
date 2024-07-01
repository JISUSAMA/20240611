package p10_Thread;

import javax.swing.*;

public class Ex01Thread {
  public static void main(String[] args) {
    Bomb bomb = new Bomb();
    //Thread를 상속 받으면 그 자체로 start()를 적용할 수 잇다
//    bomb.start(); //Thread 동작 시작!

    //Runnalbe 을 implement 하면 Thread() 생성자 안에
    //매개변수로 전달해야만 생성 가능
    new Thread(bomb).start();
    int input = Integer.parseInt(JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중에 선택하세요!"));
    bomb.choice(input);
  }
}
//Thread 를 생성하는 방법 : 1)Thread를 상속 2) Runnable을 implement
class Bomb extends Thread {
  int answer = (int) (Math.random() * 2);
  boolean state_b = false;

  //run : Thread의 동작을 할 때 정의한 메서드
  @Override
  public void run() {
    state_b = true;
    for (int i = 10; i > 0; i--) {
      if (state_b) {
        System.out.println(i);
        try {
          Thread.sleep(1000);
          if (!state_b) break;
          System.out.println("돌아가는중");
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

  void choice(int input) {
    if (input == answer) {
      System.out.printf("input : %d , answer : %d || 살았다!", input, answer);
    } else {
      System.out.printf("input : %d , answer : %d || 꽝!", input, answer);
    }
    state_b = false;
  }
}
