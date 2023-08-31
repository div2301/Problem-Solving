import java.util.*;
class eightthree{
    public static int greaterNum(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
        System.out.println("greater of the two is: "+greaterNum(x,y));
    }
}