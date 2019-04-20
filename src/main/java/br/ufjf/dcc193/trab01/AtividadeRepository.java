package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AtividadeRepository
 */
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

    public List<Atividade> findAllByOrderByOngAtividadeAsc();
    
}