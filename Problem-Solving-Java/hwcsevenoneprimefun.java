import java.util.*;
class hwsevenone{
    public static boolean isPrime(int n){
        int i;
        for(i=2;(i*i)<n;i++){
            if(n%i==0)
                return false;            
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        boolean b;
        System.out.println("enter a number: ");
        a=sc.nextInt();
        sc.close();
        b=isPrime(a);
        if(b)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");  
    }
}