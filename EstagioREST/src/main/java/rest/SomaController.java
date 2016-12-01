package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomaController {

    @RequestMapping("/somar")
    public Resultado somar(){
    	Soma soma = new Soma(2,2);
    	return soma.calcular();
    }
   
}