package service.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public interface FunctionTesting {

     static void main(String[] args) {

         Function<String,Integer> string=e -> e.length();
         Function<String,String> str=e -> e.substring(0,3);
         System.out.println(str.apply("avinash"));

         Function<List<Student>,List<Student>> studentWithVip= li -> {
             List<Student> result=new ArrayList<>();
             for(Student s : li)
             {
                 if (str.apply(s.getName()).equalsIgnoreCase("vip"))
                     result.add(s);
             }
             return result;
         };

         Student stu1 = Student.builder().setName("vip_vicky").setId(123) .build();
         Student stu2 = Student.builder().setName("avinash").setId(321) .build();
         Student stu3 = Student.builder().setName("vip_badiger").setId(443) .build();

         List<Student> list = Arrays.asList(stu1, stu2, stu3);

         List<Student> apply = studentWithVip.apply(list);
         System.out.println(apply);


     }
}
