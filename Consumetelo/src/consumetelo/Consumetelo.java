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

/**
 *
 * @author Marce
 */
public class Consumetelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        
        
        
        
        
        
        
        //Jersey me tira error
        /*
        NewJerseyClient nj= new NewJerseyClient();
        Persona p= nj.find_JSON(Persona.class,"1");
        System.out.println(p.getNombre());*/
    }
    
}
