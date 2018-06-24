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
public class Termo {

    @Id
    private Integer id;
    private String texto;
    private Date timeStampInicio;
    private Date timeStampTermino;

    public Termo(){}

    public Termo(String texto, Date timeStampInicio, Date timeStampTermino){
        this.texto = texto;
        this.timeStampInicio = timeStampInicio;
        this.timeStampTermino = timeStampTermino;
    }
}
