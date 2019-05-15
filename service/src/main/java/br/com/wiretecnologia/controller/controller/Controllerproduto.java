package br.com.wiretecnologia.controller.controller;


import br.com.wiretecnologia.model.Produto;
import br.com.wiretecnologia.controller.service.ProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/produto")
public class Controllerproduto {

    @Autowired
    ProdutoService produtoService;

private static  final Logger LOGGER = LoggerFactory.getLogger(Controllerproduto.class);


    @GetMapping()
    public @ResponseStatus
    ResponseEntity getnome(@Valid String nome) {
        LOGGER.info("BUSCA SUCESSO \n");

        return  produtoService.findProdutosName(nome);
    }


    @PostMapping()
    public @ResponseBody
    Produto insere(@Valid Produto produto) {
       LOGGER.info("INSERIDO SUCESSO\n");
        return produtoService.insertProduto(produto);
    }
}
