package CarShowRoomManagement;


import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    @Override
    public void get_details(){
        System.out.println("ID:"+emp_id);
        System.out.println("name:"+emp_name);
        System.out.println("age:"+emp_age);
        System.out.println("department:"+emp_department);
        System.out.println("showroom name:"+showroom_name);
    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emp_id=String.valueOf(uuid);
        System.out.println("========================================== **** ENTER EMPLOYEE DETAILS **** =====================================");
        System.out.println();
        System.out.print("Employee name:");
        emp_name=sc.nextLine();
        System.out.print("employee age:");
        emp_age=sc.nextInt();
        sc.nextLine();
        System.out.print("employee department:");
        emp_department=sc.nextLine();
        System.out.print("showroom name:");
        showroom_name=sc.nextLine();
    }
}
