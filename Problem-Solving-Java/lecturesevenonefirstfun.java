import java.util.*;
class sevenone{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("enter a name: ");
        name=sc.nextLine();
        sc.close();
        printMyName(name);
    }
}