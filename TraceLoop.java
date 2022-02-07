public class TraceLoop {
    public static void main(String[] args) {
      int count = 1;
      while (count <= 10)
      {
         count *= 2;
      }
      count = count - 10;
      System.out.println("Count is " + count);
    }
}