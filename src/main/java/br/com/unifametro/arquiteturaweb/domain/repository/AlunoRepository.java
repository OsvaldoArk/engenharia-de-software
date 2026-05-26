package br.com.unifametro.arquiteturaweb.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifametro.arquiteturaweb.domain.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    public Page<Aluno> findAll(Pageable pageable);
}
