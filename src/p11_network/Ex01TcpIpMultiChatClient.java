package p11_network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//1. 입력후 글자 지워짐
//2. 외부메세지를 textArea 에 보이게하기
//3. 스롤내려가게 만들기
//4. 메세지 공백 안보내지게

public class Ex01TcpIpMultiChatClient extends JFrame {

  public static void main(String[] args) {
    new Ex01TcpIpMultiChatClient();
  }

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private String nickname;
  private DataOutputStream out;

  public Ex01TcpIpMultiChatClient() throws HeadlessException {
    init();
    arrange();
    inflate();
  }

  private void init() {
    nickname = JOptionPane.showInputDialog("Input Nickname");
    //10.100.204.26
    String ip = JOptionPane.showInputDialog("Server IP", "119.198.179.248");

    ta = new JTextArea();
    ta.setEditable(false); //텍스트 수정 가능 여부
    scp = new JScrollPane(ta);
    tf = new JTextField();
    //폰트 관련
    ta.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
    tf.setFont(new Font("맑은 고딕", Font.PLAIN, 20));

    //소켓 생성 , 입출력은 try catch 문이 따라옴
    try {
      Socket socket = new Socket(ip,7777);
      out = new DataOutputStream(socket.getOutputStream());
      out.writeUTF(nickname);
      new Thread(new Reciver(socket)).start(); //implements Runnable
//      new Reciver().start(); //extends Thread

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    //메세지 보내기 기능
    tf.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          if(!tf.getText().equals("")){
            System.out.println("입력됨!"+tf.getText());
            out.writeUTF(nickname+":"+tf.getText());
            tf.setText("");
            scp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            JScrollBar verticalBar = scp.getVerticalScrollBar();
            verticalBar.setValue(verticalBar.getMaximum());

          }
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
      }
    });
  }
  private void arrange() {
    add(scp, "Center");
    add(tf, "South");
  }

  private void inflate() {
    setTitle("Chatting Room");
    setSize(450, 640);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(this);
    setVisible(true);
  }
  class Reciver implements Runnable{
//  class Reciver extends Thread{
    DataInputStream in;

    public Reciver(Socket socket) {
      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    @Override
    public void run() {
      while (in != null){
        try {
          //과제(수정) 프로그램안에서 띄우기
          ta.append(in.readUTF()+"\n");
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}

