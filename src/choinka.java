import java.util.Scanner;

public class choinka {
    public static void calosc() {
        int dlugosc_gwiazd = 0;
        Scanner pobierz = new Scanner(System.in);
        int dlugosc_spacji = pobierz.nextInt();
        int z = dlugosc_spacji;
        System.out.print("*");
        for (int a = 0; a < z; a++) {
            for (int i = 0; i < dlugosc_spacji; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*dlugosc_gwiazd); j++) {
                System.out.print("*");
            }
            System.out.println("");
            dlugosc_spacji--;
            dlugosc_gwiazd++;
        }
    }
}
