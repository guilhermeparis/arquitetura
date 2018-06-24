package br.pucrs.arq.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * by Thiago Carreira A. Nascimento
 **/
@Data
@Document
public class Menor {

    @Id
    private Integer id;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private String guiaRecolhimento;
    private String certidaoNascimento;
    private String processoDestituicao;
    private boolean saudavel;
    private String descricaoSaude;
    private boolean curavel;
    private boolean deficienciaFisica;
    private boolean deficienciaMental;
    private boolean isAtivo;

    public Menor(){}

    public Menor(Integer id, String nome, char sexo, Date dataNascimento, String guiaRecolhimento, String certidaoNascimento, String processoDestituicao, boolean saudavel, String descricaoSaude, boolean curavel, boolean deficienciaFisica, boolean deficienciaMental, boolean isAtivo) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.guiaRecolhimento = guiaRecolhimento;
        this.certidaoNascimento = certidaoNascimento;
        this.processoDestituicao = processoDestituicao;
        this.saudavel = saudavel;
        this.descricaoSaude = descricaoSaude;
        this.curavel = curavel;
        this.deficienciaFisica = deficienciaFisica;
        this.deficienciaMental = deficienciaMental;
        this.isAtivo = isAtivo;
    }
}
