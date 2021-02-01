package Project;

/**
 * Created by khaled on 12/10/2020.
 */
public class Person {
    private String name ;
    private String id ;
    private String phone ;

    public Person(String name, String id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString()
    {
        return "  "+getName()+"              "+getId()+"                "+getPhone();
    }
}
