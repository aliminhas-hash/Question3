/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author User
 */
public class B {
        String s1="Nimra Rahim";
        String s2="Abdul Rahim";
        String exchange;
    public void exchange(){
        
        System.out.println("I am Me: "+s1);
        System.out.println("He is my Father: "+s2);
        exchange=s1;
        s1=s2;
        s2=exchange;
        System.out.println("I am Me: "+s1);
        System.out.println("He is my Father: "+s2);
        
    }
    
}
