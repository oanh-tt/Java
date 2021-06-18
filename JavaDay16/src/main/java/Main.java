import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        System.out.println("Bài 1: ");
        ListProducts product = new ListProducts();
        product.addListProducts();
        product.findProduct();
        product.editProduct();
        product.deleteProduct();
        System.out.println("Bài 2: ");
        ListEmployee emp = new ListEmployee();
        emp.addListEmployee();
        emp.editEmployee();
        emp.moveEmployee();
//        ArrayList<Employee> listEmployee = new ArrayList<>();
//        Employee employee = new Employee(1, "Test 1",25);
//        listEmployee.add(employee);
//        listEmployee.add(new Employee(1,"Test 2",26 ));
//        for (Employee emp : listEmployee){
//            System.out.println(emp);
//        }
//        System.out.println("Thông tin nhân viên có tên Test 2: ");
//        for (int i=0;i<listEmployee.size();i++){
//            if (listEmployee.get(i).name.contains("Test 2")){
//                System.out.println(listEmployee.get(i));
//            }
//        }
//
//        for (int i=0;i<listEmployee.size();i++){
//            if (listEmployee.get(i).name.contains("Test 2")){
//                System.out.println(listEmployee.get(i));
//                listEmployee.set(i, new Employee(2, "Oanh", 27));
//            }
//        }
//        System.out.println("Sửa Thông tin nhân viên có tên Test 2: ");
//        for (Employee emp : listEmployee){
//            System.out.println(emp);
//        }
    }
}
