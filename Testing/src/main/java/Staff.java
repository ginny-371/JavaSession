import java.util.ArrayList;
class Staff {
    String id;
    String name;
    int age;
    String address;
    String phonenumber;

    public Staff ( String id, String name, int age, String address, String phonenumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
