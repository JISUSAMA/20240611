package p07_Collection;

import java.util.HashMap;
import java.util.Map;

public class Ex09MapApplicate {
  private static Map phoneBook = new HashMap();
  public static void main(String[] args) {
    addPhone("친구","김수한", "010-1111-1110");
    addPhone("친구","김수한", "010-1111-1111");
    addPhone("친구","김수한", "010-1111-1112");
    addPhone("친구","김수한", "010-1111-1113");
    addPhone("마트","010-1111-1114");

    printBook(phoneBook);
  }

  private static void addPhone(String  type, String name, String number)
  {

  }
  private static void addPhone(String type, String number)
  {

  }
  private static void printBook(Map map)
  {

  }
}