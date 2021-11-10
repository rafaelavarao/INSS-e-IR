import java.util.Scanner;

public class ex16
{
    public static double valorPagoINSS (double salario)
    {
        double aliquota = 0;
        
        if(salario <= 1317.07){
             aliquota = 8.0;
             return aliquota;
        }

        if(salario >= 1317.08 && salario <= 2195.12){
            aliquota = 9.0;
            return aliquota;
        }

        if(salario >= 2195.13 && salario <= 4390.24){
            aliquota = 11.0;
            return aliquota;
        }

        if(salario > 4390.25){
            aliquota = 482.9;
            return aliquota;
        }
        
        return aliquota;
    } 
    
    public static double valorPagoIR (double salario)
    {
        double parcelaADedusir = 0;
        
        if(salario <= 1868.22){
            parcelaADedusir = 0.0;
        }
        
        if(salario >= 1868.23 && salario <= 2799.86){
            parcelaADedusir = 140.12;
        }
        
        if(salario >=  2799.87 && salario <= 3733.19){
            parcelaADedusir = 350.11;
        }
        
        if(salario >= 3733.20 && salario <= 4664.68){
            parcelaADedusir = 630.10;         
        }
        
        if( salario > 4664.68){
            parcelaADedusir = 863.33;
        }
        
        return parcelaADedusir; 
    }

    public static void main (String[] args)
    { 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um salario:");
        double salarioDigitado = teclado.nextDouble();

        double aliquotaINSS = valorPagoINSS(salarioDigitado);
        double impostoDeRenda = valorPagoIR(salarioDigitado);
        
        double salarioLiquido = (salarioDigitado - aliquotaINSS) - impostoDeRenda;
        
        System.out.printf("O valor a ser pago para o INSS é %s%.2f.", "$",aliquotaINSS);
        System.out.printf("\nO valor a ser pago de Imposto de Renda ´é %s%.2f.","$", impostoDeRenda);
        System.out.printf("\nO salario liquido é %s%.2f.", "$",  salarioLiquido);
        System.out.printf("\nO salario bruto é %s%.2f.", "$", salarioDigitado);
    }
}