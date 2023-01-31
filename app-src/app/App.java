/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Taher
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static double somme(double nb1, double nb2) {
        ex.Article_Service service = new ex.Article_Service();
        ex.Article port = service.getArticlePort();
        return port.somme(nb1, nb2);
    }
    
}
