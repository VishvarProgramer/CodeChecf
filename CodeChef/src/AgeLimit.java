import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many");
        int n=sc.nextInt();
        while(n-->0){
            /*while(n>0){
            n = n-1;*/
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();

            if(a>=x && a<y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
