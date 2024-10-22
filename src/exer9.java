import java.util.Scanner;
public class exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intervalo = 0;
        for(int i =1;i<=10;i++) {
            System.out.println("Informe o "+i+" numero: ");
            int n = sc.nextInt();

            if(n>=10 && n<=20){
                intervalo++;
            }

        }
        if(intervalo>0){
            System.out.println("Quantidade de numeros entre 10 e 20: "+intervalo);
        }
        else{
            System.out.println("Não foram informados numeros no intervalo de 10 e 20");
        }
    }
}
