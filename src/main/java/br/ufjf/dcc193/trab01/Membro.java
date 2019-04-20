package br.ufjf.dcc193.trab01;

/**
 * Membro
 */
public class Membro {

    private String nome;
    private String funcao;
    private String email;
    private String dataEntrada;
    private String dataSaida;
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
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }
    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
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
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
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
    public void setEmail(String email) {
        this.email = email;
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
    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    //#endregion
}