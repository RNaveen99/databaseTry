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
public class Demo {
    public static void main(String[] args) {
        try(Abc a = new Abc();
            Xyz x = new Xyz()) {
            throw new Exception("Exception 1");
        } catch(Exception e) {
            System.out.println("Exception 2");
//            throw new Exception("Exception 3");
        }
    }
}
