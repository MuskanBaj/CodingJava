
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


//Write a function that takes a String as an argument and prints all unique words in it and its count
 class StringProblem {
    
    public static void main(String[] args) {
        String str="Java is great C++ is also great";
        
           String[] words=str.split(" ");           
           List list=Arrays.asList(words);
           TreeSet set=new TreeSet(list);
           set.forEach(System.out::println);
           System.out.println(set.size());
            
        
        }
        
    }
   

