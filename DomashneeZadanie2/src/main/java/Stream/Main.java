package Stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personArrayList=new ArrayList<Person>();
        personArrayList.add(new Person("Bob",32));
        personArrayList.add(new Person("Ivan",29));
        personArrayList.add(new Person("Anton",25));
        System.out.println(personArrayList);

        List<String> filtered=personArrayList.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(filtered);
        List<Integer> filtered2=personArrayList.stream().map(Person::getAge).collect(Collectors.toList());
        System.out.println(filtered2);
        List<Person> filtered3=personArrayList.stream().filter(p->p.getAge()>30).collect(Collectors.toList());
        System.out.println(filtered3);

    }
}
