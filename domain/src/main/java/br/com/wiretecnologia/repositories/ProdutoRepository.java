package br.com.wiretecnologia.repositories;

import br.com.wiretecnologia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContainingIgnoreCase(String name);
}
