/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core;

import kevinsolusione.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author vckev
 */
public class BeanNameTest {
    private ApplicationContext context;
    
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }
    
    @Test
    void beanNameTest() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("fooFirst", Foo.class);
        Foo foo2 = context.getBean("fooSecond", Foo.class);
        
        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
    }
}
