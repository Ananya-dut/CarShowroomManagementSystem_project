package CarShowRoomManagement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock=0;
    String manager_name;
    @Override
    public void get_details(){
        System.out.println("Showroom name:"+showroom_name);
        System.out.println("Showroom address:"+showroom_address);
        System.out.println("Manager name:"+manager_name);
        System.out.println("total Employees:"+total_employees);
        System.out.println("total cars in stocks:"+total_cars_in_stock);
    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("===================================== **** ENTER SHOWROOM DETAILS **** ==========================================");
        System.out.println();
        System.out.print("showroom name:");
        showroom_name=sc.nextLine();
        System.out.print("showroom address:");
        showroom_address=sc.nextLine();
        System.out.print("manager name:");
        manager_name=sc.nextLine();
        System.out.print("total number of employees:");
        total_employees=sc.nextInt();
        System.out.print("total cars in stock:");
        total_cars_in_stock=sc.nextInt();
    }
}
