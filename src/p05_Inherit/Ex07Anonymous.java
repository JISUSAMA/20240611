package p05_Inherit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07Anonymous {
  public static void main(String[] args) {
    MyButton  myButton = new MyButton();
    Clickable clickable = new Clickable() {
      @Override
      public void click() {
        System.out.println("click");
      }
    };
    new MyFrame();
  }
}
class MyButton implements Clickable {
  @Override
  public  void click(){
    System.out.println("clickMyButton");
  }
}
interface Clickable{
  void click();
}