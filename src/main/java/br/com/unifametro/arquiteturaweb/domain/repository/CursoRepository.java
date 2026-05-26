package br.com.unifametro.arquiteturaweb.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifametro.arquiteturaweb.domain.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    public Page<Curso> findAll(Pageable pageable);
}
