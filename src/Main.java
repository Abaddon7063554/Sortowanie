import java.util.Random;

public class Main {
    static Random lasowanie = new Random();
    static int[] tablica = new int[5];



    public static int losowanie() {
        return lasowanie.nextInt(20);
    }

    public static void wyswietlenie_tablicy() {
        for(int var0 = 0; var0 < tablica.length; ++var0) {
            int var10001 = tablica[var0];
            System.out.print("" + var10001 + " ");
        }

    }

    public static void sortowanie_od_najmniejszej() {
        for(int var1 = 0; var1 < tablica.length - 1; ++var1) {
            for(int var2 = 0; var2 < tablica.length - 1; ++var2) {
                if (tablica[var2] > tablica[var2 + 1]) {
                    int var0 = tablica[var2];
                    tablica[var2] = tablica[var2 + 1];
                    tablica[var2 + 1] = var0;
                }
            }
        }

        System.out.println();
    }

    public static void sortowanie_od_najwiekszej() {
        for(int var1 = 0; var1 < tablica.length - 1; ++var1) {
            for(int var2 = 0; var2 < tablica.length - 1; ++var2) {
                if (tablica[var1] < tablica[var1 + 1]) {
                    int var0 = tablica[var1 + 1];
                    tablica[var1 + 1] = tablica[var1];
                    tablica[var1] = var0;
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] var0) {
        //Me.wypelnienie();
        //wyswietlenie_tablicy();
        //sortowanie_od_najmniejszej();
        //wyswietlenie_tablicy();
        //Me.wypelnienie();
        //wyswietlenie_tablicy();
        //sortowanie_od_najwiekszej();
        //wyswietlenie_tablicy();
        //Me.imie();
        //choinka.calosc();
        fibonacciego.ciag();
    }
}