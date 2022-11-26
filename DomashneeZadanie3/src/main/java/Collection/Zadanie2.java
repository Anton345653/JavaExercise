package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<Integer>();
        List<Integer> LinkedList=new LinkedList<Integer>();

        time(arrayList);
        time(LinkedList);
        //arrayList быстрее,так как ему надо последовательно вводить данные и считывать.
        //LinkedList быстрее при добавлении в середину

    }
    public static void time(List<Integer> list){
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            list.add(i);
        }
        for(int i=0;i<100000;i++){
            Random random=new Random();
            int u=random.nextInt(10000);
            list.get(u);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }

}
