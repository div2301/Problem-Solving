import java.util.*;
class eighteight{
    public static int powerOfNum(int x,int n){
    int i=1,p=1;
        for(i=1;i<=n;i++){
            p=p*x;
        }
    return p;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("enter a number 'x' and power 'n' : ");
        x=sc.nextInt();
        n=sc.nextInt();
        sc.close();
        System.out.println("Value of 'x' raise to power 'n' is: " + powerOfNum(x,n));
    }
}
