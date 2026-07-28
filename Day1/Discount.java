import java.util.*;
import java.util.*;
public class Discount{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        double bill;
        if(p>=5000){
            bill = p-(p*20.00/100);
        }
        else if(p>2000){
            bill =p-(p*10.00/100);

        }
        else {
            bill=p;
        }
        System.out.println("amount payable: $ "+bill);
        
                }     }