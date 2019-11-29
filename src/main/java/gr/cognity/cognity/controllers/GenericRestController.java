/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.controllers;

import java.util.Arrays;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nmpellias
 */
@RestController
@RequestMapping("/cognity")
public class GenericRestController {
    
    @GetMapping()
    public List<Object> list() {
        return Arrays.asList(new Object[]{"Nikos", "Maria", 123, 4567.97});
    }

}



