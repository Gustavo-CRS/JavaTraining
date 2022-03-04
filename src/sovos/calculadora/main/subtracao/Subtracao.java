package sovos.calculadora.main.subtracao;

public class Subtracao {
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

    public int setResultado(int resultado) {
        return this.resultado = resultado;
    }

    public void subtrairValores(){
        setResultado(getValor() - getValor2());
    }

    public int subValoresParametro(int val1, int val2){
        return setResultado(val1-val2);

    }
    public int subValoresParamAtrib(int val1){
        return setResultado(getValor()-val1);
    }
}

