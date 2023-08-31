import java.util.*;
class hwfivethree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
                System.out.print("  ");
            for(j=i;j>=1;j--)
                System.out.print(j+" ");
            for(j=2;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        
    }
}