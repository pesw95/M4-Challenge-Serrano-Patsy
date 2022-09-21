package com.example.utilityapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@RestController
public class CalculatorController {

    public CalculatorController() {
    }

    @RequestMapping(value = "/calculator/divide", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public double divide(@RequestParam  int value1, @RequestParam int value2) {
        if( value2 == 0){
            throw new IllegalArgumentException("Divided by 0.");
        }

        return value1 / value2;
    }

    @RequestMapping(value = "/calculator/square/{value}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public int square(@PathVariable int value) {
        if (value * value> 2147483647){
            throw new IllegalArgumentException("Exceeds maximum integers.");
        }

        return value * value;
    }


}
