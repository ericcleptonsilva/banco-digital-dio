import java.util.List;

public class Banco {
    private final String name;
    private List<Conta> contas;

    public Banco(String name, List<Conta> contas) {
        this.name = name;
        this.contas = contas;
    }

    public String getName() {
        return name;
    }

    public List<Conta> getConstas() {
        return contas;
    }

    public void setConstas(List<Conta> contas) {
        this.contas = contas;
    }
}
