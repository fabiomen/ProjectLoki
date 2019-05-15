package br.com.wiretecnologia.repositories;

import br.com.wiretecnologia.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

//    List<Pedido> findByIdpedido(Long id);
}
