import java.util.List;

/**
 * BottleVendingMachine
 */
public class BottleVendingMachine {
    

    private final List <Product> products;

    public BottleVendingMachine(List <Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, int volume){
        for (Product product : products) {
            if(product instanceof BottleOfWater){
                if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public Chips getChips(String name, int weight, String taste){
        for (Product product : products) {
            if(product instanceof Chips){
                if(product.getName().equals(name) && ((Chips)product).getWeight() == weight && ((Chips)product).getTaste().equals(taste)){
                    return (Chips)product;
                }
            }
        }
        return null;
    }
}