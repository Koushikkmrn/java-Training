import java.io.*;
import java.util.Scanner;
public class TankCpacity {
    public static void main(String[] args) {
        int capacity,i;
        int cnt = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the capacity : ");
        capacity = scan.nextInt();
        System.out.println("Enter the i : ");
        i = scan.nextInt();
        int start = capacity;
        while(capacity!=0){
            capacity = capacity - i;
            if(capacity>start){
                capacity = start;
            }
            cnt+=1;
        }
        System.out.println(cnt);
    }
    
}