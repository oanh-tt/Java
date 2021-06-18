public class Products {
    int id;
    String name;
    int number;
    int price;
    public Products (int id, String name, int number, int price){
        this.id = id;
        this.name = name;
        this.number = number;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Employee{"+
                "id="+id+
                ",name="+name+'\''+
                ",number="+number+
                ",price="+price+
                '}';
    }
}
