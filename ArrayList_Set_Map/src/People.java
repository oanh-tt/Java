import java.util.*;
import java.util.stream.Collectors;

public class People {

        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        public void addPeople(){
            System.out.println("Danh sách nhân sự");
            people.stream().forEach(System.out::println);
        }

//1.1 Đếm số người theo quốc tịch
    public void Bai1_1(){
        System.out.println("1.1 Số người theo quốc tịch: ");
        HashMap<String, Integer> countPeopleByCoutry = new HashMap<>();
        for (Person person:people){
            Integer count = countPeopleByCoutry.get(person.getNationality());
            if (count == null) {
                countPeopleByCoutry.put(person.getNationality(), 1);
            } else {
                countPeopleByCoutry.put(person.getNationality(), count + 1);
            }
        };

        for (Map.Entry<String, Integer> entry : countPeopleByCoutry.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }}
//1.2 Sắp xếp theo tên những người trên 25 tuổi
    public void Bai1_2(){
        System.out.println("1.2 In ra những người trên 25 tuổi và sắp xếp theo tên");
        ArrayList<Person> bai1_2 = new ArrayList<>(List.of());
        for (Person person:people){
            if (person.getAge()>25){
                bai1_2.add(person);
            }
        }
        var result = bai1_2.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        for (Person over25: result)
        {
            System.out.printf("\n- %s - %s - %d",over25.getName(), over25.getNationality(), over25.getAge());
        }}
//1.3 Tính tuổi trung bình của từng quốc gia
    public void Bai1_3() {
        System.out.println("\n1.3 Tuổi trung bình của từng quốc gia");
        Map<String, List<Person>> mapPeopleByCountry = new HashMap<>();
        mapPeopleByCountry = people.stream().collect(Collectors.groupingBy(w -> w.getNationality()));
        for (Map.Entry<String, List<Person>> person : mapPeopleByCountry.entrySet()) {
            int sum = 0;
            for (Person age : person.getValue()) {
                sum = sum + age.getAge();
            }
            double avrAge = (double) sum / person.getValue().size();
            System.out.printf("\n- %s: %.1f", person.getKey(), avrAge);
        }
    }
 //1.4 Đánh giá tuổi mỗi người
    public void Bai1_4(){
        System.out.println("\n1.4 Đánh giá tuổi mỗi người");
        String danhGia = "";
        for (Person person: people){
            if (person.getAge()<20){
                danhGia = "nổi loạn";
            }
            else if (person.getAge()>=20&& person.getAge()<=30){
                danhGia = "việc làm";
            }
            else if (person.getAge()>=31 && person.getAge()<=40){
                danhGia = "sự nghiệp";
            }
            else danhGia = "hưởng thụ";
            System.out.printf("\n- %s - %s - %d - %s",person.getName(), person.getNationality(),person.getAge(),danhGia);
        }
    }

}




