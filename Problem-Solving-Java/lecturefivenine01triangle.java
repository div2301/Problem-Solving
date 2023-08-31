import java.util.*;
class fivenine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                // if(i%2!=0){
                //     if(j%2==0)
                //         System.out.print("0 ");
                //     else
                //         System.out.print("1 ");
                // }
                // else
                // {
                //     if(j%2==0)
                //         System.out.print("1 ");
                //     else
                //         System.out.print("0 ");
                // }
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}