public class Main {

    public static void main(String[] args) {
        EFFY_SortingApples myTry = new EFFY_SortingApples();

        for(int i=0;i<10;i++){
            myTry.add(Generator.genApple());
        }
        myTry.showApples();
        System.out.println("____________________________________");
        myTry.sortByVariety(EFFY_SortingApples.ascendingOrder);
        myTry.showApples();
        System.out.println("____________________________________");
        myTry.sortByVariety(EFFY_SortingApples.descendingOrder);
        myTry.showApples();
        System.out.println("____________________________________");
        myTry.sortBySpoilage(EFFY_SortingApples.ascendingOrder);
        myTry.showApples();
        System.out.println("____________________________________");
        myTry.sortBySpoilage(EFFY_SortingApples.descendingOrder);
        myTry.showApples();
    }
}
