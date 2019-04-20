package br.ufjf.dcc193.trab01;

import javax.persistence.Column;
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
    @Column(name = "atividade_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long atividade_id;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Integer horasAssistencial;
    private Integer horasExecutiva;
    private Integer horasFinanceira;
    private Integer horasJuridica;

    @ManyToOne(fetch = FetchType.LAZY)
    private Sede ongAtividade;

    public Atividade() {

    }

    //#region GET / SET
    /**
     * @return the ongAtividade
     */
    public Sede getOngAtividade() {
        return ongAtividade;
    }
    /**
     * @param ongAtividade the ongAtividade to set
     */
    public Atividade setOngAtividade(Sede ongAtividade) {
        this.ongAtividade = ongAtividade;
        return this;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return atividade_id;
    }
    /**
     * @param id the id to set
     */
    public Atividade setId(Long id) {
        this.atividade_id = id;
        return this;
    }
    /**
     * @return the horasAssistencial
     */
    public Integer getHorasAssistencial() {
        return horasAssistencial;
    }
    /**
     * @param horasAssistencial the horasAssistencial to set
     */
    public Atividade setHorasAssistencial(Integer horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
        return this;
    }
    /**
     * @return the horasExecutiva
     */
    public Integer getHorasExecutiva() {
        return horasExecutiva;
    }
    /**
     * @param horasExecutiva the horasExecutiva to set
     */
    public Atividade setHorasExecutiva(Integer horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
        return this;
    }
    /**
     * @return the horasFinanceira
     */
    public Integer getHorasFinanceira() {
        return horasFinanceira;
    }
    /**
     * @param horasFinanceira the horasFinanceira to set
     */
    public Atividade setHorasFinanceira(Integer horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
        return this;
    }
    /**
     * @return the horasJuridica
     */
    public Integer getHorasJuridica() {
        return horasJuridica;
    }
    /**
     * @param horasJuridica the horasJuridica to set
     */
    public Atividade setHorasJuridica(Integer horasJuridica) {
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