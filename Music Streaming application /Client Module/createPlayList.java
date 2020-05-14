/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nisalgamage
 */
public class createPlayList {

    LinkedList<SongValues> createPlaylist = new LinkedList<>();

    public void addSong(String name) {
        fSong n = new fSong();
        n.addSongs();
        for (SongValues item : n.songs) {
            if (item.song.rettitle().equals(name)) {
                createPlaylist.add(item);
            }
        }

    }

    public void convertTOJSON(String fileName) {
        fileName="/Users/nisalgamage/NetBeansProjects/MS/src/ms/profiles/"+fileName+".json";
        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            Gson gson = new GsonBuilder().create();
            
            gson.toJson(createPlaylist, writer);
            writer.flush();
            writer.close();
           
        } catch (IOException ex) {
            Logger.getLogger(createPlayList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(createPlayList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        createPlaylist.clear();
    }
    
    
    public void deleteplaylist(String name){
        
        String path="/Users/nisalgamage/NetBeansProjects/MS/src/ms/profiles/"+name;
         File file = new File(path); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
    }

   /* public static void main(String[] args) {
        createPlayList nn = new createPlayList();
        nn.addSong("President Johnson");
        nn.addSong("Ma Louise");
        for (SongValues item : nn.createPlaylist) {
            System.out.println(item.artist.retname());
        }
       //nn.convertTOJSON();
        nn.deleteplaylist("operatorList.json");
    }
    
    
*/
}
