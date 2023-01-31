/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Taher
 */
@WebService(serviceName = "article")
public class article {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    /**@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    

    /**
     * Web service operation
     * @param nb1
     * @param nb2
     * @return 
     */
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "nb1") double nb1, @WebParam(name = "nb2") double nb2) {
        //TODO write your implementation code here:
        return nb1+nb2;
    }
    @WebMethod(operationName = "decompser")
    public String decompser(@WebParam(name = "nb1") double nb1) {
        //TODO write your implementation code here:
        double nbr=nb1;
        int i;
        String ch="";
        for(i=2;i<=nbr;i++){
            if(nbr % i == 0 && nbr > i){
             ch=ch+"*"+i;
             nbr/=i;
             i--;
            }
        }
         
    return nb1 + " = " +ch+" * "+nbr;
    }
    @WebMethod(operationName = "pair_impair")
    public String pair_impair(@WebParam(name = "nbr") double nbr) {
        //TODO write your implementation code here:
     
        if (nbr % 2 == 0)
      return "Le nombre "+nbr+" est pair." ;
        else
      return "Le nombre "+nbr+" est impair.";
        
  }
            
        @WebMethod(operationName = "puissance")
    public double puissance(@WebParam(name = "nb1") double nb1, @WebParam(name = "nb2") double nb2) {
        //TODO write your implementation code here:
     double result = 1;
       for (int i = 0; i < nb2; i++) {
           result = nb1 * result;
       }
    return result;
   }
    
         @WebMethod(operationName = "factorielle")
    public String factorielle(@WebParam(name = "nb1") double nb1) {
        //TODO write your implementation code here:
        int i,fact=1;
        for(i=1;i<=nb1;i++){
        fact=fact*i;
        }
    return "La factorielle de "+nb1+" est : "+fact ;
 
     } 
     
    
      @WebMethod(operationName = "max")
    public String max(@WebParam(name = "nb1") double nb1, @WebParam(name = "nb2") double nb2) {
        //TODO write your implementation code here:
      
       return ("Le max est " + Math.max(nb1, nb2));
   
       }
       
        @WebMethod(operationName = "min")
    public String min(@WebParam(name = "nb1") double nb1, @WebParam(name = "nb2") double nb2) {
        //TODO write your implementation code here:
       
       return ("Le min est " + Math.min(nb1, nb2));
   
    }
    @WebMethod(operationName = "identique")
    public Boolean identique(@WebParam(name = "ch1") String ch1, @WebParam(name = "ch2") String ch2) {
        //TODO write your implementation code here:
    return ch1.equals(ch2); 
       
    }
    
    /**
     *
     * @param ch
     * @return
     */
    @WebMethod(operationName = "renverser")
    public String renverser(@WebParam(name = "ch") String ch) {
        //TODO write your implementation code here:
    String result="";
    int i;
    for (i=ch.length()-1;i>=0;i--){
        result = result.concat(""+ch.charAt(i));
    }
    return result ;
      
     
       
   
    }   
  }
        
        
        
    

