package com.ssafy.home.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.home.service.DongService;

import java.util.List;

@RestController
@RequestMapping("/dong")
@CrossOrigin(origins = "http://localhost:8080")
public class DongController {

    @Autowired
    private DongService service;

    @GetMapping("/sido")
    public ResponseEntity<?> getSido() throws Exception{
        try {
            return new ResponseEntity<List<String>>(service.getSido(), HttpStatus.OK);
        }catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("서버 오류",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/gugun")
    public ResponseEntity<?> getGugun(String sido) throws Exception{
        try {
            return new ResponseEntity<List<String>>(service.getGugun(sido), HttpStatus.OK);
        }catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("서버 오류",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dong")
    public ResponseEntity<?> getDong(String gugun) throws Exception{
        try {
            return new ResponseEntity<List<String>>(service.getDong(gugun), HttpStatus.OK);
        }catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("서버 오류",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
