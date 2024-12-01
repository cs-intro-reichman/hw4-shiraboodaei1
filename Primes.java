public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]) + 1;
        // create a boolean array of size n
        boolean [] numArr = new boolean[n];
        System.out.println("Prime numbers up to " + (n - 1) + ":");
        // cross numbers that are multiples of p = 2
        int prime = 2;
        while (prime < Math.sqrt(n)) {
            if (!numArr[prime]){
                for (int nextPrime = prime + 1; nextPrime < n; nextPrime ++){
                    if (!numArr[nextPrime]){
                        if (nextPrime % prime == 0){
                            numArr[nextPrime] = true;
                        }
                    } 
            }   
            } prime ++; 
        }
        int numOfPrimes = 0;
        for (int i = 2; i < numArr.length; i++){
            if (!numArr[i]){
                System.out.println(i);
                numOfPrimes++;
            }
        } 
        int percent = (int)((double) numOfPrimes/n * 100);
        System.out.println("There are " + numOfPrimes + " primes between 2 and " + (n - 1) + " (" + percent + "% are primes)");
    }
    
}