package mojpakiet;


import java.sql.SQLOutput;
 class TworzenieTablicy{
    public static int[][] tablica = new int[10][10];
     void TworzenieTablicy1(){
        for(int i = 0 ; i<tablica.length;i++)
        {
            for(int j=0;j<tablica[i].length;j++){
                tablica[i][j]=1;
            }
            System.out.println();
        }
    }
}
class wyswietl_tablice{
    void wyswietl_tablice1(){

        for(int i = 0 ; i<TworzenieTablicy.tablica.length;i++)
        {
            for(int j=0;j<TworzenieTablicy.tablica[i].length;j++){
                System.out.print(TworzenieTablicy.tablica[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Test
{
    int x=3;
    int y= 4;
    public Test(){
        System.out.println("konstruktor");
    }
    public Test(int a , int b){
        System.out.println("test 2 ");
    }

    void napis(){
        System.out.println(1);
    }
}
class Test2{
    public  Test2(){
        System.out.println("welcome Test2");
    }
}
class metody {
    public static void main(String[] args)
    {
        wyswietl_tablice pokaz = new wyswietl_tablice();
        TworzenieTablicy tablia = new TworzenieTablicy();
        tablia.TworzenieTablicy1();
        pokaz.wyswietl_tablice1();
        Test KlasaTest1 = new Test();
        Test KlasaTest = new Test(1,2);
        Test2 KlasaTestow2 = new Test2();
        KlasaTest.napis();


    }
}
