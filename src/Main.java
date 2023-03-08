import br.com.dio.desafio.dominio.Circulo;
import br.com.dio.desafio.dominio.Forma;
import br.com.dio.desafio.dominio.Retangulo;
import br.com.dio.desafio.dominio.Tipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.println("Escolha quantas formas quer calcular: ");
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            System.out.println("Dados da forma # " + i + ": ");
            System.out.println("Digite R para retangulo ou C para círculo: ");
            char ch = sc.next().charAt(0);

            if(ch == 'R'){
                System.out.println("Digite a largura: ");
                double largura = sc.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();
                Tipo tipo = Tipo.RETANGULO;
                list.add(new Retangulo(tipo, largura, altura));
            } else {
                System.out.println("Digite o raio para o círculo: ");
                double raio = sc.nextDouble();
                Tipo tipo = Tipo.CIRCULO;
                list.add(new Circulo(tipo, raio));
            }
        }

        System.out.println();
        System.out.println("Área das formas: ");
        for(Forma forma: list) {
            System.out.printf("Área: %.2f%n", forma.calcularArea());
        }

    sc.close();
    }
}