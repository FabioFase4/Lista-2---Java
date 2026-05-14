package sistema;

public class Triangulo {
    private double lado01, lado02, lado03;
    
    public Triangulo (double lado01, double lado02, double lado03)
    {
        if (lado01 <= 0 || lado02 <= 0 || lado03 <= 0)
        {
            System.err.print("Dimensões Inválidas");
            return;
        }
        this.lado01 = lado01;
        this.lado02 = lado02;
        this.lado03 = lado03;
    }
    
    public boolean isTriangle ()
    {
        double a = this.lado01, b = this.lado02, c = this.lado03;
        return (a + b >= c && b + c >= a && c + a >= b);
    }
    public double area ()
    {
        double a = this.lado01, b = this.lado02, c = this.lado03;
        double p = (a + b + c) / 2.0;
        double numero = p * (p - a) * (p - b) * (p - c);
    
        if (numero <= 0)
        {
            System.err.println("Nem é Triângulo para Ter Àrea de Triângulo");
            return 0;
        }
        return Math.sqrt(numero);
    }
}
