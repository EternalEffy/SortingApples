public class EFFY_Apple {
    private int price;
    private int weight;
    private String variety;
    private int spoilage;

    public EFFY_Apple(int price, int weight, String variety, int spoilage){
        setPrice(price);
        setWeight(weight);
        setVariety(variety);
        setSpoilage(spoilage);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getSpoilage() {
        return spoilage;
    }

    public int setSpoilage(int spoilage) {
        return spoilage>=1 && spoilage<=10? this.spoilage = spoilage : -1;
        }

    @Override
    public String toString(){
        return "Яблоко сорта " + variety + "| цена = " + price + "| вес(в граммах) = "+ weight + "| коэффициент поренности = " + spoilage;
    }
}
