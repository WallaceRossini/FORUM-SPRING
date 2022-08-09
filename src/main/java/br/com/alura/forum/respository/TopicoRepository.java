package br.com.alura.forum.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
