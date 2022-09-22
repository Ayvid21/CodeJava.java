import java.lang.Math;
public class randomNumberGenerator {
  

  static double random(int start, int end) {

    double a = start + (end - start) * Math.random();

    int val = (int) a;
    return val;
  }
  public static void main(String[] args) {
    int start = 40;
    int end = 60;
    System.out.println(random(start , end));
  }
}
