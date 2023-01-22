import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectionclass {

    public static void main(String[] args) {


        
       List<Integer> list = new ArrayList<>();
      list.add(34);
      list.add(12);
      list.add(-4);
      list.add(-4);
      list.add(0);
      list.add(-4);
     list.add(100);
     list.add(75);
     Collections.sort(list);//sorting the elements //ny default ascending order;;
     System.out.println(list);
     System.out.println("min element " + Collections.min(list));
     System.out.println("max element " + Collections.max(list));
      System.out.println(Collections.frequency(list, -4));//counting the number of the elements present;

      Collections.sort(list, Comparator.reverseOrder());//ny using comparator we can reverse the sorting order;;
       System.out.println(list);
    }

}