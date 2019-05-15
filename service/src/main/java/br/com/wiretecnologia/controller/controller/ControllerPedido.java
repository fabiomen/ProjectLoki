package br.com.wiretecnologia.controller.controller;


import br.com.wiretecnologia.model.Pedido;
import br.com.wiretecnologia.model.Produto;
import br.com.wiretecnologia.controller.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping(value = "/pedido")
public class ControllerPedido {

    @Autowired
    PedidoService pedidoService;

    private final static Logger LOGGER = LoggerFactory.getLogger(ControllerPedido.class);

    @PostMapping()
    public @ResponseBody
    ResponseEntity savePedido(@RequestBody Pedido obj) {
        LOGGER.info("SALVANDO PEDIDO");

        if (Objects.nonNull(obj)) {
            pedidoService.insertPedido(obj);
            return ResponseEntity.ok().body("PEDIDO CADASTRADO");
        } else {
            return ResponseEntity.status(400).body("ERRO AO CADASTRAR");
        }
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity getPedido(@Valid Long obj) {
        LOGGER.info("BUSCANDO PEDIDO");
        pedidoService.findProdutosName(obj);
        return ResponseEntity.ok().body("PEDIDO BUSCADO COM SUCESSO");
    }


    @PutMapping
    public @ResponseBody
    ResponseEntity editPedido(@Valid Pedido obj) {
        LOGGER.info("EDITANDO PEDIDO");
//        pedidoService.insertPedido(obj);
        return ResponseEntity.ok().body("PEDIDO EDITADO COM SUCESSO");
    }

}
