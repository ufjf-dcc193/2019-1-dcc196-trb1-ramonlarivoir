package br.ufjf.dcc193.trab01;

/**
 * Sede
 */
public class Sede {

    private String nomeFansatasia;
    private String federacao;
    private String cidade;
    private String bairro;
    private String telefone;
    private String enderecoWeb;

    //#region GET / SET
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
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
    public void setCidade(String cidade) {
        this.cidade = cidade;
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
    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
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
    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }
    /**
     * @return the nomeFansatasia
     */
    public String getNomeFansatasia() {
        return nomeFansatasia;
    }
    /**
     * @param nomeFansatasia the nomeFansatasia to set
     */
    public void setNomeFansatasia(String nomeFansatasia) {
        this.nomeFansatasia = nomeFansatasia;
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
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //#endregion
}