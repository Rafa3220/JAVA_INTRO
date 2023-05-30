/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Rafaapre {
    
    private Rafaapre() {
    }
    
    public static Rafaapre getInstance() {
        return RafaapreHolder.INSTANCE;
    }
    
    private static class RafaapreHolder {

        private static final Rafaapre INSTANCE = new Rafaapre();
    }
}
