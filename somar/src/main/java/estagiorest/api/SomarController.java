package estagiorest.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.*;

@RestController
public class SomarController {

    @RequestMapping(value="/somar", method=RequestMethod.POST, headers="Accept=application/json")
    public Resultado somar(@RequestBody Soma soma){
    	return soma.calcular();
    }
   
}