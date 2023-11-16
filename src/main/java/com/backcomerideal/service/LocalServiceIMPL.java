package com.backcomerideal.service;

import com.backcomerideal.model.Local;
import com.backcomerideal.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceIMPL implements LocalService{

    @Autowired
    private LocalRepository localRepository;

    @Override
    public List<Local> getLocalesByDistrictId(String districtId) {
        //Mostrar locales filtrado por distrito
        return localRepository.findByDistrictId(districtId);

    }

    @Override
    public List<Local> getAllLocales() {

        return localRepository.findAll();
    }

    @Override
    public Local getLocalById(String id) {
        return null;
    }

    @Override
    public List<Local> getLocalesByActivityType(String activityType) {
        return null;
    }
}
