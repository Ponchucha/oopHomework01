public class Chips extends Product{
    private int weight;
    private String taste;

    /**
     * Chips constructor
     * @param name of chips
     * @param price of piece
     * @param weight of piece
     * @param taste of chips
     */
    public Chips(String name, int price, int weight, String taste){
        super(name, price);
        this.taste = taste;
        this.weight = weight;
    }
    @Override
    public String displayInfo(){
        return String.format("%s - %s со вкусом %s - %f - вес: %d", brand, name, taste, price, weight);
    }

    public int getWeight(){
        return this.weight;
    }

    public String getTaste(){
        return this.taste;
    }
}
