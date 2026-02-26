import java.util.*;

public class TemperataureConvertor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Press 1 Fahrenheit to celcius \nPress 2 celcius  to Fahrenheit ");
        int c=sc.nextInt();
        System.out.println("enter the tempertaure :");
        int temp=sc.nextInt();
        if(c==2){
            System.out.print((temp*9/5)+32);
         }
        else if (c==1){
            System.out.println((temp-32)*5/9);
        }
        else {
            System.out.println("enter the correct tempertaure value ");

        }

    }
    
}
