package com.example.ribbonclient.controller;

import com.example.ribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public ResponseEntity<String> hi(@RequestParam(value = "name", required = false, defaultValue = "hezhan") String name){
        return ribbonService.hi(name);
    }
}
