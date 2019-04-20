package br.ufjf.dcc193.trab01;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * Sede
 */
@Entity
public class Sede {

    @Id
    @Column(name = "sede_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long sede_id;
    private String nomeFantasia;
    private String federacao;
    private String cidade;
    private String bairro;
    private String telefone;
    private String enderecoWeb;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Membro> membros;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Atividade> atividades;

    public Sede() {
        
    }

    //#region GET / SET
    /**
     * @return the atividades
     */
    public List<Atividade> getAtividades() {
        return atividades;
    }
    /**
     * @param atividades the atividades to set
     */
    public Sede setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
        return this;
    }
    /**
     * @return the membros
     */
    public List<Membro> getMembros() {
        return membros;
    }
    /**
     * @param membros the membros to set
     */
    public Sede setMembros(List<Membro> membros) {
        this.membros = membros;
        return this;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return sede_id;
    }
    /**
     * @param id the id to set
     */
    public Sede setId(Long id) {
        this.sede_id = id;
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