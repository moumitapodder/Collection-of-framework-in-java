import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;  
import java.util.TreeSet;
class Treesett{  
 /**
 * @param args
 */
public static void main(String args[]){  
 Set<String>set= new TreeSet();  
        // set.add("Vijay");  
         set.add("A");  
         set.add("B");
         //set.add("sjay");  
         set.add("a");  
         set.add("b");
         set.add("c");
// you know the ASCII code of captial A-Z starts from 65-... & ascii code of lowercase letter of a-z starts from 97 , by default treeset arranges into ascending order that's why it arranges from capital A i,e 65 to  .....and small letter a=97 that'y capital A is before the lowercase a;
         System.out.println(set);   
         Comparator<? super String> comp = ((TreeSet<String>) set).comparator();
  System.out.println("TreeSet: " +comp);
  
         
         //Iterator i=((Object) set).descendingIterator();  
        
           
 }                                                                                                                                                                                                
}  
