package com.example.demo.controller;

import com.example.demo.api.spec.handler.UserApi;
import com.example.demo.api.spec.model.User;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class UserApiController implements UserApi {

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username){
        return null;
    }
}
