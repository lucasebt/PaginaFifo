
package paginafifo;

public class PaginaFifo {
    int numeroPagina;
    int instrucao;
    int dado;
    int bitReferencia;
    int bitModificado;
    int tempoEnvelhecimento;

    public PaginaFifo(int numeroPagina, int instrucao, int dado, int tempoEnvelhecimento) {
        this.numeroPagina = numeroPagina;
        this.instrucao = instrucao;
        this.dado = dado;
        this.bitReferencia = 0;
        this.bitModificado = 0;
        this.tempoEnvelhecimento = tempoEnvelhecimento;
    }

    public int getClassePagina() {
        return (bitReferencia << 1) | bitModificado;
    }
}