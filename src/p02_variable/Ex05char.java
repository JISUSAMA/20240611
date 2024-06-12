package p02_variable;

import common.Utils;
import p01_class.Animal;

public class Ex05char {
  char chr;
  public static void main(String[] args) {
    char c1 = 'A';
    System.out.println("c1: "+c1);
    Utils.typeOf(c1);
    System.out.println("(int)c1: "+(int)c1);
    System.out.println("형변환1: "+ c1+(int)c1);
    Utils.typeOf("형변환1 :" + c1+(int)c1);
    System.out.println("형변환2: "+ (c1+c1)); //연산할 경우,int로 형변환
    Utils.typeOf(c1+c1);
    System.out.println("형변환3: "+ (c1+(int)c1));
    System.out.println(c1+(int)c1);

    char c2 ='a'; //97
    System.out.println((int)c2);
    char c3 = '0'; //48
    System.out.println((int)c3);
    Utils.typeOf(new Animal()); //type : Animal
//    char c4=''; //에러

    Ex05char ex05char = new Ex05char();
    System.out.println(ex05char.chr); //공백
    System.out.println((int)ex05char.chr); //공백
    //공백의 hexa 코드값은 '\u0000', ' '
    Utils.typeOf(ex05char.chr);
    if(ex05char.chr == ' '){
      System.out.println("공백");
    }
  }
}
