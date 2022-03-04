package sovos.calculadora.main;


import sovos.calculadora.main.divisao.Divisao;
import sovos.calculadora.main.multiplicacao.Multiplicacao;
import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtracao.Subtracao;

public class Calculadora {
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    int n4 = 4;
    int n5 = 5;

    public Calculadora(){

    }
    public void setN1(int numero) {
        this.n1 = numero;
    }

    public void setN2(int numero) {
        this.n2 = numero;
    }

    public void setN3(int numero) {
        this.n3 = numero;
    }

    public void setN4(int numero) {
        this.n4 = numero;
    }

    public void setN5(int numero) {
        this.n5 = numero;
    }

    public Calculadora(int n1, int n3, int n5) {
        this.n1 = n1;
        this.n3 = n3;
        this.n5 = n5;
    }

    public static void main(String[] args) {
        /* int multiplicacao;
        int divisao;
        int subtracao;
        int soma;
        Calculadora novaCalculadora = new Calculadora();
        soma = novaCalculadora.n1 + novaCalculadora.n3;
        System.out.println("Primeira soma é: " + soma);
        novaCalculadora = new Calculadora(10,30,50);
        soma = novaCalculadora.n1 + novaCalculadora.n3;
        System.out.println("Segunda soma é: " + soma);
        novaCalculadora.setN1(15);
        novaCalculadora.setN2(2);
        multiplicacao = novaCalculadora.n1 * novaCalculadora.n2;
        System.out.println("Resultado da multiplicação é: "+ multiplicacao);
        novaCalculadora.setN3(3);
        divisao = novaCalculadora.n1/ novaCalculadora.n3;
        System.out.println("Divisão de n1 por n3 é: " + divisao);
        novaCalculadora.setN3(50);
        novaCalculadora.setN1(100);
        subtracao = novaCalculadora.n1 - novaCalculadora.n3;
        System.out.println("Subtração de n1 por n3 é: " + subtracao);*/
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();

        Multiplicacao mult = new Multiplicacao();

        soma.setValor(10);
        soma.setValor2(5);
        soma.somarValores();
        System.out.println(soma.getResultado());

        Calculadora calculadora = new Calculadora();

        System.out.println("Resultado da divisão por Atributo: " + calculadora.getDividirAtributo(50,2));
        System.out.println("Resultado da divisão por Parametro: " + calculadora.getDividirParametro(70,2));
        System.out.println("Resultado da divisão por Atributo e Parametro: " + calculadora.getDividirAtribParam(150,3));

        System.out.println("Resultado da multiplicação por Atributo: " + calculadora.getMultAtributo(50,2));
        System.out.println("Resultado da multiplicação por Parametro: " + calculadora.getMultParametro(70,2));
        System.out.println("Resultado da multiplicação por Atributo e Parametro: " + calculadora.getMultAtribParam(150,3));

        System.out.println("Resultado da subtração por Atributo: " + calculadora.getSubAtributo(50,2));
        System.out.println("Resultado da subtração por Parametro: " + calculadora.getSubParametro(70,2));
        System.out.println("Resultado da subtração por Atributo e Parametro: " + calculadora.getSubAtribParam(150,3));




    }

    private int getDividirAtribParam(int val, int val2) {
        Divisao div = new Divisao();
        div.setValor(val);
        return div.divirValoresParamAtrib(val2);
    }

    private int getDividirParametro(int val1, int val2) {
        Divisao div = new Divisao();
        return div.dividirValoresParametro(val1,val2);

    }

    private int getDividirAtributo(int val1, int val2) {
        Divisao div = new Divisao();
        div.setValor(val1);
        div.setValor2(val2);
        div.dividirValores();
        return div.getResultado();
    }

    private int getMultAtribParam(int val, int val2) {
        Multiplicacao mult = new Multiplicacao();
        mult.setValor(val);
        return mult.multiValoresParamAtrib(val2);
    }

    private int getMultParametro(int val1, int val2) {
        Multiplicacao mult = new Multiplicacao();
        return mult.multiValoresParametro(val1,val2);

    }

    private int getMultAtributo(int val1, int val2) {
        Multiplicacao mult = new Multiplicacao();
        mult.setValor(val1);
        mult.setValor2(val2);
        mult.multiplicarValores();
        return mult.getResultado();
    }

    private int getSubAtribParam(int val, int val2) {
        Subtracao sub = new Subtracao();
        sub.setValor(val);
        return sub.subValoresParamAtrib(val2);
    }

    private int getSubParametro(int val1, int val2) {
        Subtracao sub = new Subtracao();
        return sub.subValoresParametro(val1,val2);

    }

    private int getSubAtributo(int val1, int val2) {
        Subtracao sub = new Subtracao();
        sub.setValor(val1);
        sub.setValor2(val2);
        sub.subtrairValores();
        return sub.getResultado();
    }



}
