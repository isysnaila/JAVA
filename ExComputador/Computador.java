public class Computador {
    
    private String marca;
    private int memoriaRam;
    private int armazenamento;

    public Computador (){
        this.marca="Genérica";
        this.memoriaRam=4;
        this.armazenamento=500;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam=memoriaRam;
    }

    public int getMemoriaRam(){
        return memoriaRam;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento=armazenamento;
    }

    public int getArmazenamento(){
        return armazenamento;
    }

    public void atualizarEspecificacoes(String marca, int memoriaRam, int armazenamento){
        this.marca=marca;
        this.memoriaRam=memoriaRam;
        this.armazenamento=armazenamento;
    }

    public void exibirEspecificacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Memória Ram: "+memoriaRam+"GB");
        System.out.println("Armazenamento: "+armazenamento+"GB");
    }

    public boolean ehLento(){
        if (memoriaRam<8) {
            return true;
        }
        else{
            return false;
        }
    }

    public void verificarDesempenho(){
        if(ehLento()){
            System.out.println("O computador é lento.");
        }
        else{
            System.out.println("O computador é rápido.");
        }
    }
}
