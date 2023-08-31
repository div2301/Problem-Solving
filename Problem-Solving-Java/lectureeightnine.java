import java.util.*;
class eightnine{
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
        System.out.println("gcd is : "+gcd(x,y));
    }
}
