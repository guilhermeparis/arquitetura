package br.pucrs.arq.model;

import io.swagger.annotations.ExternalDocs;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.math.BigDecimal;
import java.util.Date;

/**
 * by Thiago Carreira A. Nascimento
 **/
@Data
@Document
public class Interessado extends Usuario {

    @Id
    private Integer id;
    private String nomeConjuge;
    private Date dataNascimento;
    private BigDecimal renda;

    public Interessado(){}

    public Interessado(String nomeConjuge, Date dataNascimento, BigDecimal renda){
        super();
        this.nomeConjuge = nomeConjuge;
        this.dataNascimento = dataNascimento;
        this.renda = renda;
    }

}
