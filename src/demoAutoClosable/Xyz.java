/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoAutoClosable;

/**
 *
 * @author c3
 */
public class Xyz implements AutoCloseable{

    Xyz() {
        System.out.println("Creating XYZ");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing XYZ");
    }
    
}
