package p04_Array;

import common.Utils;
import jdk.jshell.execution.Util;

public class Ex01Array {
  public static void main(String[] args) {
    //배열 : 같은 변수의 이름으로 반복되는 작업을 위한 저장 공간
    //배열은 객체이고 객체는 참조형 변수 이다.
    int[] arr = new int[10];
    Utils.typeOf(arr); //int[]
    Object[] objects = new Object[5];
    Utils.typeOf(objects); //Object[]
    String [] strings;
    strings = new String[3];
    Utils.typeOf(strings); //String
    //선언과 초기화를 직접 값 입력해서 선언
    int [] arr1= new int[]{0,1,2,3,4};
    int [] arr2= {0,1,2,3,4};

    System.out.println(arr.length); //arr의 길이 = 10개
    //데이터 접근하기
    System.out.println(arr[0]); // 인스턴스화 되면서 초기화되서 값을 0을 가짐
    //System.out.println(objects[5]); // 배열의 범위(0~4)를 넘어가서 오류 발생
    System.out.println(objects[4]);
    System.out.println(strings[2]);

    arr[0]=1;
    arr[1]=2;

    int sum =0;
    for (int i =0; i<arr.length; i++)
    {
      arr[i] = (int)(Math.random()*10);
      arr[i] = i;
      sum += arr[i];
      System.out.println(arr[i]);
    }
    System.out.println(sum);
  }
}
