public class fibonacciego {
    public static void ciag(){
        int pierwszy = 1;
        int drugi = 1;
        int trzeci ;

        System.out.print(pierwszy+" "+drugi+" ");

        for (int a = 0; a <5; a++){
            trzeci = pierwszy+drugi;
            pierwszy = drugi+trzeci;
            drugi = pierwszy + trzeci;
        System.out.print(trzeci+" "+pierwszy+" "+drugi+" ");
        }
    }
}
