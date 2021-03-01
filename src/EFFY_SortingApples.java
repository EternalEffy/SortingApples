import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;


public class EFFY_SortingApples {
    public static final String ascendingOrder = "ascending";
    public static final String descendingOrder = "descending";
    private static ArrayList<EFFY_Apple> myApples = new ArrayList<EFFY_Apple>();

    public static void add(EFFY_Apple apple){
        myApples.add(apple);
    }

    public void showApples(){
        for(EFFY_Apple apple:myApples)
        System.out.println(apple.toString());
    }


    public ArrayList<EFFY_Apple> sortApples(String IdOrder, int indexSort){
        return sorter(IdOrder,indexSort);
    }


    private ArrayList<EFFY_Apple> sorter (String IdOrder, int indexSort){
             Collections.sort(myApples, (IdOrder.equals(ascendingOrder) ?
                     (indexSort==0?(obj, obj1) -> obj.getPrice() - obj1.getPrice():
                     indexSort==1? comparingInt(EFFY_Apple::getWeight):
                     indexSort==2? comparing(EFFY_Apple::getVariety):
                             comparing(EFFY_Apple::getSpoilage)) :
                     (indexSort==0? Collections.reverseOrder((obj, obj1) -> obj.getPrice() - obj1.getPrice()):
                     indexSort==1? Collections.reverseOrder(comparingInt(EFFY_Apple::getWeight)):
                             indexSort==2? Collections.reverseOrder(comparing(EFFY_Apple::getVariety)):
                                     Collections.reverseOrder(comparing(EFFY_Apple::getVariety)))));

        return myApples;
    }


}
