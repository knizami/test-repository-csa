public class OddNumbers {
    public static void main(String[] args) {
      int n = 100;
      int currentNumber = -n;
      while (currentNumber <= n)
      {
         int evaluateNumber = currentNumber % 2;
         if (evaluateNumber != 0) {
           System.out.println(currentNumber);
         }
         currentNumber++;
      }
    }
}