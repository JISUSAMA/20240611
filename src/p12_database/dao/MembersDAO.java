package p12_database.dao;

import p12_database.vo.Members;

import java.sql.SQLException;

public class MembersDAO extends DAOSet {
  /*
   * 로비 ->  로그인 버튼 누르면 dao loginCheck;,회원가입, 닫기
   * 회원가입 창 -> 정보입력, 가입 버튼, 닫기 버튼
   * 로그인 성공 -> 메인창
   * */
  public Members loginCheck(String id, String pw) {
    Members members = null;
    try {
      conn = connectDB();
      String sql = "select * from members where id=? and pass=? ";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      pstmt.setString(2, pw);
      rs = pstmt.executeQuery(); //결과
      if (rs.next()) {
        members = new Members(rs.getLong("mno"), rs.getString("id")
            , rs.getString("pass"), rs.getString("name"), rs.getString("mobile"));
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      closeDB(); //접속 종료
    }
    return members;
  }
}
