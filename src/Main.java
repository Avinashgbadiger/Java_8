import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import service.Employee;
import service.comparator.SortByLamda;
import service.sam.MyClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(112);
        list.add(66);
        list.add(8);
        list.add(92);
        list.add(65);

        Collections.sort(list,(a,b) -> b-a);
        System.out.println(list);


    }
}