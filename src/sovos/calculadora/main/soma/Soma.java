package sovos.calculadora.main.soma;

public class Soma {
    private int valor;
    private int valor2;
    private int resultado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void somarValores(){
        setResultado(getValor() + getValor2());
    }
}
