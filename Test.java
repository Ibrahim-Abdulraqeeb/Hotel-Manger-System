package Project;
import java.io.IOException ;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by khaled on 12/10/2020.
 */
public class Test {
    public static void main(String[] args)  {
    Scanner in = new Scanner(System.in);
        Collection c = new Collection();
        Room r1= new Room("1",'y',1);
        Room r2= new Room("2",'y',1);
        Room r3= new Room("3",'y',1);
        Room r4= new Room("4",'y',1);
        Room r5= new Room("5",'y',1);
        Room r6= new Room("6",'y',1);
        Room r7= new Room("7",'y',1);
        Employee e ;
        Customer t  ;
        Reservation rev  ;
        c.add_Room(r1);
        c.add_Room(r2);
        c.add_Room(r3);
        c.add_Room(r4);
        c.add_Room(r5);
        c.add_Room(r6);
        c.add_Room(r7);
        char cho ;
        while (true) {
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\tHotel Management System");
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t========================");
            System.out.println("1)Add Reservation .\n2)Display All Customers .\n3)Check of existence for Customer in the System .\n4)Display Empty Rooms .\n5)Display All Rooms .\n" +
                    "6)Edit OR Remove Reservation .\n7)Add Employee .\n8)Display Employees .\n" +
                    "9)Search for Employee .\na)Remove Employee .\nb)Display All Reservation .\ne)TO EXIT FROM SYSTEM");
            //////////////////////////////////////////////////////////////
            System.out.println("\n\n\nEnter your choice :");
            cho = in.next().charAt(0);
            System.out.println("\n");
            /////////////////////////////////////////////////////////////
            if (cho == '1') {

                System.out.println("ADD RESERVATION\n==========\n\n");
                System.out.println("Enter Customer first and last name : ");
                in.nextLine();
                String x = in.nextLine();
                System.out.println("Enter Customer Identification :");
                String p = in.next();
                System.out.println("Enter Customer Phone Number :");
                String q = in.next();
                System.out.println("Enter the Social Status fo Customer :");
                char s = in.next().charAt(0);
                System.out.println("Enter the payment : ");
                double y = in.nextDouble();
                System.out.println("Enter the period : ");
                int z = in.nextInt();
                System.out.println("Empty Rooms :\n============\n");
                c.display_Empty_R();
                System.out.println("\n\n\n================================\n\n\n");
                System.out.println("Enter the Id of the room u want : ");
                String n =in.next();
                t = new Customer(x,p,q,s);
                c.addCustomer(t);
                if (n.equals(r1.getR_id()))
                {
                    rev = new Reservation(r1,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r2.getR_id()))
                {
                    rev = new Reservation(r2,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r3.getR_id()))
                {
                    rev = new Reservation(r3,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r4.getR_id()))
                {
                    rev = new Reservation(r4,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r5.getR_id()))
                {
                    rev = new Reservation(r5,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r6.getR_id()))
                {
                    rev = new Reservation(r6,t,y,z);
                    c.addReservation(rev);
                }
                if (n.equals(r7.getR_id()))
                {
                    rev = new Reservation(r7,t,y,z);
                    c.addReservation(rev);
                }

                System.out.println("....OK....\n\n");
                c.displayAllReservation();
                System.out.println("\n\n______________________________________________________________" +
                        "______________________________________________________________________________" +
                        "_________________________________________________________\n\n");
                System.out.println("\n\n\n\n");
                c.displayAllRooms();

            }
            //////////////////////////////////////////////////////////////////
            if (cho == '2') {
                System.out.println("\n");
                System.out.println("Customers List :");
                System.out.println("_________________\n");
                c.dispalyAllCustomers();
                System.out.println("\n");System.out.println("\n");
            }
            //////////////////////////////////////////////////////////////////
            if (cho=='3')
            {
                System.out.println("Enter  phone num for Checking IF the customer in the System :");
                String x = in.next();
                System.out.println("============\n");
                c.searchCustomer(x);
                System.out.println("\n============\n\n");
            }
            /////////////////////////////////////////////////////////////////
            if (cho=='4')
            {

                System.out.println("Empty Rooms :\n============\n");
                c.display_Empty_R();
            }
            /////////////////////////////////////////////////////////////////
            if(cho=='5')
            {
                System.out.println("Rooms :\n=======\n");
                c.displayAllRooms();
                System.out.println("Press Any key to continue ...");
                in.next();

            }
            //////////////////////////////////////////////////////////////////
            if(cho=='6')
            {
                System.out.println("Enter the name of customer to Edit or Remove a Reservation :");
                String x = in.next();
                c.EditRes(x);
                System.out.println("Rooms :\n=======\n");
                c.displayAllRooms();
            }
            //////////////////////////////////////////////////////////////////
            if(cho=='7')
            {
                System.out.println("Add Employees : \n\n");
                System.out.println("Enter Customer first and last name : ");
                in.nextLine();
                String x = in.nextLine();
                System.out.println(" Enter Employee ID :");
                String id = in.next();
                System.out.println(" Enter Employee Phone Number : ");
                String phone = in.next();
                System.out.println(" Enter Emoloyee Salary : ");
                double sal = in.nextDouble();
                e = new Employee(x,id,phone,sal);
                c.addEmployee(e);
            }
            //////////////////////////////////////////////////////////////////

            if (cho=='8')
            {
                System.out.println("\n Employees : ");
                System.out.println("==============");
                c.displayAllEmployees();
                System.out.println("\n");
            }

            //////////////////////////////////////////////////////////////////
            if (cho=='9')
            {
                System.out.println(" Enter Emoloyee id for searching : ");
                String id = in.next();
                c.searchForEmployee(id);
            }
            //////////////////////////////////////////////////////////////////
            if (cho=='a')
            {
                System.out.println(" Enter Employee id for deleting : ");
                String id = in.next();
                c.RemoveEmployee(id);
            }
            //////////////////////////////////////////////////////////////////
            if (cho=='b')
            {
                c.displayAllReservation();
                System.out.println("\n\n______________________________________________________________" +
                        "______________________________________________________________________________" +
                        "_________________________________________________________\n\n");
            }

            if (cho=='e')
            {
                System.exit(0);
            }
            /////////////////////////////////////////////////////////////////

        }
    }
}
