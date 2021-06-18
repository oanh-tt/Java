import java.util.ArrayList;
import java.util.Scanner;

public class ListEmployee {
    ArrayList<Employee> listEmployee = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addListEmployee (){
        listEmployee.add(new Employee(1, "Oanh", 28, "Nam Định", "0982708746"));
        listEmployee.add(new Employee(2, "Ngọc Hà", 32, "Hà Nội", "0987654321"));
        listEmployee.add(new Employee(3, "Quỳnh", 27, "Thanh Hóa", "0986184346"));
        listEmployee.add(new Employee(4, "Hiến", 22, "Bắc Ninh", "0976543217"));
        listEmployee.add(new Employee(5, "Hà Lê", 35, "Bắc Ninh", "0975352554"));
        listEmployee.add(new Employee(6, "Việt Anh", 26, "Yên Bái", "0987488444"));
        listEmployee.add(new Employee(7, "Ngọc Quỳnh", 23, "Yên Bái", "0985676433"));
        System.out.println("\tDanh sách nhân viên sau khi thêm:");
        for (Employee emp : listEmployee){
            System.out.println(emp);
        }
    }
    public void editEmployee(){
        System.out.println("\tNhập tên nhân viên cần sửa: ");
        String name = sc.nextLine();
        boolean check = false;
        for(int i = 0; i < listEmployee.size(); i++){
            if(listEmployee.get(i).name.equals(name)){
                check = true;
                listEmployee.set(i, new Employee(listEmployee.get(i).id,"Trần Thị Oanh", 28, "Nam Định","0982708746" ));
                System.out.println("\tDanh sách nhân viên sau khi sửa: ");
                for (Employee emp: listEmployee){
                    System.out.println(emp);
                }
            }
        }
        if (check==false){
            System.out.println("\tKhông tìm thấy nhân viên");
        }
    }
    public void moveEmployee(){
        System.out.println("\tNhập mã nhân viên cần tìm để xóa: ");
        int id = sc.nextInt();
        boolean check1 = false;
        for (int i = 0; i< listEmployee.size();i++){
            if (listEmployee.get(i).id==id){
                check1 = true;
                listEmployee.remove(listEmployee.get(i));
                System.out.println("\tDanh sách nhân viên sau khi xóa: ");
                for (Employee emp:listEmployee){
                    System.out.println(emp);
                }
            }
        }
        if (check1==false){
            System.out.println("\tKhông có nhân viên này");
        }
    }
    }

