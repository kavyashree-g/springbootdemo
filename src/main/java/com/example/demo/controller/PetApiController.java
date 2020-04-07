package com.example.demo.controller;

import com.example.demo.api.spec.handler.PetApi;
import com.example.demo.api.spec.model.Pet;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class PetApiController implements PetApi {

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Long petId) {
        return null;
    }
}
