package p06_javalang;

public class Ex02StringBuffer {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("hello");
    System.out.println(sb.hashCode());
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    sb.append(" world");
    System.out.println(sb);
    System.out.println(sb.hashCode());
    System.out.println(sb.delete(4,6));
    System.out.println(sb.insert(4,"o "));
    System.out.println(sb.reverse());
    StringBuffer sb2= new StringBuffer("나랏말싸미 뒹국에 달아 백성이 이르고저 할배");
    System.out.println(sb2.reverse());

  }
}
