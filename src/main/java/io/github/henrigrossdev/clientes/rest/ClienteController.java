package io.github.henrigrossdev.clientes.rest;

import io.github.henrigrossdev.clientes.model.entity.Cliente;
import io.github.henrigrossdev.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes") //mapear a url base
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // retorna o código de status CREATED
    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }

}
