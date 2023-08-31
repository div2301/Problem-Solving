import java.util.*;
class eightseven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1,n,a=0,b=0,c=0;
        do{
            System.out.println("enter a number: ");
            n=sc.nextInt();
            if(n==0)
                c++;
            else if(n>0)
                a++;
            else
                b++;
            System.out.println("enter 1 to continue and 0 to stop.");
            i=sc.nextInt();
        }while(i==1);
        sc.close();
        System.out.println("Number of zeroes are: "+c);
        System.out.println("Number of positive numbers are: "+a);
        System.out.println("Number of negative numbers are: "+b);
    }
}