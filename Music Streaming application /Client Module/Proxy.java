/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.TreeSet;

/**
 *
 * @author nisalgamage
 */

public class Proxy extends ProxyInterface {

    private ClientCommunicationModule client = null;
    

    public Proxy(int portNumber) {
        this.client = new ClientCommunicationModule();
        client.connect(portNumber);
       // this.crr = new ClientRemoteRef(client);
    }

    /**
     * This class creates a JSON object by referencing the catalog.json The
     * method then dynamically enters the parameters necessary for the method
     *
     * @param remoteMethod = name of method client wishes to find
     * @param param = String array of parameters
     * @return - JSON Object of desired method
     */
    public JsonObject synchExecution(String remoteMethod, String[] param) {
        System.out.println(remoteMethod);
        for (int x=0;x<2;x++) {
            System.out.println(param[x]);
        }
        ClientRemoteRef crr=new ClientRemoteRef();
        JsonObject jsonRequest = crr.getRemoteReference(remoteMethod);
        
        JsonObject jsonParam = jsonRequest.get("param").getAsJsonObject();
        

      /*  TreeSet<String> entries = new TreeSet<>(jsonParam.);
        int i = 0;
        for (String s : entries) {
            //specify types for param-question was if the param type is already 
            //why should i define it again
            
            jsonParam.addProperty(s, param[i]);
            i++;
        }*/
       
        jsonParam.addProperty("username", param[0]);
        jsonParam.addProperty("password", param[1]);
        jsonRequest.add("param", jsonParam);

        JsonParser parser = new JsonParser();
        System.out.println("Sending request: " + jsonRequest.toString());
        String strRet = client.sendRequest(jsonRequest.toString());
        System.out.println("Returning response from server to input stream: " + strRet);
        
        
        JsonObject n=new JsonObject();
        String myReturn =strRet.trim() ;
        n.addProperty("ret", myReturn);
        
        return n;
    }
    
   

    
    
}
