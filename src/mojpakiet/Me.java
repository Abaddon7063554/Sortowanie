package mojpakiet;

class Me {


    public static void imie() {
        System.out.println("imie");
    }

    public static void wypelnienie() {
        for(int var0 = 0; var0 < Main.tablica.length; ++var0) {
            Main.tablica[var0] = Main.losowanie();
        }

        System.out.println();
    }
}