import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativo = 0;

        for(int i =1;i<=10;i++) {
            System.out.println("Informe o "+i+" numero: ");
            int n = sc.nextInt();
            if(n<0){
                negativo++;
            }
        }
        System.out.println("Quantidade de numeros negativos: "+negativo);
        sc.close();
    }
}
