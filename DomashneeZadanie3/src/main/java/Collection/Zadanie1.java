package Collection;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list7=new ArrayList<Integer>();
        list7.add(1);
        list7.add(2);
        list7.add(3);
        list7.add(4);
        list7.add(4);
        System.out.println(list7);

    foo(list7);
        System.out.println(list7);


}


public static List<Integer> foo(List<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(i);
            }
        }
return  new ArrayList<Integer>(list);

}


}
