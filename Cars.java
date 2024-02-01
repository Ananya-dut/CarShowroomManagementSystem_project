package CarShowRoomManagement;
import java.util.Scanner;
public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;
    @Override
    public void get_details(){
        System.out.println("name:"+car_name);
        System.out.println("color:"+car_color);
        System.out.println("fuel type:"+car_fuel_type);
        System.out.println("price:"+car_price);
        System.out.println("car type:"+car_type);
        System.out.println("transmission:"+car_transmission);
    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("====================================== **** ENTER CAR DETAILS **** ======================================================");
        System.out.println();
        System.out.print("car name:");
        car_name=sc.nextLine();
        System.out.print("car color:");
        car_color=sc.nextLine();
        System.out.print("car fuel type(petrol/diesel):");
        car_fuel_type=sc.nextLine();
        System.out.print("car price:");
        car_price=sc.nextInt();
        sc.nextLine();
        System.out.print("car type(sedan/suv/hatchback):");
        car_type=sc.nextLine();
        System.out.print("transmission type(automatic/manual):");
        car_transmission=sc.nextLine();
        total_cars_in_stock++;
    }
}
