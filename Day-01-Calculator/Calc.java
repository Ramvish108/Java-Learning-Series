import java.util.Scanner;

class calc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num :");
        int a=sc.nextInt();
        System.out.print("enter a num :");
        int b=sc.nextInt();
        
        System.out.println("1 for add\n2 for sub\n3 for divide\n4 for mul");
        System.out.print("enter use case :");
        int c=sc.nextInt();
        switch(c){
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:
            if(b==0){
                System.out.println("Cannot divide by zero ");
            }
            else{
            System.out.println(a/b);
            }
            break;
        case 4:
            System.out.println(a*b);
            break;
        default:
            System.out.println("enter correct num :");

        }
    }
}