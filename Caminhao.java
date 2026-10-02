/** Veículo de grande porte, caracterizado pelo número de eixos. */
public class Caminhao extends Veiculo {

    private final int eixos;

    /**
     * @param placa        placa do caminhão
     * @param capacidadeKg capacidade de carga em kg
     * @param eixos        quantidade de eixos (mínimo 2)
     */
    public Caminhao(String placa, double capacidadeKg, int eixos) {
        super(placa, capacidadeKg);
        if (eixos < 2) {
            throw new IllegalArgumentException("Um caminhão deve ter no mínimo 2 eixos.");
        }
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}
