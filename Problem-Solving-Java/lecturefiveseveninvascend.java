import java.util.*;
class fiveseven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int i,j,n;
        n=sc.nextInt();
        sc.close();
        // for(i=n;i>=1;i--){
        //     for(j=1;j<=i;j++){
        //             System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}