package coffeepot.br.sped.fiscal.arquivo.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0150"),
    @Field(name = "codPart"),
    @Field(name = "nome", maxLength = 100),
    @Field(name = "codPais"),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "cpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ie", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codMun"),
    @Field(name = "suframa", length = 9, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "end", maxLength = 60),
    @Field(name = "num", maxLength = 10),
    @Field(name = "compl", maxLength = 60),
    @Field(name = "bairro", maxLength = 60),
    @Field(name = "reg0175List"),
})
public class Reg0150 {

    private String codPart;
    private String nome;
    private int codPais;
    private String cnpj;
    private String cpf;
    private String ie;
    private int codMun;
    private String suframa;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private List<Reg0175> reg0175List;

    public Reg0150() {
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public int getCodMun() {
        return codMun;
    }

    public void setCodMun(int codMun) {
        this.codMun = codMun;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public List<Reg0175> getReg0175List() {
        return reg0175List;
    }

    public void setReg0175List(List<Reg0175> reg0175List) {
        this.reg0175List = reg0175List;
    }
}
