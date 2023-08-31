import java.util.*;
class hwseventhree{
    public static void Table(int n){
        int i=1;
        for(i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+n*i);
        return;    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number: ");
        n=sc.nextInt();
        sc.close();
        Table(n);
    }
}