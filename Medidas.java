import java.util.Scanner;

public class Medidas {

       public Scanner scanner = new Scanner(System.in);


    public double convetQuilogramaParaLibra( double quilograma) {
        return  quilograma * 2.20462;
    }
      public double convetLibraParaQuilograma(double libra) {
        return  libra / 2.20462;
    }
       public double convetMetroParaQuilometro(double metro) {
        return  metro / 1000;
    }
     public double convetquilometroParaMetro(double quilometro) {
        return  quilometro * 1000;
    }
       public double convetCelciusParaFahrenheit(double celcius) {
        return  (celcius * 9/5) + 32;
    }
       public double convetFahrenheitParaCelcius(double fahrenheit) {
        return  (fahrenheit -32) * 5/9;
    }
       public double convetKmPorHoraParaMetrosSegundos(double kmHora) {
        return  kmHora / 3.6;
    }
       public double convetMetrosSegundosParakmPorHora(double metrosSegundos) {
        return  metrosSegundos * 3.6;
    }

      public double convetMtrosQuadradosParaHectares(double metrosquadrados) {
        return  metrosquadrados / 1000;
    }

     public double convetHectaresParaMtrosQuadrados(double hectares) {
        return  hectares * 1000;
    }


}
