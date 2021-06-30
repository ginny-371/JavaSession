import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {
    private List<Person> people = new ArrayList<Person>();

    public PersonRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;
        try {
            file = ResourceUtils.getFile("classpath:static/person");
            people.addAll(mapper.readValue(file, new TypeReference<List<Person>>() {
            }));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //1. Trả về danh sách 'developer' ở các thành phố Hanoi, Saigon, Shanghai
    public Map<String, Person> Bai2() {
        Map<String,Person> result = people
                .stream()
                .filter(x -> x.getJob().equals("developer"))
                .collect(Collectors.toList())
                .stream().filter(x->x.getCity()=="Shanghai"|| x.getCity()=="Hanoi"||x.getCity()=="Saigon")
                .collect(Collectors.toMap(Person::getCity, Function.identity()));
        return result;
    }
}

