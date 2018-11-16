package travislab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Ryanfinazzo
 */
public class TravisLab{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          
        
        System.out.println("Hello World");
        List<String> strList=new ArrayList<>();
        strList.add("Ryan");
        strList.add("Bob");
        strList.add("Sally");
        
        Predicate<String> strfirst = r->r.contains("Ryan");
        Predicate<String> strsecond = b->b.contains("Bob");
        
        int index = linearSearch(strList,strfirst);
        System.out.println(index);
        index = linearSearch(strList,strsecond);
        System.out.println(index);
        
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(10);
        
        Predicate<Integer> intfirst = (i) ->i<2 &&i>0;
        Predicate<Integer> intsecond = (i)->i>1;
        
        index = linearSearch(intList,intfirst);
        System.out.println(index);
        index = linearSearch(intList,intsecond);
        System.out.println(index);
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        System.out.println("here");
        for (int i =0;i<list.size();i++){
            System.out.println("Here1");
            if (check.test(list.get(i))){
                System.out.println("Here2");
                return i;
            }
        }
        return -1; 
    }
}
