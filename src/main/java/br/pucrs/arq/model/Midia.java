package br.pucrs.arq.model;

import lombok.Data;
import org.bson.BsonBinary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * by Thiago Carreira A. Nascimento
 **/
@Data
@Document
public class Midia {

    @Id
    private Integer id;
    private BsonBinary conteudo;
    private boolean isAtivo;

    public Midia(){}

    public Midia(Integer id, BsonBinary conteudo, boolean isAtivo) {
        this.id = id;
        this.conteudo = conteudo;
        this.isAtivo = isAtivo;
    }
}
