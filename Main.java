import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        int i, result;
        int toplam = 0, sayac = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sayac++;
                toplam += i;
                System.out.println(i);

            }
        }
        result= toplam/sayac;
        System.out.println(result);

    }
}





