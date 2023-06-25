/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world.com.HelloWoldSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leone
 */
@RestController
@Slf4j
public class InitControler {
    @GetMapping("/")
    public String init(){
        log.info("execute log on console from Spring");
        log.debug("more details controler");
        return "Hello World From Spring change";
    }
}
