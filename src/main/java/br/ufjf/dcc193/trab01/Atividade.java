package br.ufjf.dcc193.trab01;

/**
 * Atividade
 */
public class Atividade {

    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Float horasAssistencial;
    private Float horasExecutiva;
    private Float horasFinanceira;
    private Float horasJuridica;
    private Sede ong;

    //#region GET / SET
    /**
     * @return the ong
     */
    public Sede getOng() {
        return ong;
    }
    /**
     * @param ong the ong to set
     */
    public void setOng(Sede ong) {
        this.ong = ong;
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
    public void setHorasAssistencial(Float horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
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
    public void setHorasExecutiva(Float horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
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
    public void setHorasFinanceira(Float horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
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
    public void setHorasJuridica(Float horasJuridica) {
        this.horasJuridica = horasJuridica;
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
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
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
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
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
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the totalHoras
     */
    //#endregion
}