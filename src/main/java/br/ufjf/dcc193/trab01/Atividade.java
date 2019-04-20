package br.ufjf.dcc193.trab01;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Atividade
 */
@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Float horasAssistencial;
    private Float horasExecutiva;
    private Float horasFinanceira;
    private Float horasJuridica;

    @ManyToOne(fetch = FetchType.LAZY)
    private Sede ongAtividade;

    public Atividade() {

    }

    //#region GET / SET
    /**
     * @return the id
     */
    /**
     * @return the ongAtividade
     */
    public Sede getOngAtividade() {
        return ongAtividade;
    }
    /**
     * @param ongAtividade the ongAtividade to set
     */
    public void setOngAtividade(Sede ongAtividade) {
        this.ongAtividade = ongAtividade;
    }
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public Atividade setId(Long id) {
        this.id = id;
        return this;
    }
    /**
     * @return the horasAssistencial
     */
    public Float getHorasAssistencial() {
        return horasAssistencial;
    }
    /**
     * @param horasAssistencial the horasAssistencial to set
     */
    public Atividade setHorasAssistencial(Float horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
        return this;
    }
    /**
     * @return the horasExecutiva
     */
    public Float getHorasExecutiva() {
        return horasExecutiva;
    }
    /**
     * @param horasExecutiva the horasExecutiva to set
     */
    public Atividade setHorasExecutiva(Float horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
        return this;
    }
    /**
     * @return the horasFinanceira
     */
    public Float getHorasFinanceira() {
        return horasFinanceira;
    }
    /**
     * @param horasFinanceira the horasFinanceira to set
     */
    public Atividade setHorasFinanceira(Float horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
        return this;
    }
    /**
     * @return the horasJuridica
     */
    public Float getHorasJuridica() {
        return horasJuridica;
    }
    /**
     * @param horasJuridica the horasJuridica to set
     */
    public Atividade setHorasJuridica(Float horasJuridica) {
        this.horasJuridica = horasJuridica;
        return this;
    }
    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }
    /**
     * @param dataFim the dataFim to set
     */
    public Atividade setDataFim(String dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }
    /**
     * @param dataInicio the dataInicio to set
     */
    public Atividade setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * @param descricao the descricao to set
     */
    public Atividade setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public Atividade setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    /**
     * @return the totalHoras
     */
    //#endregion
}