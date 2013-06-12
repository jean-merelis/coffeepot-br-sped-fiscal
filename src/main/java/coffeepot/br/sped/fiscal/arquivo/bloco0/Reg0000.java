/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco0;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import coffeepot.br.sped.fiscal.tipos.Perfil;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "reg", constantValue = "0000"),
    @Field(name = "codVer", length = 3, align = Align.RIGHT, padding = '0'),
    @Field(name = "codFin"),
    @Field(name = "dtIni"),
    @Field(name = "dtFin"),
    @Field(name = "nome", maxLength = 100),
    @Field(name = "cnpj", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "cpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "uf"),
    @Field(name = "ie", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codMun", length = 7, align = Align.RIGHT, padding = '0', paddingIfNullOrEmpty = true),
    @Field(name = "im", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "suframa", length = 9, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "indPerfil"),
    @Field(name = "indAtiv")
})
public class Reg0000 {

    private int codVer;
    private FinalidadeArquivo codFin;
    private Date dtIni;
    private Date dtFin;
    private String nome;
    private String cnpj;
    private String cpf;
    private String uf;
    private String ie;
    private int codMun;
    private String im;
    private String suframa;
    private Perfil indPerfil;
    private IndicadorAtividade indAtiv;

    public int getCodVer() {
        return codVer;
    }

    public void setCodVer(int codVer) {
        this.codVer = codVer;
    }

    public FinalidadeArquivo getCodFin() {
        return codFin;
    }

    public void setCodFin(FinalidadeArquivo codFin) {
        this.codFin = codFin;
    }

    public Date getDtIni() {
        return dtIni;
    }

    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public Perfil getIndPerfil() {
        return indPerfil;
    }

    public void setIndPerfil(Perfil indPerfil) {
        this.indPerfil = indPerfil;
    }

    public IndicadorAtividade getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(IndicadorAtividade indAtiv) {
        this.indAtiv = indAtiv;
    }
}
