import java.util.*;
class hwsixthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,k,n,val;
        System.out.println("Enter value for n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<n-i+1;j++)
                System.out.print(" ");
            val=1;
            for(k=1;k<=i;k++){
                System.out.print(val+" ");
                val=val*(i-k)/k;
                }
            System.out.println();    
        }
    }
}