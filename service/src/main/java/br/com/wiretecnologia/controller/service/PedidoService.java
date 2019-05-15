package br.com.wiretecnologia.controller.service;

import br.com.wiretecnologia.model.Pedido;
import br.com.wiretecnologia.model.Produto;
import br.com.wiretecnologia.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;


    public Pedido insertPedido(Pedido obj) {
        Date date = new Date(Calendar.getInstance().getTime().getTime());

        Pedido pedido = new Pedido();
        pedido.setDataPedido(date);
//        pedido.setProdutos(obj);
        return pedidoRepository.save(pedido);
    }


    public Pedido findProdutosName(Long id) {

        Pedido retornoPedido = new Pedido();
//        retornoPedido = (Pedido) pedidoRepository.findByIdpedido(id);
        return retornoPedido;

    }
}
