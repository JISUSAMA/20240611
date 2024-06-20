package p04_Array;

import java.util.Arrays;

public class Ex02applicate {
  public static void main(String[] args) {
    int [] score = new int[10];
    for (int i = 0; i < 10; i++) {
      score[i]= (int)((Math.random()*(100-70+1)+70));
      System.out.println(score[i]);
    }
//    while()
//    System.out.println(Arrays.toString(score));
//    prArr(score);
    System.out.println("------------------------------");
    maxArr(score);
    System.out.println("------------------------------");
    minArr(score);
    System.out.println("------------------------------");
    int sum =sumArr(score);
    double avg = avgArr(score);
    System.out.printf("합계 : %d , 평균 : %.2f", sum, avg);
  }
  public static int sumArr(int [] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static double avgArr(int[]arr){
    double avg =0;
    avg =  sumArr(arr)/(double)arr.length;
    return avg;
  }
  public static void prArr(int []arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if(i != arr.length-1){
        System.out.print(",");
      }
    }
    System.out.println();
  }

  public static void maxArr(int [] arr){
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>max){
        max = arr[i];
      }
    }
    prArr(arr);
    System.out.printf("최대값 : %d\n",max);
  }
  public static void minArr(int[]arr){
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    prArr(arr);
    System.out.printf("최소값 : %d\n",min);
  }
}
