package com.example.demo.controller;

import com.example.demo.api.spec.handler.StoreApi;
import com.example.demo.api.spec.model.Order;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class StoreApiController implements StoreApi {

    public ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") String orderId){
        return null;
    }
}
