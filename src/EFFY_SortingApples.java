import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;


public class EFFY_SortingApples {
    public static final String ascendingOrder = "ascending";
    public static final String descendingOrder = "descending";
    private static ArrayList<EFFY_Apple> myApples = new ArrayList<EFFY_Apple>();
    public static final String sortAndWeight = "SAW";
    public static final String weightAndPrice = "WAP";
    public static final String sortAndPrice = "SAP";

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

    private List<EFFY_Apple> onDemandList (String wayOfSort,String sort,int weight,int price){
        return  myApples.stream()
                .filter(wayOfSort.equals(sortAndWeight)? apple -> apple.getVariety().equals(sort) && apple.getWeight()==weight:
                    wayOfSort.equals(weightAndPrice)? apple -> apple.getWeight()==weight && apple.getPrice()==price:
                            apple -> apple.getVariety().equals(sort) && apple.getPrice()==price)
                .collect(Collectors.toList());
    }


    public void showOnDemandList(String wayOfSort, String sort, int weight, int price){
        for(EFFY_Apple apple:onDemandList(wayOfSort,sort,weight,price))
            System.out.println(apple.toString());
    }

}
