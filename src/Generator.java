import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;

import java.util.Random;

public class Generator {
    public static int generatePrice(){
        Random r = new Random();
        int price =r.nextInt(25);
        return price;
    }

    public static int generateWeight(){
        Random r = new Random();
        int weight = r.nextInt(500);
        return weight;
    }

    public static String generateVariety(){
        Random r = new Random();
        int index = r.nextInt(4);
        switch (index){
            case 0:return AppleVarieties.Antonovka;
            case 1:return AppleVarieties.Cameo;
            case 2:return AppleVarieties.Empire;
            case 3:return AppleVarieties.Fuji;
        }
        return null;
    }

    public static int generateSpoilage(){
        Random r = new Random();
        int spoilage = r.nextInt(10);
        return spoilage;
    }

    public static EFFY_Apple genApple(){
        return new EFFY_Apple(generatePrice(),generateWeight(),generateVariety(),generateSpoilage());
    }


}
