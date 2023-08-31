import java.util.*;
class hwsixone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter value for n: ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=(2*n);i++){
            for(j=1;j<=(2*n);j++){
                if((i==j)||(i+j==(2*n)+1)||(j==1)||(j==(2*n)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}