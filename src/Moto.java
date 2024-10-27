public class Moto extends Veiculo {
    private Boolean temSidecar;
    public Moto(String marca, String modelo, int ano, Boolean temSidecar) {
        super(marca, modelo, ano);
        System.out.println(temSidecar);
        this.temSidecar = temSidecar;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nTem sidecar: " + (this.temSidecar ? "Sim" : "Não");
    }
    
}
