/** Ponto de entrada: demonstra o uso das classes refatoradas. */
public class Principal {

    public static void main(String[] args) {
        Pacote pacote = new Pacote("BR999", 10.5);

        Veiculo caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Veiculo moto = new Moto("XYZ9876", 30.0, true);

        new Rota(pacote, caminhao).iniciar();
        new Rota(pacote, moto).iniciar();   // agora é possível entregar de moto!

        // O dado inválido do código legado (capacidade -500) agora é barrado:
        try {
            new Caminhao("DEF5678", -500.0, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }
    }
}
