import java.util.*;

class Primes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, cnt = 0;
        for (i = 2; i <= n; i++) {
            cnt = 0;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
/*import java.util.Scanner;
class Printprimes {
    public static void main(String args[])  {
        Scanner sc  = new Scanner(System.in);
        int n, i, j, count = 0;
        n = sc.nextInt();

        for(i = 2; i <= n; i++) {
            count = 0;

            for(j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}*/