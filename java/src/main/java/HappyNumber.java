import java.util.HashSet;
import java.util.Set;

class HappyNumber {
  private int nextGen(int num){
    int totalSum = 0;
        while (num > 0) {
            int d = num % 10;
            num = num / 10;
            totalSum += d * d;
        }
        return totalSum;
   }

  public boolean isHappy(int n) {
      Set<Integer> seen = new HashSet<>();  
      while(n!=1 && !seen.contains(n)){
          seen.add(n);
          n = nextGen(n);
      }
        return n == 1;
   }
}