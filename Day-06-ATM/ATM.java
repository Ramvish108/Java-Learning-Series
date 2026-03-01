import java.util.*;

class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER  4 DIGIT PIN:");
        int pin=sc.nextInt();
        int balance =2000;
        int withdraw=0;
        int deposit=0;
        while(true){

        System.out.println("1. Balance Check \n2. Withdrwal \n3. Deposit\n4.Cancel ");
        int cas=sc.nextInt();
        switch(cas){
        case 1:
            System.out.print("Your Blance is : "+ balance);
            break;
        case 2:
            System.out.println("How Much to Withdrwal");
            withdraw=sc.nextInt();
            if(withdraw>balance){
                System.out.println("Balance is "+balance+" so you can withdraw upto this ");
                
            }
            else{
                balance=balance-withdraw;
                System.out.println("now your Balance is "+balance);

            }break;
        case 3:
             
                System.out.println("Enter how much to deposit ");
                deposit =sc.nextInt();
                balance=balance+deposit;
                System.out.println("now you balance is "+balance);
                break;
        case 4:
            System.out.println("all process is terminated ");
            return;
        default:
            System.out.println("Invalid choice ");


        }

    }}
}