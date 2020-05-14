/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author nisalgamage
 */
public class fSong {

    LinkedList<String> songNames = new LinkedList<>();
    LinkedList<String> songArtist = new LinkedList<>();
    LinkedList<SongValues> songs = new LinkedList<>();

    public String findSong(String songTitle) {

        try ( var reader = new FileReader("./music.json")) {
            //Read JSON file
            Gson gson = new Gson();

            SongValues[] s = gson.fromJson(reader, SongValues[].class);
            for (SongValues item : s) {
                if (item.song.rettitle().equals(songTitle)) {
                    return "exists";
                }
            }

        } catch (JsonParseException | IOException e) {
        }

        return "doesent exist";
    }

    public void addNames() {
        try ( var reader = new FileReader("./music.json")) {
            //Read JSON file
            Gson gson = new Gson();

            SongValues[] s = gson.fromJson(reader, SongValues[].class);
            for (SongValues item : s) {
                songNames.add(item.song.rettitle());
            }

        } catch (JsonParseException | IOException e) {
        }
    }
    
     public void addSongs() {
        try ( var reader = new FileReader("./music.json")) {
            //Read JSON file
            Gson gson = new Gson();

            SongValues[] s = gson.fromJson(reader, SongValues[].class);
            for (SongValues item : s) {
                songs.add(item);
            }

        } catch (JsonParseException | IOException e) {
        }
    }
     
     public void addArtist() {
        try ( var reader = new FileReader("./music.json")) {
            //Read JSON file
            Gson gson = new Gson();

            SongValues[] s = gson.fromJson(reader, SongValues[].class);
            for (SongValues item : s) {
                songArtist.add(item.artist.retname());
            }

        } catch (JsonParseException | IOException e) {
        }
    }

}
