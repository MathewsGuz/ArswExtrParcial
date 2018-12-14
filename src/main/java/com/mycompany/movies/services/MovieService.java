/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.services;

import com.mycompany.movies.connection.HttpConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2108263
 */
@Service
public class MovieService implements MovieServi{
    @Autowired
    HttpConnection connection;
    
    private String result;
    
    @Override
    public String getInfo(String movie, String year) throws MoviesServicesException{
        result="marvel";
        connection.connect(movie, year);
        connection.run();
        result= connection.getResult();
        return result;
    }
}
