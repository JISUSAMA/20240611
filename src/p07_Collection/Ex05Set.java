package p07_Collection;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Ex05Set {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet(); //boxing
    set.add(4); set.add(4);
    set.add(2); set.add(3);
    System.out.println(set);
    set.add(1); set.remove(4);
    System.out.println("Set1: "+set);
    for (int i : set) {
      //unboxing
      System.out.println(i);
    }

    Iterator it = set.iterator();
    while (it.hasNext()) System.out.println(it.next());
    System.out.println("------------------");
    Lotto lotto = new Lotto();
    lotto.Start();
    System.out.println("------------------");
    Set<Integer> lotto2 = new HashSet<>();
    while(lotto2.size()<6){
      lotto2.add((int)(Math.random()*45)+1);
    }
    ArrayList list3 = new ArrayList(lotto2);
    Collections.sort(list3);
    System.out.println(list3);

    //정렬이 되어서 나옴
    Set<Integer> lotto3 = new TreeSet<>();
    while (lotto2.size() <6 ){
      lotto2.add((int)(Math.random()*45)+1);
    }
    System.out.println(lotto3);
  }
}

class Lotto{
  void Start(){
    Set<Integer> number = new HashSet();
    while(number.size()<7)
    {
      int randomNum = (int)(Math.random()*(42)+1);
      if(!number.contains(randomNum)){
        number.add(randomNum);
        if(number.size() == 7){
          System.out.printf("보너스 : %d \n",randomNum);
        }
        else{
          System.out.printf("당첨번호 : %d \n",randomNum);
        }
      }
    }
    System.out.println(number);
  }
}