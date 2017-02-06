/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee6;

import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author jamietobin
 */
public class LoggingInterceptor {
    // ======================================
    // =             Attributes             =
    // ======================================
    
    //private Logger logger = new Logger.getLogger("org.javaee6");
    private Logger logger = Logger.getLogger("org.javaee6");
    
    // ======================================
    // =          Business methods          =
    // ======================================

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.info(">> " + ic.getTarget().getClass() + " - " + ic.getMethod().getName());
        try {
            return ic.proceed();
        }
        finally{
            logger.info("<< " + ic.getTarget().getClass() + " - " + ic.getMethod().getName());
        }
    }
    
}
