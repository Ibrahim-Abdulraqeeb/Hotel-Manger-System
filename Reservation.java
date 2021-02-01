package Project;

import java.util.Date;

/**
 * Created by khaled on 12/10/2020.
 */
public class Reservation {
    private Room r ;
    private Employee e ;
    private Customer c ;
    private Date d = new Date() ;
    private double payment ;
    private int period ;

    public Reservation() {
    }

    public Reservation(Room r, Customer c, double payment, int period) {
        this.r = r;
        this.c = c;
        this.payment = payment;
        this.period = period;
    }

    public Date getD() {
        return d;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Room getR() {
        return r;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public int getPeriod() { return period; }

    public void setPaired(int Period) { this.period = period; }

    public String toString()
    {
        return String.format("%-10s%20s%20s%27s%22s%23s%24s%39s",getC().getName(),getC().getSocial_s()
        ,getR().getR_id(),getPayment(),getPeriod(),((getPeriod()*getR().getPrice())-getPayment()),
                (getPeriod()*getR().getPrice()),getD());

    }


}
