public class Product {
    private int id;
    private String name;

    public Product(){
    }
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
