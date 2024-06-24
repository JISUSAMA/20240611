package p05_Inherit.common;
import p05_Inherit.Ex10Modifier;

public class Ex10protected extends Ex10Modifier {
  String str = protectedVar;
  Ex10Modifier ex10Modifier = new Ex10Modifier();
  void done(){
    System.out.println(ex10Modifier.publicVar);
    System.out.println(str);
    //System.out.println(ex10Modifier.protectedVar);
    //System.out.println(ex10Modifier.defaultVar);
    //System.out.println(ex10Modifier.privateVar);
  }
}