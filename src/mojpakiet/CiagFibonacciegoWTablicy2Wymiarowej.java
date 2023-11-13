package mojpakiet;

public class CiagFibonacciegoWTablicy2Wymiarowej{
    public static int[][] tab = new int[10][10];
    public static void main(String[] args) {

        int[] tab1 = new int[10];
        int l1=1,l2=1,l3;
        tab1[0]=l1;
        tab1[1]=l2;
        for(int  i = 2 ; i<10; i++){
            tab1[i]=tab1[i-2]+tab1[i-1];
        }
        for(int  i = 0 ; i<10; i++){
            System.out.print(tab1[i]+" ");
        }

    }
}
