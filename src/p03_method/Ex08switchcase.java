package p03_method;

import javax.swing.*;

public class Ex08switchcase {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("당신이 태어난 달 입력 :");
    int birthMonth = Integer.parseInt(input); //int 형으로 변경
    String result = "";
    //switch(입력 받은 값)
    switch (birthMonth) {
      case 12, 1, 2:
        result = "겨울";
        break;
      case 3, 4, 5:
        result = "봄";
        break;
      case 6, 7, 8:
        result = "여름";
        break;
      case 9, 10, 11:
        result = "가을";
        break;
      default:
        result = "계절";
        break;
    }
    System.out.printf("입력 받은 월 : %d월, %s \n",birthMonth,result);

    input = JOptionPane.showInputDialog("당신의 이름을 입력 : ");
    //substring (시작 위치,시작 위치에서 몇번째 글자 까지 받아올 것인지)
    String familyName = input.substring(0, 1);
    switch (familyName) {
      case "김":
        System.out.println("Kim");
        break;
      case "이":
        System.out.println("Lee");
        break;
      case "박":
        System.out.println("Park");
        break;
      case "성":
        System.out.println("Seong");
        break;
      case "최":
        System.out.println("Choi");
        break;
      case "정":
        System.out.println("Jung");
        break;
    }
  }

}
