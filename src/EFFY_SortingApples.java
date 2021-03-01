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

    public static List<EFFY_Apple> add(int i){
        for(int j=0;j<i;j++) {
            myApples.add(Generator.genApple());
        }
        return myApples;
    }

    public void showApples(List<EFFY_Apple> list){
        for(EFFY_Apple apple:list)
        System.out.println(apple.toString());
    }


    public List<EFFY_Apple> sortApples(String IdOrder, int indexSort,List<EFFY_Apple> list){
        return sorter(IdOrder,indexSort,list);
    }


    private List<EFFY_Apple> sorter (String IdOrder, int indexSort,List<EFFY_Apple> list){
             Collections.sort(list, (IdOrder.equals(ascendingOrder) ?
                     (indexSort==0?(obj, obj1) -> obj.getPrice() - obj1.getPrice():
                     indexSort==1? comparingInt(EFFY_Apple::getWeight):
                     indexSort==2? comparing(EFFY_Apple::getVariety):
                             comparing(EFFY_Apple::getSpoilage)) :
                     (indexSort==0? Collections.reverseOrder((obj, obj1) -> obj.getPrice() - obj1.getPrice()):
                     indexSort==1? Collections.reverseOrder(comparingInt(EFFY_Apple::getWeight)):
                             indexSort==2? Collections.reverseOrder(comparing(EFFY_Apple::getVariety)):
                                     Collections.reverseOrder(comparing(EFFY_Apple::getVariety)))));

        return list;
    }

    public List<EFFY_Apple> onDemandList (String wayOfSort,String sort,int weight,int price){
        return  myApples.stream()
                .filter(wayOfSort.equals(sortAndWeight)? apple -> apple.getVariety().equals(sort) && apple.getWeight()==weight:
                    wayOfSort.equals(weightAndPrice)? apple -> apple.getWeight()==weight && apple.getPrice()==price:
                            apple -> apple.getVariety().equals(sort) && apple.getPrice()==price)
                .collect(Collectors.toList());
    }

}
