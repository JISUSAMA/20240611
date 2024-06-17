package p02_variable;

import common.Utils;

public class Ex07double {
  //정수형(int, long)의 대표는 int
  //실수형(float(정밀도: 소수 7자리), double(정밀도: 소수 13자리)의 대표는 double
  public static void main(String[] args) {
    float f1 = 0.0f;
    double d1 =0.0; //d생략가능
    Utils.typeOf(0.0);
    Utils.typeOf(0.0f);
    int i1 =10;
    long l1 = 1000;
    Utils.typeOf(0.0f+ i1);
    Utils.typeOf(0.0f+ l1); //표현범위 큰 타입으로 형변환
    Utils.typeOf(f1+ d1);

    d1 = f1; //double = float  :: 묵시적 형변환
    f1 = (float) d1; // 명시적 형변환 필요!
  }
}
