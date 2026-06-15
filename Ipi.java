public class Ipi implements Imposto {
    private final double valorProduto, frete, seguro, outrasDespesas, aliquota;

    public Ipi(double v, double f, double s, double o, double a) {
        this.valorProduto = v;
        this.frete = f;
        this.seguro = s;
        this.outrasDespesas = o;
        this.aliquota = a;
    }

    @Override
    public double calcularImposto() {
        double base = valorProduto + frete + seguro + outrasDespesas;
        return base * (aliquota / 100);
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}