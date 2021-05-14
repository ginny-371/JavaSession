public class FIzzBuzz {
    public void inFizzBuzz() {
        for (int k = 1; k < 101; k++) {
            if (k % 3 == 0) {
                if (k % 5 == 0) {
                    System.out.println(k+" FizzBuzz");
                }
                else System.out.println(k+" Fizz");
            }
            else {
                if (k%5==0) {
                    System.out.println(k+" Buzz");
                }
                System.out.println(k+" không chia hết cho 3 và 5");
            }
        }
    }
}
