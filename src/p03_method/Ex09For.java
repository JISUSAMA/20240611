package p03_method;

import javax.swing.*;

public class Ex09For {
  public static void main(String[] args) {
    int sum = 0; //지역변수는 반드시 초기화
    //반복문을 구현할 때,
    //1. 패턴을 찾아라
    //2. 초기값, 조건식, 증감식 을 적용하여 구현

    for (int i = 0; i < 10; i++) sum = sum + i;
    System.out.println(sum);
    sum = 0;
    for (int i = 9; i >= 0; --i)
      sum = sum + i;
    System.out.println(sum);

    DanPrint dPrint = new DanPrint();
    String input = JOptionPane.showInputDialog("출력 원하는 단을 입력하세요!");
    dPrint.print_dan(Integer.parseInt(input));
    System.out.print("------------------------------------\n");
    dPrint.printAllDan();
    //비교적 횟수에 대한 예측이 가능할 때 사용함
    int i=0;
    for( ; ;){
      if(i>10) break;
      System.out.println(i++);
    }
  for(int k=10, j=0; j <10 || k>0 ; j++, k--){

  }
  }
}

class DanPrint {
  void print_dan(int dan) {
    System.out.println(dan + "단");
    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
    }
  }

  void printAllDan() {
//    for (int j = 1; j < 10; j++) {
//      for (int i = 2; i < 5; i++) {
//        System.out.printf("%d * %d = %2d\t", i, j, i * j);
//      }
//      System.out.println();
//    }
//    for (int j = 1; j < 10; j++) {
//      for (int i = 5; i < 8; i++) {
//        System.out.printf("%d * %d = %2d\t", i, j, i * j);
//      }
//      System.out.println();
//    }
//    for (int j = 1; j < 10; j++) {
//      for (int i = 8; i < 10; i++) {
//        System.out.printf("%d * %d = %2d\t", i, j, i * j);
//      }
//      System.out.println();
//    }

    for (int i = 2; i < 10; i += 3) {
      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {
          if(i+k != 10){
            System.out.printf("%d * %d = %2d \t",
                i + k, j, (i + k) * j);
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }

}