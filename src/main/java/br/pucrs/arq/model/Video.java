package br.pucrs.arq.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * by Thiago Carreira A. Nascimento
 **/

@Data
public class Video extends Midia {

    @Id
    private Integer id;

    public Video(){super();}
}
