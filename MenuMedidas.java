import java.util.Scanner;

public class MenuMedidas {

    public Scanner scanner = new Scanner(System.in);

    public void exibirMenu(){
        System.out.println();
        System.out.println();
        System.out.println("****** QUAL OPERAÇÃO DESEJA FAZER ******");
        System.out.println();
        System.out.println("1) QUILOGRAMA PARA LIBRA");
        System.out.println("2) LIBRA PARA QUILOGRAMA");
        System.out.println("3) METRO PARA QUILOMETRO");
        System.out.println("4) QUILOMETRO PARA METRO");
        System.out.println("5) CELCIUS PARA FAHRENHEIT");
        System.out.println("6) FAHRENHEIT PARA CELCIUS");
        System.out.println("7) KM POR HORA PARA METROS POR SEGUNDOS");
        System.out.println("8) METROS POR SEGUNDOS PARA KM POR HORA");
        System.out.println("9) METROS QUADRADOS PARA HECTARES");
        System.out.println("10) HECTARES PARA METROS QUADRADOS");
        System.out.println("0) SAIR");
    }


    public int obterOpcao(){
        System.out.println();
        System.out.print("DIGITE A CONVERÇÃO DESEJADA: ");
        return scanner.nextInt();
    }



}
