package service.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("avinash", "vicky", "piggy");

        List<Student> collet = list.stream().map(Student::new).collect(Collectors.toList());
        collet.forEach(System.out::println);





    }


}
class Student
{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
