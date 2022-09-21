package com.usaciclo3.ejemplo1.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo1")
public class controlador {

    @GetMapping("/holamundo")   //URL PARA CORRER EN NAVEGADOR: http://localhost:8080/ejemplo1/holamundo
    public String holamundo(){
        return "<font color=\"Black\" face=\"Comic Sans MS,arial\">\n" +
                "  <h1 align=\"center\"><i>EN DON KAMARON TENEMOS EL MEJOR LUGAR PARA COMER EN FAMILIA O EN PAREJA</i></h1>\n" +
                "  <h2 align=\"center\">los mejores mariscos los encuentras aqui en el restaurante don kamaron. Tambien encuentras pollos y costillas asadas al estilo pascuero y micheladas 2x1 TODOS los dias. Nuestro horario es de 12 pm a 7 pm, estamos en el entronque por la entrada de autozone. Don Kamaron el mejor lugar para comer en familia o en parejaaa.</h2>\n" +
                "  </font>";
    }

}
