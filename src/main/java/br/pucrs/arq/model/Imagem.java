package br.pucrs.arq.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * by Thiago Carreira A. Nascimento
 **/
@Data
@Document
public class Imagem extends Midia {

    @Id
    private Integer id;

    public Imagem(){super();}
}
