import java.util.Scanner;


public class Main () {


    public static void main(String [] args){

             int anoFabricacao = 0;
             float valorVeiculo = 0.0f;
             float porcentagemDesconto = 0.0f;
             float valorDesconto = 0.0f;

             int totalCarrosSemiNovos = 0;
             int totalCarros = 0;

           Scanner leitor = new Scanner(System.in);

             char desejaRepetir = 'S';
             while (desejaRepetir == 's' || desejaRepetir == 'S') {

        //entrada de dados
           System.out.println("Digite o ano de fabricação");
           anoFabricacao = leitor.nextInt();

           System.out.println("Digite o valor do veículo");
           valorCarro = leitor.nextInt();
 

                 if (anoFabricacao <= 2000){
                  porcentagemDesconto = 0.12f;
                }else{
                  porcentagemDesconto = 0.07f;
                  totalCarrosSemiNovos++;
                } 
                 totalCarros++;
                
                 valorDesconto = valorVeiculo * procentagemDesconto;
                 valorPagar = valorVeiculo - valorDesconto;
                 
         System.out.println("O valor do desconto foi de: " + valorDesconto);
         System.out.println("O valor que deve ser pago é: " + valorPagar);
 
         System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
         desejaRepetir = leitor.next().charAt(0);

      }

    System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos); 
    System.out.println("Total de carros semi novos: " + totalCarros); 
    
              

   }
}
