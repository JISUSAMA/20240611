package p07_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex07TreeSet {
  public static void main(String[] args) {
    TreeSet set = new TreeSet();
    set.add(new Ball(4));
    set.add(new Ball(1));
    set.add(new Ball(3));
    set.add(new Ball(4));
    System.out.println(set);
  }
}

class Ball implements Comparable {
  private int num;
   public Ball(int num) {
    this.num = num;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Ball){
      Ball b = (Ball)o;
      //뺄 때 0 같다. 음수 작다, 양수 크다
      return num-b.num; //순차 정렬
      //return -(num-b.num); //역정렬
    }
    return 0;
  }

  @Override
  public String toString() {
    return num+" ";
  }
}

