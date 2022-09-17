import java.io.*;
import java.util.*;

public class Analysis{
  public void open(){
    ArrayList<Double> inputData = new ArrayList<>();


    Map<String,String> data = new HashMap<>();

    while(true){
      int i = 0;
      System.out.println("ファイルのパスを入力してください");
      Scanner scanner = new Scanner(System.in);
      String path = scanner.next();
      try{
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        while(line != null){
          String[] st1 = line.split(",");
          System.out.println(st1[1]);
          Double value = Double.parseDouble(st1[1]);
          inputData.add(value);

          line = br.readLine();

          i++;
        }

        Double[] inputDatas = inputData.toArray(new Double[0]);
        Calc cc = new Calc();
        cc.average(inputDatas);
        cc.stderr(inputDatas);

        br.close();
        System.out.println("Hello world");
        break;
      }catch (IOException e) {
        System.out.println("ファイルが存在しないか、不正なファイルです");
      }
    }
  }
}
