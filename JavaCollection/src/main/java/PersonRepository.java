import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonRepository {
    private List<Person> people = new ArrayList<>();

    public PersonRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;
        try {
            file = ResourceUtils.getFile("classpath:static/personsmall");
            CollectionType listType =
                    mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
            people = mapper.readValue(file, listType);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showPerson() {
        people.forEach(item -> System.out.println(item.toString()));
    }
    public void addPerson(){
        people.add(new Person("Dong","tong@onemount.com","Quality Control","Male","Ha Noi",35000000, LocalDate.of(1992,03,01).toString()));
        showPerson();
    }
    public void editPerson(){
        ListIterator<Person> interator = people.listIterator();
        while (interator.hasNext()){
            Person next = interator.next();
            if (next.getName().equals("Dong")){
                interator.set(new Person("Thanh","tong1@onemount.com","Quality Control","Male","Ha Noi",35000000,"1992-02-21"));
            }
        }
        showPerson();
    }
    public void removePerson(){
        ListIterator<Person> interator = people.listIterator();
        while (interator.hasNext()){
            Person next = interator.next();
            if (next.getName().equals("Dong")){
                interator.remove();
            }
        }
        showPerson();
    }

    //1. Trả về danh sách 'developer' ở các thành phố Hanoi, Saigon, Shanghai
    public void Bai1() {
        Map<String,List<Person>> result = people
                .stream()
                .filter(x -> x.getJob().equals("developer"))
                .collect(Collectors.toList())
                .stream().filter(x->x.getCity().equals("Shanghai")|| x.getCity().equals("Hanoi")||x.getCity().equals("Saigon"))
                .collect(Collectors.groupingBy(Person::getCity));
        for (Map.Entry<String, List<Person>> entry : result.entrySet()) {
            System.out.println("- "+entry.getKey() + ":\n" + entry.getValue().toString());
            System.out.println();
        }
    }

    //2. Tìm ra thành phố có độ tuổi trung bình của lập trình viên trẻ nhất
    public List<Map.Entry<String,Double>> Bai2() {

        Map<String, List<Person>> groupDevelopersByCity = people
                .stream()
                .filter(p -> p.getJob().equals("developer"))
                .collect(Collectors.groupingBy(Person::getCity));

        Map<String, Double> cityAverageAge = groupDevelopersByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .collect(Collectors.averagingInt(Person::getAge))));


        return cityAverageAge.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(1)
                .collect(Collectors.toList());
    }
    //2.12 tỷ lệ nam / nữ trong toàn bộ dữ liệu
    public Double maleFemaleRatio(List<Person> people){
        Long femaleCount = people
                .stream()
                .filter(x->x.getGender().equals("Female"))
                .collect(Collectors.counting());
        return (double)(people.size()-femaleCount)/femaleCount;
    }
    //Tỉ lệ nam nữ của từng thành phố
    public Map<String,Double> maleFemaleRatioByCity(){
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> maleFemaleRatio(entry.getValue())
                ));
    }
    //Tỉ lệ nam nữ của từng job
    public Map<String,Double> maleFemaleRatioByJob(){
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getJob))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> maleFemaleRatio(entry.getValue())
                ));
    }
}

