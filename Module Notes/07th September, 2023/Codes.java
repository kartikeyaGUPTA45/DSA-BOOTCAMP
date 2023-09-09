import java.io.*;
import java.util.*;

public class Solution {
    public static class Person {
        String name;
        int age;
        
        public void saysHi(){
            System.out.println(name + "@" + age);
        }
        
//         public Person(){
//             // default Constructor
//         }
        
//         public Person(String name, int age){
// //             Parametrized Constructor
//             this.name = name;
//             this.age = age;
//         }
        
//         public Person(String name){
// //             Parametrized Constructor
//             this.name = name;
            
//         }
        
        public Person( int Age){
//             Parametrized Constructor
            age = Age;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Person p1 = new Person();
        p1.name = "A";
        p1.age = 23;
        
        Person p2 = new Person();
        p2.name = "B";
        p2.age = 29;
        
        p1.saysHi();
        p2.saysHi();
        
        
//         Person p3 = new Person("C", 34);
//         p3.saysHi();
        
//         Person p4 = new Person("D");
//         p4.saysHi();
        
//         Person p5 = new Person(45);
//         p5.saysHi();
    }
    public static void swap1(Person p1, Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
    
    public static void swap2(Person p1, Person p2){
        String t = p1.name;
        p1.name = p2.name;
        p2.name = t;
        
        int temp = p1.age;
        p1.age  = p2.age;
        p2.age = temp;
    }
    
    public static void swap3(Person p1, Person p2){
        String t = p1.name;
        p1.name = p2.name;
        p2.name = t;
        
        p1 = new Person();
        int temp = p1.age;
        p1.age = p2.age;
        p2.age = temp;
    }
    
    public static void swap4(Person p1, Person p2){
        p1 = new Person();
        String t = p1.name;
        p1.name = p2.name;
        p2.name = t;
        
        p2 = new Person();
        p1 = new Person();
        int temp = p1.age;
        p1.age = p2.age;
        p2.age = temp;
    }
}
