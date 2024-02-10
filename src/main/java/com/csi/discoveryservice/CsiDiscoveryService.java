/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.csi.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author ratnesh
 */
@SpringBootApplication
@EnableEurekaServer
public class CsiDiscoveryService {

    public static void main(String[] args) {
        SpringApplication.run(CsiDiscoveryService.class, args);
    }
}
