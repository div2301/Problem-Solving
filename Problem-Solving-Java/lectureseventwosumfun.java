import java.util.*;
class seventwo{
    public static int GetSum(int a,int b){
    return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
        System.out.println("Sum is: " + GetSum(x,y));
    }
}
