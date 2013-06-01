/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.blocos.blocoC;

import coffeepot.br.sped.fiscal.tipos.CondicaoPagamento;
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import coffeepot.br.sped.fiscal.tipos.EmissaoDocumento;
import coffeepot.br.sped.fiscal.tipos.Frete;
import coffeepot.br.sped.fiscal.tipos.Operacao;
import coffeepot.br.sped.fiscal.tipos.SituacaoDocumento;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class RegC100 {
    private Operacao indOper;
    private EmissaoDocumento indEmit;
    private String codPart;
    private DocumentoFiscal codMod;
    private SituacaoDocumento codSit;
    private String ser;
    private Long numDoc;
    private String chvNfe;
    private Date dtDoc;
    private Date dtES;
    private Double vlDoc;
    private CondicaoPagamento indPgto;
    private Double vlDesc;
    private Double vlAbatNt;
    private Double vlMerc;
    private Frete indFrt;
    private Double vlFrt;
    private Double vlSeg;
    private Double vlOutDa;
    private Double vlBcIcms;
    private Double vlIcms;
    private Double vlBcIcmsSt;
    private Double vlIcmsSt;
    private Double vlIpi;
    private Double vlPis;
    private Double vlCofins;
    private Double vlPisSt;
    private Double vlCofinsSt; 
    
    private RegC105 regC105;
    private List<RegC110> regC110List;
    private List<RegC111> regC111List;
    private List<RegC112> regC112List;
    private List<RegC113> regC113List;
}
