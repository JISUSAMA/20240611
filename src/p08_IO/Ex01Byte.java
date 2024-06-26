package p08_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01Byte {
  public static void main(String[] args) {
    byte[] inSrc ={0,1,2,3,4,5,6,7,8,9};
    byte[] outSrc= null;

    ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    System.out.println(Arrays.toString(inSrc));

    int data =0;
    while((data = input.read()) != -1)
    {
      output.write(data);
    }
    outSrc = output.toByteArray();
    System.out.println(Arrays.toString(outSrc));

    byte[] tmp = new byte[4];
    input = new ByteArrayInputStream(inSrc);
    output = new ByteArrayOutputStream();
    while(input.available() >0){
      try {
        //input을 읽어서 tmp에 담음, read가 읽은 글자수를 반환함
        int length = input.read(tmp);
        output.write(tmp);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
