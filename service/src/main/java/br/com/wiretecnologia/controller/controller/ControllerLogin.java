package br.com.wiretecnologia.controller.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value ="/sign-up")
public class ControllerLogin {



    @PostMapping
    @ResponseBody
    public ResponseEntity<String> getToken(){
        return  ResponseEntity.ok().body("Login efetuado com sucesso");
    }
}
