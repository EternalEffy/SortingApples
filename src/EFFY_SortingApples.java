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
        switch (indexSort) {
            case 0: Collections.sort(myApples, IdOrder.equals(ascendingOrder) ? (obj, obj1) -> obj.getPrice() - obj1.getPrice() : Collections.reverseOrder((obj, obj1) -> obj.getPrice() - obj1.getPrice())); break;
            case 1: Collections.sort(myApples, IdOrder.equals(ascendingOrder) ? comparingInt(EFFY_Apple::getWeight) : Collections.reverseOrder(comparingInt(EFFY_Apple::getWeight)));break;
            case 2: Collections.sort(myApples, IdOrder.equals(ascendingOrder) ? comparing(EFFY_Apple::getVariety) : Collections.reverseOrder(comparing(EFFY_Apple::getVariety)));break;
            case 3: Collections.sort(myApples, IdOrder.equals(ascendingOrder) ? comparing(EFFY_Apple::getSpoilage) : Collections.reverseOrder(comparing(EFFY_Apple::getVariety)));
        }
        return myApples;
    }

}
