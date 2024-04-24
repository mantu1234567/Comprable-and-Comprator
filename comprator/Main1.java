package comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
     int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main1 {
    public static void main(String[] args){
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1,Student s2){
                if (s1.age>s2.age) return 1;
                else return -1;
            }
        };
        List<Student> list = new ArrayList<>();
        list.add(new Student(12,"man"));
        list.add(new Student(15,"m"));
        list.add(new Student(18,"mantu"));
        list.add(new Student(128,"manjkhggjh"));

           Collections.sort(list,com);
         for (Student s: list) System.out.println(s);
    }
}
