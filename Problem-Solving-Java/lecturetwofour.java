import java.util.*;
class twofour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name,name1;
        System.out.println("Enter name :");
        name = sc.next();
        System.out.println(name);
        System.out.println("Enter full name : ");
        name1 = sc.nextLine();
        sc.close();
        System.out.print(name1);
    }
}
