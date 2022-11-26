package Cycles;

public class Sadanie_1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length;i++){
            array[i]=i+1;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int u:array){
            System.out.print(u+" ");
        }
        System.out.println();
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int r:array){
            System.out.print(array.length-r+1+" ");
        }
    }
}
