import java.util.*;
class bnfourone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n,c=0;
        System.out.println("Enter number to check whether it is prime: ");
        n=sc.nextInt();
        sc.close();
        for(i=2;i<n;i++){
                if(n%i==0)
                c=1;
        }
        if(c==0)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
