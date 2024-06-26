package p07_Collection;

import p05_Inherit.common.Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex09MapApplicate {
  private static Map phoneBook = new HashMap();

  public static void main(String[] args) {
    addPhone("친구", "김수한", "010-1111-1110");
    addPhone("친구", "김수둘", "010-1111-1111");
    addPhone("친구", "김수셋", "010-1111-1112");
    addPhone("친구", "김수넷", "010-1111-1113");
    addPhone("마트", "010-1111-1114");

    printBook(phoneBook);
  }

  private static void addPhone(String group, String name, String tel) {
    if(!phoneBook.containsKey(group)){
      phoneBook.put(group,new HashMap<>());
    }
    HashMap book = (HashMap) phoneBook.get(group);
    book.put(name, tel);
  }

  private static void addPhone(String name, String tel) {
    addPhone("기타", name, tel);
  }

  private static void printBook(Map map) {
    System.out.println(map);
    Iterator it = phoneBook.keySet().iterator();
    System.out.println(it);
    while (it.hasNext()){
      String group = (String)it.next();
      HashMap book = (HashMap) phoneBook.get(group);
      System.out.printf("[ %s ] %d 개\n" , group, book.size());
      Iterator subIt = book.entrySet().iterator();
      while (subIt.hasNext()){
         Map.Entry entry = (Map.Entry)subIt.next();
        //Utils.typeOf(entry);
        System.out.printf("[ %s ] [ %s ]\n",entry.getKey(), entry.getValue());
      }
    }

  }

}
/* 숙제
친구 4개
김수한 1110
둘 1112
셋 1113
넷 1114
기타 1개
마트 1114
*/

