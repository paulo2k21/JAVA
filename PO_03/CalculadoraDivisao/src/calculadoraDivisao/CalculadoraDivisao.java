package calculadoraDivisao;


public class CalculadoraDivisao {



    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividirInteiros(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            
        }
        return dividendo / divisor;
    }

    public float dividirFloats(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            
        }
        return dividendo / divisor;
    }
}