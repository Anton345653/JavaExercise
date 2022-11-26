package Cycles;

public class Sadanie_4 {
    public static void main(String[] args) {
        int naselenie = 10000000;
        int rojdaemost = 14;
        int smertnost = 8;

        for(int i=1;i<=10;i++){
            naselenie+=naselenie*(rojdaemost-smertnost)/1000;
            System.out.println(naselenie);
        }

    }
}
