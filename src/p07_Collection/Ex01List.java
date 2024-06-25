package p07_Collection;

import p05_Inherit.common.Utils;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;

public class Ex01List {
  public static void main(String[] args) {
    List list = new ArrayList();
    List<Member> list2 = new ArrayList(); //Member type 만 받음 :: 제네릭스
    list.add(new Member("hgd", "1", "홍길동"));
    list.add(new Member("kgd", "2", "김길동"));
    list.add(new Member("jgd", "3", "정길동"));
    System.out.println(list);
    //for index
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
      Utils.typeOf(list.get(i));
    }
    //enhanced for
    for (Object o : list) {
      System.out.println(o);
      Utils.typeOf(o);
    }
    //interator
    Iterator it = list.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }
    //foreach
    list.forEach(new Consumer() {
      @Override
      public void accept(Object o) {
        System.out.println("forEach: " + o);
        Utils.typeOf(o);
      }
    });
    list.forEach(o -> {
      System.out.println("람다식: " + o);
      Utils.typeOf(o);
    });
    class ObjConsumer implements Consumer {
      String lists = "";

      @Override
      public void accept(Object o) {
        lists += o;
        System.out.println("forEach: " + o);
        Utils.typeOf(o);
      }
    }
    ObjConsumer oc = new ObjConsumer();
    list.forEach(oc); //list.forEach(Consumer consumer)
    System.out.println(oc.lists);
    list.addAll(new ArrayList(5));
    System.out.println(list.isEmpty());
    // list.clear();

    System.out.println(list.contains(10));

  }

}

class Member {
  private String id;
  private String pass;
  private String name;

  public Member(String id, String pass, String name) {
    this.id = id;
    this.pass = pass;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //Ctrl+o 사용하면 자동생성 가능
  @Override
  public String toString() {
    return String.format("%s(ID : %s)", name, id);
  }
}
