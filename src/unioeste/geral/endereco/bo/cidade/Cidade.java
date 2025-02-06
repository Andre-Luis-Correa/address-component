package unioeste.geral.endereco.bo.cidade;

import unioeste.geral.endereco.bo.unidadefederativa.UnidadeFederativa;

import java.io.Serializable;

public class Cidade implements Serializable {

    private Long id;
    private String nome;
    private UnidadeFederativa unidadeFederativa;

    public Cidade(Long id, String nome, UnidadeFederativa unidadeFederativa) {
        this.id = id;
        this.nome = nome;
        this.unidadeFederativa = unidadeFederativa;
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

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
}
