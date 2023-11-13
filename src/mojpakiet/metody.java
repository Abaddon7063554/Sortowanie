package mojpakiet;


import java.sql.SQLOutput;

class Test
{
    int x=3;
    int y= 4;
    public Test(){
        System.out.println("konstruktor");
    }

    void napis(){
        System.out.println(1);
    }
}
class metody {
    public static void main(String[] args) {
    Test KlasaTest = new Test();
    KlasaTest.napis();

    }
}
