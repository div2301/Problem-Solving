import java.util.*;
class eighttwo{
    public static void sumOfOdd(int n){
        int s=0,i=1;
        for(i=1;i<=n;i++){
            if(i%2!=0)
                s+=i;
        }
        System.out.println("Sum of odd numbers till "+n+" is:"+s);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        sc.close();
        sumOfOdd(n);
    }
}