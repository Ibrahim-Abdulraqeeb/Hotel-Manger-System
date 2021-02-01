package Project;

/**
 * Created by khaled on 12/10/2020.
 */
public class Room {
    private String R_id ;
    private char Status ;
    private int floor ;
    private double price = 15000 ;

    public Room(String r_id, char status, int floor) {
        R_id = r_id;
        Status = status;
        this.floor = floor;
    }

    public String getR_id() {
        return R_id;
    }

    public void setR_id(String r_id) {
        R_id = r_id;
    }

    public char getStatus() {
        return Status;
    }

    public void setStatus(char status) {
        Status = status;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return "  "+getR_id()+"              "+getStatus()+"              "+getFloor()+"              "
                +getPrice();
    }
}
