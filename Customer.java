package Project;

/**
 * Created by khaled on 12/10/2020.
 */
public class Customer extends Person {

    private char social_s ;

    public Customer(String name, String id, String phone, char social_s) {
        super(name, id, phone);
        this.social_s = social_s;
    }

    public char getSocial_s() {
        return social_s;
    }

    public void setSocial_s(char social_s) {
        this.social_s = social_s;
    }

    public String toString()
    {
        return super.toString()+"                    "+getSocial_s();
    }
}
