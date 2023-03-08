/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core;

import kevinsolusione.spring.core.data.Bar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author vckev
 */
public class DependsOnTest {
    
    private ApplicationContext context;
    
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
    
    @Test
    void testDependsOn(){
        Bar bar = context.getBean(Bar.class);
    }
}
