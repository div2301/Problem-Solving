import java.util.*;
class sixfour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter value for n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++)
                System.out.print(i);
            System.out.println();
        }
    }
}