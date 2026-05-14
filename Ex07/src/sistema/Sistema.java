package sistema;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       double lado01, lado02, lado03;
       
       System.out.print("Tem-Se um Produto\n");
       System.out.println("Digite os Três Lados do Triângulo Em Sequência: ");
       
       lado01 = sc.nextDouble();
       sc.nextLine();
       lado02 = sc.nextDouble();
       sc.nextLine();
       lado03 = sc.nextDouble();
       sc.nextLine();
       
       Triangulo triangulo = new Triangulo(lado01, lado02, lado03);
       
       double area = triangulo.area();
       boolean ehTriangulo = triangulo.isTriangle();
       
       System.out.print("\n\nInformações do Triângulo");
       System.out.print("\nÁrea: " + area);
       System.out.println("\nÉ um Triângulo: " + (ehTriangulo? "Sim" : "Não"));
    }
    
}
