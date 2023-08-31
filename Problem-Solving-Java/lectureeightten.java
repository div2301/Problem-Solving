import java.util.*;
class eightten{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n,a=0,b=1,c;;
        System.out.println("enter number of terms 'n' : ");
        n=sc.nextInt();
        sc.close();
        System.out.print("0 1 ");
        for(i=3;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
        }
    }
}
