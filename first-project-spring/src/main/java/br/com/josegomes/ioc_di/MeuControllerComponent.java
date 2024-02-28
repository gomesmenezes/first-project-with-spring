package br.com.josegomes.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/component")
public class MeuControllerComponent {
    
    // @Autowired
    // MeuComponente meuComponente;

    @GetMapping("/")
    public String callingComponent() {
        var meuComponent = new MeuComponente();
        var result = meuComponent.callMyComponent();
        return result;
    }
}
