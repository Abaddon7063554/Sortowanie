package mojpakiet;

public class CiagFibonacciegoWTablicy2Wymiarowej{
    public static int[][] tab = new int[10][10];
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int l1 = 1, l2 = 1, l3;
        tab1[0] = l1;
        tab1[1] = l2;
        tab[0][0] = l1;
        tab[0][1] = l2;

        for (int i = 2; i < 10; i++) {
            tab1[i] = tab1[i - 2] + tab1[i - 1];
            // for(int j = 2 ; j<10;j++){

            // }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println("\n \n");

        for (int i = 2; i < 10; i++) {
            tab[0][i] =tab[0][i - 2] + tab[0][i - 1];
        }
        tab[1][9]=tab[0][8]+tab[0][9];
        tab[2][9]=tab[0][9]+tab[1][9];
        for (int i = 2; i < 10; i++) {
            tab[i][9] =tab[i-2][9] + tab[i-1][9];
        }
        tab[9][9]=tab[7][9]+tab[8][9];
        tab[9][8]=tab[8][9]+tab[9][9];


        for (int j = 9 ;j>-1;j--){

           }




        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }

    }
}
