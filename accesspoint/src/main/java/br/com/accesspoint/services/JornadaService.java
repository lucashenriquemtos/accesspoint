package br.com.accesspoint.services;

import br.com.accesspoint.model.JornadaTrabalho;
import br.com.accesspoint.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho atualizarJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void deletarJornada(Long id){
        jornadaTrabalhoRepository.deleteById(id);
    }
}
