import java.io.*;
import java.util.*;

public class OpenFile{
    public void open(){
        
        Map<String,String> data = new HashMap<>();
        
        while(true){
            System.out.println("ファイルのパスを入力してください");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.next();
            try{
                File f = new File(path);
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = br.readLine();
                while(line != null){
                    String[] st1 = line.split(",");
                    System.out.println(st1[0]);
     
    //ハッシュが定義されていれば加算
                    if(data.containskey(st1[0])){
                        data.put = (st1[0],data.get(st1[0]) + st1[1]);
                    }else{
                        data.put = (st1[0], st1[1]);
                    }
                    
                    line = br.readLine();
                }
                br.close();
                System.out.println("Hello world");
                break;
            }catch (IOException e) {
                System.out.println("ファイルが存在しないか、不正なファイルです");
            }
        }
    }
}
