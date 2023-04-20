public class Product {
    
    protected String name;
    protected String brand;
    protected double price;
    int packSize;
    double temperature;
    boolean isFresh;

    {// инициализатор
        packSize = 1;
        temperature = 0;
        isFresh = true;
    }

    
    /**
     * Получить информацию по продукту
     * @return Product info
     */
    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }

    public Product(){
        this("Продукт", 100); // указываем другой конструктор со значениями по умолчанию, чтобы они подставлялись в пустые места
        name = "Product";
        brand = "Some Brand";
        price = 100;
    }

    public Product(String inputName, double inputPrice){
        this(inputName, inputPrice, "Brand");
        this.name = inputName;
        this.price = inputPrice;
    }

    public Product(String inputName, double inputPrice, String inputBrand){
        if(inputName.length() < 3){ // защита от дурака
            this.name = "Noname";
        }
        else{
            this.name = inputName;
        }
        this.price = inputPrice;
        this.brand = inputBrand;
    }
    public double getPrice(){ // геттер или аксессор
        return price;
    }

    public void setPrice(double price){// ньютейтер или сеттер
        if(price <= 0){
            throw new RuntimeException("Цена указана некорректно");
        }
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
