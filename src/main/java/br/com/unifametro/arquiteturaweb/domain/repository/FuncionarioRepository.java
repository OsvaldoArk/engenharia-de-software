package br.com.unifametro.arquiteturaweb.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifametro.arquiteturaweb.domain.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    public Page<Funcionario> findAll(Pageable pageable);
}
