import java.time.LocalDate;

public class Person {
    public String name;
    public String email;
    public String job;
    public String gender;
    public String city;
    public int salary;
    public LocalDate birthdate;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
