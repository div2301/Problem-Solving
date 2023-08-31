import java.util.*;
class threefour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button : ");
        int button = sc.nextInt();
        sc.close();
        if(button==1)
            System.out.println("Hello");
        else if(button==2)
            System.out.println("Namaste");
        else if(button==3)
            System.out.println("Bonjour");
        else
            System.out.println("Invalid choice");
    }
}