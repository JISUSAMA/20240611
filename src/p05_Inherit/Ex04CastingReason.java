package p05_Inherit;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer person = new Buyer();
    person.money = 1000;
    Tv tv = new Tv();
    Laptop laptop = new Laptop();
    Audio audio = new Audio();

    person.Buyer_Buy(tv);
    System.out.printf("남은돈 1: %d \n", person.money);
    person.Buyer_Buy(laptop);
    System.out.printf("남은돈 2: %d \n", person.money);
    person.Buyer_Buy(audio);
    System.out.printf("남은돈 3: %d \n", person.money);
  }
}

class Buyer {
  int money;
  void Buyer_Buy(Product product) {
     money -= product.price;
  }
}
abstract class Product {
  String p_name;
  String p_modle;
  int price;
  public Product(int price) {
    this.price = price;
  }
}
class Tv extends Product {
  public Tv(){
    super(20);

  }
}
class Laptop extends Product{
  public Laptop() {
    super(30);
  }
}
class Audio extends Product {
 public Audio(){
   super(40);
 }
}
