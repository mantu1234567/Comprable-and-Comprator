package comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length()) return 1;
                else return -1;
            }
        };


//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i, Integer j) {
//                if(i%10 > j%10) return 1;
//               else return -1;
//            }
//        };

//        List<Integer> list = new ArrayList<>();
//        list.add(21);
//        list.add(12);
//        list.add(16);
//        list.add(14);
//        list.add(15);
//        System.out.println(list);
//        Collections.sort(list,com);
//        System.out.println(list);

          // sorting of length of String

        List<String> list = new ArrayList<>();
        list.add("Mantu");
        list.add("kaj");
        list.add("yuyiuio");
        list.add("iruoortiygiry");
        list.add("i");
        System.out.println(list);
        Collections.sort(list,com);
        System.out.println(list);
    }
}
