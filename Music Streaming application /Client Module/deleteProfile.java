/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import java.io.File;
import java.io.*;
import java.util.LinkedList;

/**
 *
 * @author nisalgamage
 */
public class deleteProfile {

    LinkedList<File> allprofiles = new LinkedList();

    public void dispAllprofiles() {
        File folder = new File("/Users/nisalgamage/NetBeansProjects/MS/src/ms/profiles/");
        File[] listOfFiles = folder.listFiles();

        for (File item : listOfFiles) {
            if (item.isFile()) {
                allprofiles.add(item);
            }
        }
    }

   public void delallProf(){
       allprofiles.clear();
   }
    
    
}
