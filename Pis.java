public class Pis implements Imposto {
    private final double debito;
    private final double credito;

    public Pis(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    @Override
    public double calcularImposto() {
        return (debito - credito) * 0.0165;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
}