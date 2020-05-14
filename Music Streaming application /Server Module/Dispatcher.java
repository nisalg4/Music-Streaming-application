/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author nisalgamage
 */


/**
* The Dispatcher implements DispatcherInterface. 
*
* @author  Oscar Morales-Ponce
* @version 0.15
* @since   02-11-2019 
*/

import java.util.HashMap;
import java.util.*;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileReader;


public class Dispatcher implements DispatcherInterface {
    HashMap<String, Object> ListOfObjects;
    

    public Dispatcher()
    {
        ListOfObjects = new HashMap<String, Object>();
    }
    
    /* 
    * dispatch: Executes the remote method in the corresponding Object
    * @param request: Request: it is a Json file
    {
        "remoteMethod":"getSongChunk",
        "objectName":"SongServices",
        "param":
          {
              "song":490183,
              "fragment":2
          }
    }
    */
    @Override
    public String dispatch(String request)
    {   Gson gson = new Gson();
        String jsonReturn = new String();
        //JsonParser parser = new JsonParser();
        System.out.println("this is the request"+request);

       // JsonObject jsonRequest = parser.parse(request).getAsJsonObject();
       // BufferedReader br = new BufferedReader(jsonRequest);
        remMethod c = gson.fromJson(request, remMethod.class); //    System.out.println(e);
        //jsonReturn.addProperty("error", "Error on " + jsonRequest.get("object").getAsString() + "." + jsonRequest.get("remoteMethod").getAsString());
        String[] params = {"a","b"};
       
            
            for (Map.Entry<String, String> entry : c.param.entrySet()) {
                System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
                if (entry.getKey().equals("username")) {
                  params[0]=entry.getValue();  
                }
                if (entry.getKey().equals("password")) {
                    params[1]=entry.getValue();  
                }
                
            }
        
        
        userServices us=new userServices();
        jsonReturn=us.validateUser(params[0], params[1]);
        // Obtains the object pointing to SongServices
//            Object object = ListOfObjects.get(jsonRequest.get("object").getAsString());
//            Method[] methods = object.getClass().getMethods();
//            Method method = null;
//            // Obtains the method
//            for (int i=0; i<methods.length; i++)
//            {   
//                if (methods[i].getName().equals(jsonRequest.get("remoteMethod").getAsString()))
//                    method = methods[i];
//            }
//            if (method == null)
//            {
//                jsonReturn.addProperty("error", "Method does not exist");
//                return jsonReturn.toString();
//            }
//            System.out.println("hereherere");
//            // Prepare the  parameters 
//            Class[] types =  method.getParameterTypes();
//            Object[] parameter = new Object[types.length];
//            String[] strParam = new String[types.length];
//            JsonObject jsonParam = jsonRequest.get("param").getAsJsonObject();
//            int j = 0;
//            for (Map.Entry<String, JsonElement>  entry  :  jsonParam.entrySet())
//            {
//                strParam[j++] = entry.getValue().getAsString();
//            }
//            // Prepare parameters
//            for (int i=0; i<types.length; i++)
//            {
//                switch (types[i].getCanonicalName())
//                {
//                    case "java.lang.Long":
//                        parameter[i] =  Long.parseLong(strParam[i]);
//                        break;
//                    case "java.lang.Integer":
//                        parameter[i] =  Integer.parseInt(strParam[i]);
//                        break;
//                    case "java.lang.String":
//                        parameter[i] = new String(strParam[i]);
//                        break;
//                }
//            }
//            // Prepare the return
//            Class returnType = method.getReturnType();
//            String ret = "";
//            switch (returnType.getCanonicalName())
//                {
//                    case "java.lang.Long":
//                        ret = method.invoke(object, parameter).toString();
//                        break;
//                    case "java.lang.Integer":
//                        ret = method.invoke(object, parameter).toString();
//                        break;
//                    case "java.lang.String":
//                        ret = (String)method.invoke(object, parameter);
//                        break;
//                }
//                jsonReturn.addProperty("ret", ret);
//
     
        return jsonReturn;
    }

    /* 
    * registerObject: It register the objects that handle the request
    * @param remoteMethod: It is the name of the method that 
    *  objectName implements. 
    * @objectName: It is the main class that contaions the remote methods
    * each object can contain several remote methods
    */

    /**
     *
     * @param remoteMethod
     * @param objectName
     */

    @Override
    public void registerObject(Object remoteMethod, String objectName)
    {
        ListOfObjects.put(objectName, remoteMethod);
    }
    
    //////////////////
    /* Just for Testing */
    //////////////////
    public static void main(String[] args) {
        // Instance of the Dispatcher
        Dispatcher dispatcher = new Dispatcher();
        // Instance of the services that te dispatcher can handle
        SongDispatcher songDispatcher = new SongDispatcher();
        userServices userServices = new userServices();
        //dispatcher.registerObject(songDispatcher, "SongServices");  
    
        dispatcher.registerObject(userServices, "userServices");  
        
        commModuleServer commModule = new commModuleServer(5000, dispatcher);
        
        commModule.run();
    
        // Testing  the dispatcher function
        // First we read the request. In the final implementation the jsonRequest
        // is obtained from the communication module
       // try {
        //    String jsonRequest = new String(Files.readAllBytes(Paths.get("./getSongChunk.json")));
         //   String ret = dispatcher.dispatch(jsonRequest);
          //  System.out.println(ret);

            //System.out.println(jsonRequest);
       // } catch (Exception e)
        //{
         //   System.out.println(e);
        //}
        
    } 
}

