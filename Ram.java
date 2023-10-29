
package paginafifo;

public class Ram {
    PaginaFifo[] paginas;
    int tamanho;

    public Ram(int tamanho) {
        this.tamanho = tamanho;
        paginas = new PaginaFifo[tamanho];
    }

    public boolean contemPagina(int instrucao) {
        for (PaginaFifo pagina : paginas) {
            if (pagina != null && pagina.instrucao == instrucao) {
                return true;
            }
        }
        return false;
    
        }
    public void resetarBitsDeReferencia() {
        for (PaginaFifo pagina : paginas) {
            if (pagina != null) {
                pagina.bitReferencia = 0;
                
            }
        }
    }
}
    

