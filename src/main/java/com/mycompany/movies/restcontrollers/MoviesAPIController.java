/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.restcontrollers;


import com.mycompany.movies.services.MovieService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2108310
 */

@RestController
@RequestMapping(value = "/movie")
@Service
public class MoviesAPIController {
    @Autowired
    MovieService cine;
    
    @RequestMapping(method = RequestMethod.GET,value="/{title}/{year}")
    public ResponseEntity<?> getMovie(@PathVariable("title") String movie, @PathVariable("year") String year){
        try{
            return new ResponseEntity<>(cine.getInfo(movie,year),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(MoviesAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
}
