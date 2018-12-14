/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.services;

/**
 *
 * @author 2108263
 */
public interface MovieServi {

    /**
     * 
     * @param movie
     * @param year
     * @return
     * @throws MoviesServicesException 
     */
    public Object getInfo(String movie, String year) throws MoviesServicesException;
}