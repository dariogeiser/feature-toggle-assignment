package com.swisscom.featuretoggle.repository;

import com.swisscom.featuretoggle.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorld, String> {

    HelloWorld findByName(String name);
}
