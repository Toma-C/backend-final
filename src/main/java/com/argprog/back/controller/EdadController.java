
package com.argprog.back.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class EdadController {
    @GetMapping("/edad")
    public long calcEdad(@RequestParam int diaNac,
                    @RequestParam int mesNac,
                    @RequestParam int annioNac){
        LocalDate fechaNac = LocalDate.of(annioNac,mesNac,diaNac);
        LocalDate fechaActual = LocalDate.now();
        long diferenciaEdad = ChronoUnit.YEARS.between(fechaNac, fechaActual);
        return diferenciaEdad;
    }
}
