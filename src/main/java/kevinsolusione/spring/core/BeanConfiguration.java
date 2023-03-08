/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core;

import kevinsolusione.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author vckev
 */
@Slf4j
@Configuration
public class BeanConfiguration {
    
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("create new Foo");
        return foo;
    }
    
    
}
