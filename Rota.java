/**
 * Associa um {@link Pacote} a um {@link Veiculo}.
 * Depende da abstração (Veiculo), então aceita Caminhão, Moto ou qualquer
 * veículo futuro sem alterar esta classe.
 */
public class Rota {

    private final Pacote pacote;
    private final Veiculo veiculo;

    /**
     * @param pacote  pacote a ser entregue
     * @param veiculo veículo responsável pela entrega
     * @throws IllegalArgumentException se algum for nulo ou se o pacote exceder a capacidade
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            throw new IllegalArgumentException("Pacote e veículo são obrigatórios.");
        }
        if (pacote.getPesoKg() > veiculo.getCapacidadeKg()) {
            throw new IllegalArgumentException("O pacote excede a capacidade do veículo.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /** Inicia a entrega e marca o pacote como em trânsito. */
    public void iniciar() {
        pacote.atualizarStatus(StatusPacote.EM_TRANSITO);
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veículo " + veiculo);
    }

    public Pacote getPacote() {
        return pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
