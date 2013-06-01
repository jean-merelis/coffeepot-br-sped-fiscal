package coffeepot.br.sped.fiscal.blocos.bloco0;

import coffeepot.br.sped.fiscal.tipos.FinalidadeArquivo;
import coffeepot.br.sped.fiscal.tipos.IndicadorAtividade;
import coffeepot.br.sped.fiscal.tipos.Perfil;
import java.util.Date;

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
