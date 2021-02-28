import java.util.*;

class ComparatorPrice implements Comparator<EFFY_Apple>{
    @Override
    public int compare(EFFY_Apple o1, EFFY_Apple o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}

class ComparatorWeight implements Comparator<EFFY_Apple>{

    @Override
    public int compare(EFFY_Apple o1, EFFY_Apple o2) {
        return Integer.compare(o1.getWeight(),o2.getWeight());
    }
}

class ComparatorVariety implements Comparator<EFFY_Apple>{

    @Override
    public int compare(EFFY_Apple o1, EFFY_Apple o2) {
        return o1.getVariety().compareTo(o2.getVariety());
    }
}

class ComparatorSpoilage implements Comparator<EFFY_Apple>{

    @Override
    public int compare(EFFY_Apple o1, EFFY_Apple o2) {
        return Integer.compare(o1.getSpoilage(), o2.getSpoilage());
    }
}




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

    public void sortByPrice(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, new ComparatorPrice());
        }
        else {
            Collections.sort(myApples,Collections.reverseOrder(new ComparatorPrice()));
        }
    }

    public void sortByWeight(String IdOrder){
        if(IdOrder.equals(ascendingOrder)) {
            Collections.sort(myApples, new ComparatorWeight());
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder(new ComparatorWeight()));
        }
    }

    public void sortByVariety(String IdOrder){
        if(IdOrder.equals(ascendingOrder)){
            Collections.sort(myApples, new ComparatorVariety());
        }
        else {
            Collections.sort(myApples, Collections.reverseOrder(new ComparatorVariety()));
        }
    }

    public void sortBySpoilage(String IdOrder){
        if(IdOrder.equals(ascendingOrder)){
            Collections.sort(myApples, new ComparatorSpoilage());
        }
        else{
            Collections.sort(myApples, Collections.reverseOrder(new ComparatorSpoilage()));
        }
    }


}
