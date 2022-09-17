public class Calc{
  public void average(Double s[]){
    double sum = 0;
    for(int i = 0; i < s.length; i++){
      System.out.println(s[i]);
      sum += s[i];
    }
    double ave = sum / s.length;
    System.out.println(ave);
  }

  public void stderr(Double s[]){
    double sum = 0;
    for(int i = 0; i < s.length; i++){
      System.out.println(s[i]);
      sum += s[i];
    }
    double ave = sum / s.length;
    double ssum = 0.0;
    for(int i = 0; i < s.length; i++){
      ssum += (s[i] - ave) * (s[i] - ave);
    }
    double var = ssum / s.length;
    double sd = Math.sqrt(var);
    double se = sd / Math.sqrt(s.length);
    System.out.println("se = ");
    System.out.println(se);
  }
}
