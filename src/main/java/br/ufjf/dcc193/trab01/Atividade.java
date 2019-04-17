package br.ufjf.dcc193.trab01;

/**
 * Atividade
 */
public class Atividade {

    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String categoria;
    private Float totalHoras;

    //#region GET / SET
    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
    public Float getTotalHoras() {
        return totalHoras;
    }
    /**
     * @param totalHoras the totalHoras to set
     */
    public void setTotalHoras(Float totalHoras) {
        this.totalHoras = totalHoras;
    }
    //#endregion
}