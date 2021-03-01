public class Main {

    public static void main(String[] args) {
        EFFY_SortingApples myTry = new EFFY_SortingApples();

        myTry.showApples(myTry.add(1000));
        System.out.println("___________________");
        myTry.showApples(myTry.sortApples(EFFY_SortingApples.ascendingOrder,1, myTry.onDemandList(EFFY_SortingApples.sortAndPrice,AppleVarieties.Antonovka,0,10)));
    }
}
