package com.swisscom.featuretoggle.service;

import com.swisscom.featuretoggle.model.HelloWorld;
import com.swisscom.featuretoggle.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    @PostConstruct
    private void postConstruct() {
        if (helloWorldRepository.findAll().size() == 0) {
            helloWorldRepository.save(new HelloWorld("1","Hello"));
        }
    }

    public HelloWorld getHelloWorld() {
        return helloWorldRepository.findById("1").get();
    }
}
