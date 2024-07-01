package p12_database.vo;

public class Members {
  private long mno;
  private String id, pass, name, mobile;

  //회원 가입할 때
  public Members(String id, String pass, String name, String mobile) {
    this.id = id;
    this.pass = pass;
    this.name = name;
    this.mobile = mobile;
  }
  // 데이터베이스에서 불러와서 전송할 때
  public Members(long mno, String id, String pass, String name, String mobile) {
    this.mno = mno;
    this.id = id;
    this.pass = pass;
    this.name = name;
    this.mobile = mobile;
  }
}
