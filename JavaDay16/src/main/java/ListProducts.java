import java.util.ArrayList;

public class ListProducts {
    ArrayList<Products> listProducts = new ArrayList();

    public void addListProducts(){
        listProducts.add(new Products(001, "Bánh mỳ ruốc",100, 4000));
        listProducts.add(new Products(002, "Mỳ tôm",10, 3500));
        listProducts.add(new Products(003, "Sữa tươi vinamilk không đường",55, 7000));
        listProducts.add(new Products(004, "Sữa tươi vinamilk ít đường",77, 7000));
        System.out.println("\tDanh sách sản phẩm sau khi thêm: ");
        for (Products products: listProducts){
            System.out.println(products);
        }
    }

    public void findProduct(){
        for (int i = 0; i<listProducts.size(); i++){
            if(listProducts.get(i).name=="Mỳ tôm") {
                System.out.println("Sản phẩm thực hiện tìm kiếm là: " + listProducts.get(i));
            }
        }
    }

    public void editProduct(){
        for (int i = 0; i<listProducts.size(); i++){
            if(listProducts.get(i).id==002) {
                listProducts.set(i, new Products(002, "Mỳ tôm hảo hảo chua cay", 50, 100));
            }
        }
        System.out.println("\tDanh sách sản phẩm sau khi sửa: ");
        for (Products products: listProducts){
            System.out.println(products);
        }
    }

    public void deleteProduct(){
        for (int i = 0; i<listProducts.size(); i++){
            if(listProducts.get(i).name=="Sữa tươi vinamilk không đường") {
                listProducts.remove(listProducts.get(i));
            }
        }
        System.out.println("\tDanh sách sản phẩm sau khi xóa: ");
        for (Products products: listProducts){
            System.out.println(products);
        }
    }
}