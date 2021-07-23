
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public String name;

    public String email;

    public String job;

    public String gender;

    public String city;

    public int salary;

    public String birthdate;

    public LocalDate convertStringToLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(birthdate, formatter);
    }

    public int getAge() {
        return Period.between(convertStringToLocalDate(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", birthdate=" + convertStringToLocalDate() +
                '}';
    }
}
