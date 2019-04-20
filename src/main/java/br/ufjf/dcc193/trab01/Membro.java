package br.ufjf.dcc193.trab01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Membro
 */
@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String funcao;
    private String email;
    private String dataEntrada;
    private String dataSaida;

    public Membro() {

    }

    //#region GET / SET
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public Membro setId(Long id) {
        this.id = id;
        return this;
    }
    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }
    /**
     * @param dataEntrada the dataEntrada to set
     */
    public Membro setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
        return this;
    }
    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }
    /**
     * @param dataSaida the dataSaida to set
     */
    public Membro setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
        return this;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public Membro setEmail(String email) {
        this.email = email;
        return this;
    }
    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }
    /**
     * @param funcao the funcao to set
     */
    public Membro setFuncao(String funcao) {
        this.funcao = funcao;
        return this;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public Membro setNome(String nome) {
        this.nome = nome;
        return this;
    }
    //#endregion
}