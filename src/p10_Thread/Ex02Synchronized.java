package p10_Thread;

public class Ex02Synchronized {

  public static void main(String[] args) {
    Customer customer = new Customer();
    //인터페이스는 재정의한 메서드만 가져와서 사용할 수 있다
    //즉, customer 안에이있는 run() 만 사용함
    new Thread(customer).start();
    new Thread(customer).start();
  }
}

class Account {
  int balance = 1000;

  public int getBalance() {
    return balance;
  }

  synchronized public void withdraw(int money) {
    if (balance >= money) {
      try {
        Thread.sleep(300);
      } catch (Exception e) {
      }
      balance -= money;
    }
  }
}

class Customer implements Runnable {
  Account acc = new Account();

  @Override
  public void run() {
    while (acc.getBalance() > 0) {
      int money = (int) (Math.random() * 3 + 1) * 100;
      acc.withdraw(money);
      System.out.println("잔액 : " + acc.getBalance());
    }
  }
}
