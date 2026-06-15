import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    private final String nomeEmpresa;
    private final List<Imposto> listaImpostos = new ArrayList<>();

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarImposto(Imposto imposto) {
        listaImpostos.add(imposto);
    }

    public List<Imposto> getListaImpostos() {
        return listaImpostos;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
}