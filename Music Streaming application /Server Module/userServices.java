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
public class userServices {
 
  
    String validateUser(String userName, String password)
    {
        if (userName.equals("admin") && password.equals("admin"))
            return "true";
        return "false";
    }

}
