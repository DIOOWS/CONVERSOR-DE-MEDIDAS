import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        MenuMedidas menu = new MenuMedidas();
        Medidas med = new Medidas();
        Scanner scanner = new Scanner(System.in);


        while (true){
            menu.exibirMenu();
            int opcao = menu.obterOpcao();

            if (opcao == 0){
                System.out.println("PROGRAMA ENCERRADO OBRIGADO POR UTILIZAR!");
                break;
            }

            double medida = 0;

                // Verifica se a opção é válida antes de solicitar a medida
                if (opcao >= 1 && opcao <= 10 ){
                    while (true){
                    System.out.println();
                    System.out.print("DIGITE A MEDIDA PARA A CONVERSÃO (use ponto como separador decimal): ");
                    try {
                        medida = scanner.nextDouble();
                        break;  // Sai do loop se a entrada for válida
                    }catch (java.util.InputMismatchException e){
                        System.out.println();
                        System.out.println("( ####### Erro: Entrada inválida. Por favor, use ponto (.) como separador decimal. ########)");
                        scanner.next(); // Limpa a entrada inválida
                    }
                    }
                }

            switch (opcao){

                case 1:
                 System.out.println("---------------------------------------");
                System.out.println("QUILOGRAMA PARA LIBRA: " + med.convetQuilogramaParaLibra(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 2:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetLibraParaQuilograma(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 3:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetMetroParaQuilometro(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 4:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetquilometroParaMetro(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 5:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetCelciusParaFahrenheit(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 6:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetFahrenheitParaCelcius(medida));
                 System.out.println("---------------------------------------");
                 break;

                 case 7:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetKmPorHoraParaMetrosSegundos(medida));
                 System.out.println("---------------------------------------");
                 break;

                  case 8:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetMetrosSegundosParakmPorHora(medida));
                 System.out.println("---------------------------------------");
                 break;

                  case 9:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetMtrosQuadradosParaHectares(medida));
                 System.out.println("---------------------------------------");
                 break;

                  case 10:
                 System.out.println("---------------------------------------");
                System.out.println("Resultado: " + med.convetHectaresParaMtrosQuadrados(medida));
                 System.out.println("---------------------------------------");
                 break;

                 default:
                    System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE");
                      break;

            }

        }
        scanner.close();
    }
}
