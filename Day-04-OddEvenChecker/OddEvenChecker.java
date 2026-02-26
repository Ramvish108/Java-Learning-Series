import java.util.*;

public class OddEvenChecker {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true){
    System.out.println("enter the num to check even or odd and 0 for exit");
    int num=sc.nextInt();
    if (num==0){
        System.out.println("goodbye");
        break;
    }
    if(num%2==0){
        System.out.println("Num is even ");
    
    }
    else{
        System.out.println("Num  is Odd");

    }}
}    
}
