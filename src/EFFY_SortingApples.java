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

    private void sortByPrice(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, (obj,obj1) -> obj.getPrice()-obj1.getPrice());
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder((obj,obj1) -> obj.getPrice()-obj1.getPrice()));
        }
    }

    private void sortByWeight(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, comparingInt(EFFY_Apple::getWeight));
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder(comparingInt(EFFY_Apple::getWeight)));
        }
    }

    private void sortByVariety(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, comparing(EFFY_Apple::getVariety));
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder(comparing(EFFY_Apple::getVariety)));
        }
    }

    private void sortBySpoilage(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, comparing(EFFY_Apple::getSpoilage));
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder(comparing(EFFY_Apple::getSpoilage)));
        }
    }

    public void sortApples(String IdOrder,int indexSort){
        switch (indexSort){
            case 0:sortByPrice(IdOrder);break;
            case 1:sortByWeight(IdOrder);break;
            case 2:sortByVariety(IdOrder);break;
            case 3:sortBySpoilage(IdOrder);
        }
    }


}
