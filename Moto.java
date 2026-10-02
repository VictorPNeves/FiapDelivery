/** Veículo de pequeno porte, pode ou não possuir baú. */
public class Moto extends Veiculo {

    private final boolean possuiBau;

    /**
     * @param placa        placa da moto
     * @param capacidadeKg capacidade de carga em kg
     * @param possuiBau    indica se a moto tem baú
     */
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean possuiBau() {
        return possuiBau;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
