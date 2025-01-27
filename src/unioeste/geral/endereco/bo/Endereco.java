package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Endereco implements Serializable {

    private Long id;
    private String cep;
    private Cidade cidade;
    private Logradouro logradouro;

    public Endereco(Long id, String cep, Cidade cidade, Logradouro logradouro) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
