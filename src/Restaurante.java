import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produtos> cardapio = new ArrayList<>();
    private Endereco endereco;

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cardapio=" + cardapio +
                ", endereco=" + endereco +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

