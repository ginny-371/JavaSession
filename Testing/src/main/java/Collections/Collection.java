package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Collection {
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
//1.1 Đếm số người theo từng quốc tịch in ra màn hình
        public void peopleByCountry(){
            Map<String,Integer> countPeoplebyCountry = new HashMap<>();
            for (Person i:people){
                Integer countPerson = countPeoplebyCountry.get(i.getNationality());
                if(countPerson==null) countPeoplebyCountry.put(i.getNationality(),1);
                else countPeoplebyCountry.put(i.getNationality(),countPerson+1);
            }
            for (Map.Entry<String,Integer>entry:countPeoplebyCountry.entrySet()){
                System.out.printf("\n- %s: %d",entry.getKey(),entry.getValue());
            }
        }

//1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
        public void bai2(){
            ArrayList<Person> bai2 = new ArrayList<>(List.of());
            for (Person i:people){
                if (i.getAge()>25){
                    bai2.add(i);
                }
            }
            var result = bai2.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
            for (Person over25: result)
            {
                System.out.printf("\n- %s - %s - %d",over25.getName(), over25.getNationality(), over25.getAge());
            }
        }
//1.3 Tính trung bình tuổi của người theo từng quốc gia
        public void bai3(){
            Map<String,List<Person>> mapPeopleByCountry = new HashMap<>();
            mapPeopleByCountry = people.stream().collect(Collectors.groupingBy(w->w.getNationality()));
            for (Map.Entry<String,List<Person>> i :mapPeopleByCountry.entrySet()){
                int sum = 0;
                for (Person age: i.getValue()){
                    sum = sum +age.getAge();
                }
                double avrAge = (double) sum/i.getValue().size();
                System.out.printf("\n- %s: %.1f", i.getKey(), avrAge);
            }
        }
//1.4 In ra màn hình đánh giá tuổi mỗi người
        public void bai4(){
            String danhGia = "";
            for (Person i: people){
                if (i.getAge()<20){
                    danhGia = "nổi loạn";
                }
                else if (i.getAge()>=20&& i.getAge()<=30){
                    danhGia = "việc làm";
                }
                else if (i.getAge()>=31 && i.getAge()<=40){
                    danhGia = "sự nghiệp";
                }
                else danhGia = "hưởng thụ";
                System.out.printf("\n- %s - %s - %d - %s",i.getName(), i.getNationality(),i.getAge(),danhGia);
            }
        }
}
