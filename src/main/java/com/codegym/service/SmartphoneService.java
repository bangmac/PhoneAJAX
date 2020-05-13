package com.codegym.service;

import com.codegym.model.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findALl();

    Smartphone findById(Integer id);

    Smartphone save(Smartphone phone);

    Smartphone remove(Integer id);

}
