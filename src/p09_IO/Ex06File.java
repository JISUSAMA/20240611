package p09_IO;

import java.io.File;

public class Ex06File {
  public static void main(String[] args) {
    //1) File 폴더를 다룰 수 있다.
    File file = new File(".");
    if(file.exists() && file.isDirectory()){
      String [] fileList = file.list();
      for (int i = 0; i < fileList.length; i++) {
        System.out.println(fileList[i]);
      }
    }
    else{
      System.out.println("이것은 경로가 잘못 되었습니다.");
    }
    System.out.println("----------------------------------");
    //2) File 객체는 파일을 다룰 수 있다
    file = new File("test.txt");
    if (file.exists()) {
      try {
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath()); //절대경로:: 루트로 부터의 경로
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getParent());

        System.out.println(file.canExecute());//실행
        System.out.println(file.canRead()); //읽기
        System.out.println(file.canWrite()); //쓰기
        System.out.println(file.isFile()); //파일이 맞는가 아닌가
        System.out.println(file.length()); //파일의 크기
        System.out.println(file.toString().substring(
            file.toString().lastIndexOf(".")+1)); //파일의 확장자명
        System.out.println("----------------------------------");
        // 3)File 객체는 Drive 의 정보를 알 수 있다
        String drive;
        double totalSpace,freeSpace, usableSpace,usedSpace;
        File[] roots = File.listRoots();
        for(File f: roots){
          drive = f.getAbsolutePath();
          totalSpace = f.getTotalSpace()/Math.pow(1024,3);
          freeSpace = f.getFreeSpace()/Math.pow(1024,3);
          usableSpace = f.getUsableSpace()/Math.pow(1024,3);
          usedSpace = totalSpace - usableSpace;
          System.out.println("Dirve :" +drive);
          System.out.printf("Total Space : %5.2f GB \n",totalSpace);
          System.out.printf("FreeSpace Space : %5.2f GB \n",freeSpace);
          System.out.printf("UsableSpace Space : %5.2f GB \n",usableSpace);
          System.out.printf("UsedSpace Space : %5.2f GB \n",usedSpace);
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
