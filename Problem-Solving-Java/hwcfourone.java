import java.util.*;
class hwfourone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter value for n: ");
        n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            System.out.print(i+" ");
        }
    }
    
}
