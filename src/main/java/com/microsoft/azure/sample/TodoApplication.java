/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class TodoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("%%%%%%%%\n%%%%%%%%\n%%%%%%%%\n%%%%%%%% Test message from standard output %%%%%%%%\n%%%%%%%%\n%%%%%%%%\n%%%%%%%%");
        return application.sources(TodoApplication.class);
    }

    // public static void main(String[] args) {
    //     SpringApplication.run(TodoApplication.class, args);
    // }
}



