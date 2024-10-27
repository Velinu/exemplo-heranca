public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        System.out.println("Detalhes do Carro:");
        System.out.println(carro.exibirDetalhes());
        
        System.out.println("\n------------------------\n");

        Moto moto = new Moto("Harley-Davidson", "Iron 883", 2019, true);
        System.out.println("Detalhes da Moto:");
        System.out.println(moto.exibirDetalhes());
    }
}
