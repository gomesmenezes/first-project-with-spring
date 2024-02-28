package br.com.josegomes.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiroController")
public class FirstController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "The params is " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String methodsWithQueryParams(@RequestParam String id) {
        return "O paramétro com metodoComQueryParams é: " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String methodsWithQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O paramétro com metodoComQueryParams2 é: " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoBodyParams(@RequestBody User usuario) {
        return "Método com body Params é: " + usuario.username();   
    }

    @PostMapping("/metodoComHeaders")
    public String metodoHeaders(@RequestHeader("name") String name) {
        return "metodoHeaders com body Params é: " + name;   
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers) {
        return "metodoHeaders com body Params é: " + headers.entrySet();   
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var user = new User("José Gomes");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }
        return ResponseEntity.badRequest().body("ID MENOR QUE 5");
    }
    
    record User(String username){ // Record permite você criar uma classe sem precisar getters and setters, bem simples
        
    }

}
