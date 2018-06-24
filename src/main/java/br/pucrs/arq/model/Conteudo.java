package br.pucrs.arq.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * by Thiago Carreira A. Nascimento
 **/

@Data
@Document
public class Conteudo {

    private String nome;
    private String pagina;
    // refMidias
    private Date timeStampCriacao;
    private Date timeStampInicio;
    private Date timeStampFim;
    private boolean isAtivo;

    public Conteudo(){}

    public Conteudo(String nome, String pagina, Date timeStampCriacao, Date timeStampInicio, Date timeStampFim, boolean isAtivo) {
        this.nome = nome;
        this.pagina = pagina;
        this.timeStampCriacao = timeStampCriacao;
        this.timeStampInicio = timeStampInicio;
        this.timeStampFim = timeStampFim;
        this.isAtivo = isAtivo;
    }
}
