import java.util.*;
class sixone{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter value for n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print("*");
            for(j=1;j<=(2*n)-(2*i);j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++)
                System.out.print("*");
            for(j=1;j<=(2*n)-(2*i);j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}