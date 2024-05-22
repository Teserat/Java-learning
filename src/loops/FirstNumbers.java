package loops;

import java.util.Arrays;

public class FirstNumbers {

    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false; // 0
        isPrime[1] = false; // 1 musza być zadeklarowane wcześniej

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Liczby pierwsze do " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
