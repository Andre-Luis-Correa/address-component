package unioeste.geral.endereco.bo.enderecoespecifico;

import unioeste.geral.endereco.bo.endereco.Endereco;

import java.io.Serializable;

public class EnderecoEspecifico implements Serializable {

    private Long id;
    private Integer numero;
    private String complemento;
    private Endereco endereco;

    public EnderecoEspecifico(Long id, Integer numero, String complemento, Endereco endereco) {
        this.id = id;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
