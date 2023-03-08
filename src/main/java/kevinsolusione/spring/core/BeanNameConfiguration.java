/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core;

import kevinsolusione.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author vckev
 */
public class BeanNameConfiguration {
    
    @Primary
    @Bean(value="fooFirst")
    public Foo foo1() {
        Foo foo1  = new Foo();
        return foo1;
    }
    
    @Bean(value="fooSecond")
    public Foo foo2() {
        Foo foo2  = new Foo();
        return foo2;
    }
}
