package unioeste.geral.endereco.bo.endereco;

import unioeste.geral.endereco.bo.bairro.Bairro;
import unioeste.geral.endereco.bo.cidade.Cidade;
import unioeste.geral.endereco.bo.logradouro.Logradouro;

import java.io.Serializable;

public class Endereco implements Serializable {

    private Long id;
    private String cep;
    private Cidade cidade;
    private Logradouro logradouro;
    private Bairro bairro;

    public Endereco(Long id, String cep, Cidade cidade, Logradouro logradouro, Bairro bairro) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}
