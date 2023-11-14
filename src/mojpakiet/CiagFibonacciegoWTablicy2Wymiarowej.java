package mojpakiet;

public class CiagFibonacciegoWTablicy2Wymiarowej{
    public static int dl =10;
    public static int wys = 10,gora=2;
    public static int[][] tab = new int[wys][dl];
    public static void main(String[] args) {
        tab[0][0] = 1;
        tab[0][1] = 1;

int a = 0 ;
    for (int k =0 ; k<10;k++) {
        for (int i = 2; i < 10; i++) {
            tab[a][i] = tab[a][i - 2] + tab[a][i - 1];

        }
        tab[1][9] = tab[0][8] + tab[0][9];

        for (int i = 2; i < 10; i++) {
            tab[i][9] = tab[i - 2][9] + tab[i - 1][9];
        }
        tab[9][9] = tab[7][9] + tab[8][9];
        tab[9][8] = tab[8][9] + tab[9][9];


        for (int i = 7; i >= 0; i--) {
            tab[9][i] = tab[9][i + 2] + tab[9][i + 1];
        }
        tab[8][0] = tab[9][1] + tab[9][0];
        for (int i = 7; i > 0; i--) {
            tab[i][0] = tab[i + 2][0] + tab[i + 1][0];
        }
a++;
    }





        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }

    }
}
