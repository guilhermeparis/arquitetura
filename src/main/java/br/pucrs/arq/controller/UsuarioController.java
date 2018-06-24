package br.pucrs.arq.controller;

import br.pucrs.arq.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.springframework.util.MimeTypeUtils.ALL_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
//import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


/**
 * by Thiago Carreira A. Nascimento
 **/

@RestController
public class UsuarioController {

    @RequestMapping(method = RequestMethod.POST, value = "/register", produces = APPLICATION_JSON_VALUE)
    public String register(@RequestBody Usuario usuario){

        return new Usuario(usuario.getNome(), usuario.getCpf(),
                usuario.getEmail(), usuario.getPerfil(),
                usuario.isAtivo(), usuario.getSenha()).toString().concat(" este foi o objeto enviado!");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/consulta", produces = ALL_VALUE)
    public String retornaUser(@RequestBody String user){

        return "Você enviou ".concat(user);

    }

    @ExceptionHandler
    void handleIllegalArgumentException(
            IllegalArgumentException e,
            HttpServletResponse response) throws IOException {

        response.sendError(HttpStatus.BAD_REQUEST.value());

    }
}
