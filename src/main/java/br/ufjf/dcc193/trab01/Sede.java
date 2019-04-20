package br.ufjf.dcc193.trab01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Sede
 */
@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nomeFantasia;
    private String federacao;
    private String cidade;
    private String bairro;
    private String telefone;
    private String enderecoWeb;

    public Sede() {
        
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
    public Sede setId(Long id) {
        this.id = id;
        return this;
    }
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @param bairro the bairro to set
     */
    public Sede setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }
    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }
    /**
     * @param cidade the cidade to set
     */
    public Sede setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }
    /**
     * @return the enderecoWeb
     */
    public String getEnderecoWeb() {
        return enderecoWeb;
    }
    /**
     * @param enderecoWeb the enderecoWeb to set
     */
    public Sede setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
        return this;
    }
    /**
     * @return the federacao
     */
    public String getFederacao() {
        return federacao;
    }
    /**
     * @param federacao the federacao to set
     */
    public Sede setFederacao(String federacao) {
        this.federacao = federacao;
        return this;
    }
    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    /**
     * @param nomeFantasia the nomeFansatasia to set
     */
    public Sede setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * @param telefone the telefone to set
     */
    public Sede setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
    //#endregion
}