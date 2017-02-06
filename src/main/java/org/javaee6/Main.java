/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee6;

import IsbnGenerator.IsbnGenerator;
import javax.annotation.Resource;

/**
 *
 * @author jamietobin
 */
public class Main {
    //@SuppressWarnings("FieldMayBeFinal")
    //private static IsbnGenerator isbnGenerator = new IsbnGenerator();
    
    
    // Instead of creating and setting an instance of the IsbnGenerator yourself
    // as following, you are going to use @Resource annotation to set it.
    //
    //   private static IsbnGenerator isbnGenerator = new IsbnGenerator();
    //
    // The @Resource annotation can be used only within a container environment, however.
    // So you want to run this application as following. (By the way, the "appclient"
    // is located under <GlassFish_Installation_Directory>/glassfish/bin directory.
    //
    //   appclient -jar  <jar-path>
    //
    // If you run it without using appclient container, you will experience a
    // NullPoint exception because the "isbnGenerator" is not set.
   
    @Resource
    private static IsbnGenerator isbnGenerator;
    
    public static void main (String args[]){
        System.out.println("##### ISBN number generated is " + isbnGenerator.generateIsbn() + " #####");
    }
}
