package com.swisscom.featuretoggle.api;

import com.swisscom.featuretoggle.model.HelloWorld;
import com.swisscom.featuretoggle.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FeaturToggleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    @ResponseBody
    public HelloWorld getTestData() {
        return helloWorldService.getHelloWorld();
    }
}
