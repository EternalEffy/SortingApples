public class Main {

    public static void main(String[] args) {
        EFFY_SortingApples myTry = new EFFY_SortingApples();

        for(int i=0;i<10;i++){
            myTry.add(Generator.genApple());
        }
        myTry.showApples();
        System.out.println("___________________");
        myTry.sortApples(EFFY_SortingApples.ascendingOrder,0);
        myTry.showApples();
        System.out.println("___________________");
        myTry.sortApples(EFFY_SortingApples.descendingOrder,0);
        myTry.showApples();

    }
}
