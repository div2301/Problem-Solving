import java.util.*;
class foursix{
    public static void main(String[] args){
        int n,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for n : ");
        n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++)
        {                                                         
            sum=sum+i;
        }
        System.out.println("sum is " + sum);
    }
}