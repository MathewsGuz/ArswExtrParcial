/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.connection;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2108263
 */
@Service
public interface Provider {
    public String getUrl(String title, String year);
}
