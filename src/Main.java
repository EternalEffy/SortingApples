public class Main {

    public static void main(String[] args) {
        EFFY_SortingApples myTry = new EFFY_SortingApples();

        for(int i=0;i<1000;i++){
            myTry.add(Generator.genApple());
        }
        myTry.showApples();
        System.out.println("___________________");
        myTry.showOnDemandList(EFFY_SortingApples.sortAndPrice,AppleVarieties.Antonovka,0,10);
    }
}
