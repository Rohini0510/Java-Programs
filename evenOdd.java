import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println(" Enter the number which is to be evaluated as even or odd:");
        int ans=in.nextInt();
        if (ans%2==0){
            System.out.println(ans + " is even");
        }else {
            System.out.println(ans+ " is odd");
        }
    }
}
