package unioeste.geral.endereco.bo.logradouro;

import unioeste.geral.endereco.bo.tipologradouro.TipoLogradouro;

import java.io.Serializable;

public class Logradouro implements Serializable {

    private Long id;
    private String nome;
    private TipoLogradouro tipoLogradouro;

    public Logradouro(Long id, String nome, TipoLogradouro tipoLogradouro) {
        this.id = id;
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
