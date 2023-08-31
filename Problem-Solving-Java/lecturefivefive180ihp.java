import java.util.*;
class fivefive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int i,j,n;
        n=sc.nextInt();
        sc.close();
        for(i=n;i>=1;i--){
            for(j=1;j<=i-1;j++)
                    System.out.print("  ");
            for(j=i;j<=n;j++)
                    System.out.print("* ");
            System.out.println();
        }
    }
}    