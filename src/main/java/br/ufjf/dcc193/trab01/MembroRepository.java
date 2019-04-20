package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MembroRepository
 */
public interface MembroRepository extends JpaRepository<Membro, Long> {

    public List<Membro> findAllByOrderByOngMembroAsc();
    
}