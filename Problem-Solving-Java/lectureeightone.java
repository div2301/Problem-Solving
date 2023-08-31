import java.util.*;
class eightone{
    public static void average(int a,int b,int c){
        System.out.println("Average is: "+(a+b+c)/3);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("enter 3 numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sc.close();
        average(x,y,z);
    }
}