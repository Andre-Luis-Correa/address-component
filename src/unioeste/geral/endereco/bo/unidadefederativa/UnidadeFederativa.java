package unioeste.geral.endereco.bo.unidadefederativa;

import java.io.Serializable;

public class UnidadeFederativa implements Serializable {

    private String sigla;
    private String nome;

    public UnidadeFederativa() {
    }

    public UnidadeFederativa(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
