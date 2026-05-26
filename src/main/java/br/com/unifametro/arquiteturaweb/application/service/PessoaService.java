package br.com.unifametro.arquiteturaweb.application.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.unifametro.arquiteturaweb.domain.entity.Pessoa;
import br.com.unifametro.arquiteturaweb.domain.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
    
    private final PessoaRepository pessoaRepository;

    public Page<Pessoa> findAll(Pageable pageable) {
        return pessoaRepository.findAll(pageable);
    }
    
    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa findByIdOrThrowException(Long id) {
        return pessoaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException(String.format("A pessoa de id %s não foi encontrada", id.toString())));
    }

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deleteById(Long id) {

        findByIdOrThrowException(id);

        pessoaRepository.deleteById(id);
    }
}
