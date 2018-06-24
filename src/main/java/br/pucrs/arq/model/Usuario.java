package br.pucrs.arq.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Usuario {

    @Id
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String perfil;
    private boolean isAtivo;
    private String senha;

    public Usuario(){ }

    public Usuario(String nome, String cpf, String email, String perfil, boolean isAtivo, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.isAtivo = isAtivo;
        this.senha = senha;
    }

}


/**
 * email: {
 * 		type: String,
 * 		unique: true,
 * 		required: true
 *        },
 * 	senha: {
 * 		type: String,
 * 		required: true
 *    },
 * 	nome: {
 * 		type: String,
 * 		required: true
 *    },
 * 	cpf: {
 * 		type: String,
 * 		unique: true,
 * 		required: true
 *    },
 * 	perfis: [{
 * 		type: String,
 * 		enum: ["Administrador", "Interessado"],
 * 		required: true
 *    }],
 * 	refPerfilAdministrador: {
 * 		type: mongoose.Schema.Types.ObjectId,
 * 		ref: "administradores",
 * 		required: false
 *    },
 * 	refPerfilInteressado: {
 * 		type: mongoose.Schema.Types.ObjectId,
 * 		ref: "interessados",
 * 		required: false
 *    },
 * 	isAtivo: {
 * 		type: Boolean,
 * 		required: true,
 * 		default: true
 *    }
 **/