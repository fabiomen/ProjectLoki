package br.com.wiretecnologia.controller.service;

import br.com.wiretecnologia.model.Produto;
import br.com.wiretecnologia.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;



    public ResponseEntity<?> findProdutosName(@PathVariable String name){
        return new ResponseEntity<>(produtoRepository.findByNomeContainingIgnoreCase(name), HttpStatus.OK);
    }

    public Produto insertProduto(Produto obj) {
        //TEM QUE SER NULO, SE NÃO ATUALIZA E NÃO INSERE
        System.out.println(obj.toString());
        return produtoRepository.save(obj);
    }

}
