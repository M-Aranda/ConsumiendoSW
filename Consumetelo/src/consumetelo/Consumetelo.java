/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumetelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Persona;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;

/**
 *
 * @author Marce
 */
public class Consumetelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Esto funciona pero, retorna un XML de TODO
        try {
            HttpClient client;
            client= HttpClientBuilder.create().build();
            HttpGet request= new HttpGet("http://localhost:8080/Intento_sw_2/webresources/model.persona");
            HttpResponse response=client.execute(request);
            BufferedReader br=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line=" ";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Consumetelo.class.getName()).log(Level.SEVERE, null, ex);
        }
         */

        //Esto funciona pero solo si se usa find_XML, en cuyo caso muestra un String a partri de un XML
        //Sin embargo, al usar find_JSON me tira error 500
        //at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:929)
      //  try {
            NewJerseyClient nj = new NewJerseyClient();
            Persona p = nj.find_XML(Persona.class, "1");
            System.out.println(p);
/*
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
            */

            


    }

}
