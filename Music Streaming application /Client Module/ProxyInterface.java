/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import com.google.gson.JsonObject;

/**
 *
 * @author nisalgamage
 */
class ProxyInterface {
    JsonObject synchExecution(String remoteMethod, Object... param)
{
   for (Object arg : param) 
   {
     System.out.println(arg);
   }
        return null;
}
}
