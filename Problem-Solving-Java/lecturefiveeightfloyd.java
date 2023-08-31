import java.util.*;
class fiveeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int i,j,n,c=1;
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                    System.out.print(c+" ");
                    c++;
            }
            System.out.println();
        }
    }
}   