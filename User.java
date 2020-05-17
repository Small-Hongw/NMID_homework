package CarRentSystem;
import java.util.Scanner;
public class User {

    public int rentNum(){
        Scanner a =new Scanner(System.in);
        int num = a.nextInt();
        if(num < 0)
            return -1;
        else
            return num;
    }

    public int rentDays(){
        Scanner b = new Scanner(System.in);
        int num =b.nextInt();
        if(num < 0)
            return -1;
        else
            return num;
    }
}
