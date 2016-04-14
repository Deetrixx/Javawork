/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dennis
 */
public class Braintezzer {
   public static void main (String[] args){
       int [] k={1,2,3,4,5};
       int [] l={5,6,7,8,9};
       for(int m=0; m<k.length;m++){
           for(int n=0;n<l.length;n++){
               if (k[m]==l[n]){
                   System.out.println(k[m]);
               }
           }
       }
   }
}
