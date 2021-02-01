package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by khaled on 12/10/2020.
 */
public class Collection {

    private ArrayList<Reservation> rev ;
     ArrayList<Room> room ;
     ArrayList<Customer> customer ;
    private ArrayList<Employee> employee ;

    public Collection() {
        rev = new ArrayList<Reservation>();
        room = new ArrayList<Room>();
        customer = new ArrayList<Customer>();
        employee = new ArrayList<Employee>();
    }

    public boolean add_Room(Room b)
    {

        room.add(b);
        return true ;
    }

    public void display_Empty_R()
    {
        System.out.println("Room_ID"+"    "+"Room_Status");
        System.out.println("_____________________________");

                for (int j=0; j<room.size(); j++)
                {
                    if (room.get(j).getStatus()=='y'){
                        System.out.println(" r "+room.get(j).getR_id()+"   " +
                                "           "+room.get(j).getStatus());
                    }

                }



    }

    public void search_Room(String x)
    {
        System.out.println("Room_ID"+"    "+"Room_Status");
        System.out.println("_____________________________");
        for (int i = 0; i <room.size() ; i++) {
            if (x==room.get(i).getR_id())
            {
                System.out.println("  "+room.get(i).getR_id()+"              "+room.get(i).getStatus());
                break ;
            }
        }
    }

    public void displayAllRooms()
    {
        System.out.println("Room_ID"+"    "+"Room_Status"+"    "+"    Floor"+"         " +
                "   "+"price");
        System.out.println("______________________________________________________");

        for (int i = 0; i <room.size() ; i++) {

            for (int j=0; j<rev.size() ; j++) {

             if(room.get(i).getR_id()==rev.get(j).getR().getR_id())
               {
                room.get(i).setStatus('n');
               }
            }
            System.out.println(room.get(i)+"\n");
        }
    }

    public void searchCustomer(String phone)
    {
        int p=0;
        String x ;
        for (int i = 0; i <customer.size() ; i++) {
             x=customer.get(i).getPhone();
            if (phone.equals(x))
            {
                System.out.println("The Customer is already in the System");
                break ;
            }
            p++;
        }
           if (p==customer.size())
           {
               System.out.println("The Customer is not in the System");
           }
    }

    public boolean addReservation(Reservation reservation)
    {   int z=0;
        char o ='n';
        String x , y ;
        for (int i = 0; i < room.size(); i++) {
            x=room.get(i).getR_id() ;
            y=reservation.getR().getR_id();
            if (x.equals(y))
            {
                room.get(i).setStatus(o);
            }
        }
       rev.add(reservation);
        return true ;
    }

    public void displayAllReservation()
    {
        System.out.println("==============================================================================" +
                "=========================================================================================" +
                "==============================");
        System.out.printf("%-10s%24s%22s%21s%23s%22s%22s%28s","Customer_name","social_status","Room_num"
        ,"Payment","Period","Rest_of_pay","Total","Reservation Date");
        System.out.println();
        System.out.println("==============================================================================" +
                "=========================================================================================" +
                "==============================");
        for (int i = 0; i <rev.size() ; i++) {
            System.out.println(rev.get(i));
        }
    }

    public boolean addCustomer(Customer c)
    {
        customer.add(c);
        return true ;
    }

    public boolean addEmployee(Employee e)
    {
        employee.add(e);
        return true ;
    }

    public void displayAllEmployees()
    {
        System.out.println(" Name                         ID                   PhoneNum               Salary");
        System.out.println("===================================================================================================");
        for (int i = 0; i <employee.size() ; i++) {
            System.out.println(employee.get(i));
        }
    }

    public void searchForEmployee(String id)
    {
        System.out.println(" Name                ID                   PhoneNum                Salary");
        System.out.println("==============================================================================");
        for (int i = 0; i <employee.size() ; i++) {
            String x = employee.get(i).getId();
            if (id.equals(x))
            {
                System.out.println(employee.get(i));
                break ;
            }
        }
    }

    public boolean RemoveEmployee(String id )
    {
        for (int i = 0; i <employee.size() ; i++) {
            String x = employee.get(i).getId();
            if(x.equals(id))
            {
                employee.remove(i);
                System.out.println("\nRemoved Successfully\n");
                return true ;
            }

        }
        return false ;
    }

    public void EditRes(String name)
    {
        String x = null, y ,o;
        for (int i = 0; i <rev.size() ; i++) {
            o=rev.get(i).getC().getName();
            Scanner in = new Scanner(System.in);
            int choice ;
            if (name.equals(o))
            {
                System.out.println("\t\t\t\t\tEnter your choice :");
                System.out.println("1)Edit Payment ");
                System.out.println("2)Remove Reservation ");
                System.out.println("3)Edit Period ");
                choice = in.nextInt();
                if(choice==1)
                {
                    System.out.println("Edit payment , Enter the payment : ");
                    double p =in.nextDouble(), q ;
                    q=rev.get(i).getPayment()+p ;
                    rev.get(i).setPayment(q);
                    break ;
                }
                else if(choice==2)
                {
                    int z=0;
                    char p ='y';
                    String m , n ;
                    for (int j = 0; j < room.size(); j++) {
                        m=room.get(j).getR_id() ;
                        n=rev.get(i).getR().getR_id();
                        if (m.equals(n))
                        {
                            room.get(i).setStatus(p);
                        }
                    }
                    rev.remove(i);
                    System.out.println("Removed");
                    break;
                }
                 if (choice==3)
                {
                    System.out.println("Current period in Reservation is "+rev.get(i).getPeriod()+"Enter Additional period :");
                    int w = in .nextInt() , v ;
                    v=rev.get(i).getPeriod()+w;
                    rev.get(i).setPaired(v);
                }
            }
            if(i==rev.size())
            {
                System.out.println("There is no reservation for this name .");
            }
        }
    }

    public void dispalyAllCustomers()
    {
        System.out.println("  "+"Name"+"                   "+"Identification"+"             "+"Phone" +
                ""+"           "+"Social Status");
        System.out.println("================================================================================================");
        for (int i = 0; i <customer.size() ; i++)
        {
            System.out.println(customer.get(i));
        }
    }

    public void RemoveReapet(String x)
    {
        for (int i = 0; i <room.size() ; i++) {
            if(x==room.get(i).getR_id())
            {
                room.remove(i);
            }
        }
    }

}
