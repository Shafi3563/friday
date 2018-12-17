package mathProblems;

public class PrimeNumber2 {
    public static boolean isPrime(int n){
        if(n%2 == 0){
            return false;
        }
        for (int i = 3; i<n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int primeCount(){
        int count;
        count=0;

        for (int i = 2; i <= 10;i++)
            if (isPrime(i)) {
                count++;
            }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeCount());
    }
}
