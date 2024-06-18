package p03_method;

import java.util.Scanner;

public class Ex07if {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      //입력하는 방법 01
      System.out.print("성적 입력(0 입력시 종료_): ");
      int input = sc.nextInt();
      String reault = "";

      //입력하는 방법 02
      //String score = JOptionPane.showInputDialog("점수를 입력하세요 : ");
      //int input = Integer.parseInt(score);

      //학점 내는 부분
      if (input == 0) {
        System.out.printf("성적 입력을 종료 합니다.");
        break;
      } else if (input >= 90) {
        reault = "A";
      } else if (input >= 80) {
        reault = "B";
      } else if (input >= 70) {
        reault = "C";
      } else if (input >= 60) {
        reault = "D";
      } else {
        reault = "F";
      }
      //학점 디테일 내는 부분
      if(input != 0 && reault != "F"){
        if(input % 10 >= 7 && input %10 <=9) {
        reault += "+";
        }
        else if(input % 10 >= 4 && input %10 <=6) {
          reault += "0";
        }
        else if(input % 10 >= 0 && input %10 <=3) {
          reault += "-";
        }
      }
      //출력하는 부분
      System.out.printf("%s 학점 \n", reault);
    }
  }
}
