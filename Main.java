import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с чем-то ещё", 200);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfwater1 = new BottleOfWater("Вода", 100, 1);
        BottleOfWater bottleOfwater2 = new BottleOfWater("Вода1", 110, 2);
        BottleOfWater bottleOfwater3 = new BottleOfWater("Вода2", 120, 1);
        BottleOfWater bottleOfwater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfwater5 = new BottleOfWater("Вода4", 140, 2);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 1, 3);

        Product packOfChips1 = new Chips("Chrispy", 90, 50, "Crab");
        Product packOfChips2 = new Chips("Chrispy", 50, 30, "Onion");
        Product packOfChips3 = new Chips("Zjaky", 50, 40, "Bacon");

        List <Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfwater1);
        products.add(bottleOfwater2);
        products.add(bottleOfwater3);
        products.add(bottleOfwater4);
        products.add(bottleOfwater5);
        products.add(0, packOfChips1);
        products.add(0, packOfChips2);
        products.add(0, packOfChips3);

        BottleVendingMachine machine = new BottleVendingMachine(products);
        
        BottleOfWater bottleOfWaterRes = machine.getBottleOfWater("Вода3", 3);
        if(bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else{
            System.out.println("Такой бутылки с водой в автомате нет");
        }

        Chips packOfChipsRes = machine.getChips("Zjaky", 40, "Bacon");

        if(packOfChipsRes != null){
            System.out.println("Вы купили: ");
            System.out.println(packOfChipsRes.displayInfo());
        }
        else{
            System.out.println("Таких чипсов в автомате нет");
        }
    }
}
