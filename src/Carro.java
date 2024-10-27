public class Carro extends Veiculo {
 private Integer numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nNúmero de portas: " + numeroDePortas;
    }

}
