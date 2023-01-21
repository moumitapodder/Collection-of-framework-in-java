import java.util.*;
import java.io.*;  
class HashSet1{  
 /**
 * @param args
 */
private static boolean add;

/**
 * @param args
 */
public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet<String>();  
    HashSet<String> set1=new LinkedHashSet<String>();  
           set.add("One");    
           set.add("Two");    
           set.add("Two");   
           set.add("two");  
           set.add("Five");  
           //Iterator<String> i=set.iterator();  
           //while(i.hasNext())  
           //{  
           System.out.println(set);  
           set.remove("two");
           System.out.println(set);
           set.contains("two");
           System.out.println(set.size());
          
           set1.add("dear");
           set1.add("do");
           set1.add("i");
           set1.add("u");
           set1.add("love");
     
  
    
      
  
       
        System.out.println("HashSet: " + set);
  
        // Creating a new cloned set
        HashSet cloned_set = new HashSet();
  
        // Cloning the set using clone() method
        cloned_set = (HashSet)set.clone();
  
        // Displaying the new Set after Cloning;
        System.out.println("The new set: " + cloned_set);
System.out.println(set1);
          set.addAll(set1);
          System.out.println(set);
    }
}

      
   