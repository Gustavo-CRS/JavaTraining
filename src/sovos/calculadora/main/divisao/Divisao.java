package sovos.calculadora.main.divisao;

public class Divisao {
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

        public void dividirValores(){
            setResultado(getValor() / getValor2());
        }
        public int dividirValoresParametro(int val1, int val2){
            return setResultado(val1/val2);

        }
        public int divirValoresParamAtrib(int val1){
            return setResultado(getValor()/val1);
        }
}
