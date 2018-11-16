package travislab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Ryanfinazzo
 */
public class TravisLab implements Predicate{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> strList=new ArrayList<>();
        strList.add("Ryan");
        strList.add("Bob");
        strList.add("Sally");
        
        Predicate<String> strfirst = r->r.contains("Ryan");
        Predicate<String> strsecond = b->b.contains("Bob");
        
        //int index = linearSearch(strList,strfirst);
       
        //index = linearSearch(strList,strsecond);
        
        
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(10);
        
        Predicate<Integer> intfirst = (i) ->i<2 &&i>0;
        Predicate<Integer> intsecond = (i)->i>1;
        Predicate<Integer> fail = (i)->i<0;
        
        //index = linearSearch(intList,intfirst);
      
        //index = linearSearch(intList,intsecond);
        
        int index = linearSearch(intList,fail);
        
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        for (int i =0;i<list.size();i++){
            if (check.test(list.get(i))){
                return i;
            }
        }
        return -1; 
    }

    @Override
    public boolean test(Object t) {
    return false;
    }
}
