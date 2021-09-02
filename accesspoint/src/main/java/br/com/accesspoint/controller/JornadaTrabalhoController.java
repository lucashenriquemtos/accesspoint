package br.com.accesspoint.controller;

import br.com.accesspoint.model.JornadaTrabalho;
import br.com.accesspoint.repository.JornadaTrabalhoRepository;
import br.com.accesspoint.services.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/jornada" )
public class JornadaTrabalhoController {

    @Autowired
    private JornadaService jornadaService;


    @PostMapping
    public JornadaTrabalho criarJornada(@Valid @RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }
}
