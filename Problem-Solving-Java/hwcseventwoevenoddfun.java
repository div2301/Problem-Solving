import java.util.*;
class hwseventwo{
    public static void evenOdd(int n){
        if(n%2==0)
            System.out.println("Even number");
        else    
            System.out.println("Odd number");
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        sc.close();
        evenOdd(n);
    }
}