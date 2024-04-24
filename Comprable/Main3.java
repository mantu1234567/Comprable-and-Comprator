package Comprable;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Student implements Comparable<Student>{
    private int age;
    private String name;
    Student(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student other){
        if(this.age>other.age) return 1;
        else return -1;
    }
}
public class Main3 {
    public static void main(String[] args){

        List<Student> list = new ArrayList<>();
        list.add(new Student(12,"m"));
        list.add(new Student(13,"m"));
        list.add(new Student(19,"m"));
        list.add(new Student(127,"m"));
        Collections.sort(list);
        for (Student s: list) System.out.println(s);

    }
}
