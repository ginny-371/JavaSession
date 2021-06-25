import java.time.LocalDate;

public class Person {
    String firstname;
    String lastname;
    LocalDate birthday;

    public Person(String firstname, String lastname, LocalDate birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public Person() {
        Person Ginny = new Person("Ginny","Tống",LocalDate.of(1973,05,21));
    }
}
