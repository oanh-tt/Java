public class Employee {
    int id;
    String name;
    int age;
    String add;
    String phone;
    public Employee (int id, String name, int age, String add, String phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
        this.phone=phone;
    }
    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
