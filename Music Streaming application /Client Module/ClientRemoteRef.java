package ms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ms;
/**
 *
 * @author nisalgamage
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class ClientRemoteRef {

    //private ClientCommunicationModule client;
    //public ClientRemoteRef(ClientCommunicationModule client) {
//        this.client = client;
    //}
    /**
     * This class is for client to receive a JSON with parameters for the
     * desired Remote Method
     *
     * @param remoteMethod = name of method client wishes to find
     * @return - JSON Object of desired method
     */
    public JsonObject getRemoteReference(String remoteMethod) {
        //Setting temp JsonObject
        System.out.println("came here");
        Gson gson = new Gson();
        JsonObject request = new JsonObject();
        JsonObject[] jsonRequest;
        JsonObject params = new JsonObject();

        //Creating an array of Json Objects from mycatalogue.json
        try {
            String path = "mycatalogue.json";
            BufferedReader br = new BufferedReader(new FileReader(path));
            RemoteMethod[] c = gson.fromJson(br, RemoteMethod[].class);

            int i;
            //Looks for method name, and returns JSON object with matching name
            for (i = 0; i < c.length; i++) {
                System.out.println(c[i].remoteMethod + ", " + c[i].object);
                
                for (Map.Entry<String, String> entry : c[i].param.entrySet()) {
                        System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
                        if (entry.getKey().equals("username")) {
                        params.addProperty(entry.getKey(), entry.getValue());
                    }
                        if (entry.getKey().equals("password")) {
                          params.addProperty(entry.getKey(), entry.getValue());
 }
                    }
                
                //if remote method convert to json
                if (remoteMethod.equals(c[i].remoteMethod)) {
                    request.addProperty("remoteMethod", c[i].remoteMethod);
                    request.addProperty("object", c[i].object);
                    request.addProperty("call_semantics", c[i].call_semantics);
                    request.add("param", params);
                    request.addProperty("ret", c[i].ret);
                    
                }
                

            }
        } catch (FileNotFoundException e) {
        }
        System.out.println(request);
        return request;
    }

//    public static void main(String[] args) {
//        ClientRemoteRef c = new ClientRemoteRef();
//        JsonObject catalog = c.getRemoteReference("validateUser");
//        
//           
//    }
   
}
