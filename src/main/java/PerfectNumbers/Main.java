package PerfectNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        long num = 2;
        long toplam = 0;

        while (count <= 4) {
            for (long i = 1; i < num; i++) {
                if (num % i == 0) {
                    toplam += i;
                }
            }
            if (num == toplam) {

                count++;
                System.out.println(num);
            }
            num++;
            toplam = 0;
        }
    }
}
