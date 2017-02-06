/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IsbnGenerator;

import java.util.Random;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.Interceptors;
import org.javaee6.LoggingInterceptor;

/**
 *
 * @author jamietobin
 */
@ManagedBean
public class IsbnGenerator {
    
    // ======================================
    // =          Lifecycle methods          =
    // ======================================
    
    @PostConstruct
    private void init(){
        System.out.println("\n=> PostConstruct");
        System.out.println("================");
    }
    
    @PreDestroy
    private void release() {
        System.out.println("=============");
        System.out.println("=> PreDestroy");
    }
    
    // ======================================
    // =          Business methods           =
    // ======================================

    @Interceptors(LoggingInterceptor.class)
    public String generateIsbn(){
        return "1-84356-" + Math.abs(new Random().nextInt());
    }
    
}
