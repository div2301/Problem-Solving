import java.util.*;
class sevenfour{
    public static int GetFact(int n){
        int i,f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number: ");
        n=sc.nextInt();
        sc.close();
        System.out.println("factorial of n is : " + GetFact(n));
    }
}