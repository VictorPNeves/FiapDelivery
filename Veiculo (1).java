/**
 * Classe base abstrata para qualquer veículo de entrega do FiapDelivery.
 * Concentra os atributos comuns e as regras de validação (evita duplicação).
 */
public abstract class Veiculo {

    private final String placa;
    private double capacidadeKg;

    /**
     * @param placa        placa do veículo (não pode ser nula ou vazia)
     * @param capacidadeKg capacidade máxima de carga em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se algum dado for inválido
     */
    protected Veiculo(String placa, double capacidadeKg) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }
        this.placa = placa.trim().toUpperCase();
        setCapacidadeKg(capacidadeKg);
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    /**
     * Atualiza a capacidade de carga.
     * @throws IllegalArgumentException se o valor for menor ou igual a zero
     */
    public void setCapacidadeKg(double capacidadeKg) {
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }
        this.capacidadeKg = capacidadeKg;
    }

    /** @return nome do tipo de veículo (ex.: "Caminhão", "Moto"). */
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " [" + placa + "]";
    }
}
