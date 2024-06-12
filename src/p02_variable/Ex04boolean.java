package p02_variable;

//byte , short, int ,long
//java에서는 연산때 4바이트 사용
class TV {
  boolean power;
  int channel;
  int volume;
  // 메소드 => 리턴타입 함수명() {}
  void power(){
    //1
    if(power == false){
      power = true;
      System.out.println("전원이 켜졌습니다.");
    }
    else{
      power = false;
      System.out.println("전원이 꺼졌습니다.");
    }
    // 2 :a+b(이항 연산자), a++(단항 연산자), a?b:c (삼항 연산자)
    // power =!power;
    // System.out.println(power ? "전원이 ON" : "전원 OFF");
  }
  void ChannelUp(){
    if(power){
      //방법 1
      channel++;
      System.out.println("채널 UP "+channel);
      //방법 2
      System.out.println("채널 UP "+ ++channel);
      //방법 3
      channel+=1;
      System.out.println("채널 UP "+channel);
    }
  }
  void ChannelDown(){
    if(power){
      //방법 1
      channel--;
      System.out.println("채널 DOWN "+channel);
      //방법 2
      System.out.println("채널 DOWN "+ --channel);
      //방법 3
      channel-=1;
      System.out.println("채널 DOWN "+channel);
    }
  }
  void setChannel(int channel){
    this.channel = channel;
  }
  void VolumeUP(){
    if(power){
      //방법 1
      volume++;
      System.out.println("볼륨 UP "+volume);
      //방법 2
      System.out.println("볼륨 UP "+ ++volume);
      //방법 3
      volume+=1;
      System.out.println("볼륨 UP "+volume);
    }
  }
  void VolumeDown(){
    if(power){
      //방법 1
      volume--;
      System.out.println("볼륨 DOWN "+volume);
      //방법 2
      System.out.println("볼륨 DOWN "+ --volume);
      //방법 3
      volume-=1;
      System.out.println("볼륨 DOWN "+volume);
    }
  }
}

public class Ex04boolean {
  public static void main(String[] args) {
    TV tv1 = new TV();  //인스턴스 생성, new(생성 연산자)로 초기화 시켜줌
    System.out.println(tv1); //전체를 출력
    tv1.power();

    //매개변수 사용
    tv1.setChannel(12);

    tv1.ChannelUp();
    tv1.ChannelDown();
    tv1.VolumeUP();
    tv1.VolumeDown();


   // tv1.power();
  }
}
