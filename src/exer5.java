import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int n = sc.nextInt();

        while(n<=0) {
                System.out.println("Informe um valor: ");
                n = sc.nextInt();
            }
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }

    }
}

