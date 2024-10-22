import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for(int i = 1;i<=10;i++){
            System.out.println("Informe o "+i+"° numero: ");
            int n = sc.nextInt();
            soma +=n;
        }
            double media = (double)soma/10;
        System.out.println("Media = "+media);
    }
}
