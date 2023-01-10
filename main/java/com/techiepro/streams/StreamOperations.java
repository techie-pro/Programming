package com.techiepro.streams;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> courses =new ArrayList<String>(Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes"));
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));

        courses.stream().filter(s-> s.length()>4).forEach(System.out::println);
        int i = numbers.stream().reduce(0,(x,y) -> x+y);
//        System.out.println(i);
        //cubes
        numbers.stream().map(s ->(int) Math.pow(s,3)).forEach(s -> System.out.print(s+" "));
        //sum of odd numbers
       int result =  new ArrayList<Integer>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15)).stream().filter(j -> j%2 != 0).reduce(0,Integer :: sum);
       System.out.println(result);
        int res1 = numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum);
        Integer res2= numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum);
        System.out.println("values are "+res1+" : " +res2);
        //collect to list.
    List<Integer> all= numbers.stream().filter(k -> k % 2 == 0).collect(Collectors.toList());
    System.out.println(all.toString());

    List<Integer> lengths = courses.stream().map(s -> s.length()).collect(Collectors.toList());
    System.out.println(lengths.toString());
    int count = (int) numbers.stream().distinct().count();
        List<Integer> listOfDistinct = numbers.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println("list of distinct elements in the list and sorted : "+listOfDistinct);
    }

}