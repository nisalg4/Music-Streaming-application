/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class musicStreamermain extends javax.swing.JFrame {

    /**
     * Creates new form musicStreamermain
     */
    public musicStreamermain() {
        initComponents();

    }
//this is the music player .the remote input stream has to be changed 
    void mp3play(String file) {
     /*   try {
            // It uses CECS327InputStream as InputStream to play the song 
           ProxyInterface i=new ProxyInterface();
            InputStream is = new CECS327RemoteInputStream(i);
            Player mp3player = new Player(is);
            mp3player.play();
        } catch (JavaLayerException exception) {
        } */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        playplay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dispSongsSearch = new javax.swing.JComboBox<>();
        Panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NewPlayListName = new javax.swing.JTextField();
        AddSongtoPlaylist = new javax.swing.JButton();
        SavePlayList = new javax.swing.JButton();
        dspSongs = new javax.swing.JComboBox<>();
        EditSelectedSongs = new javax.swing.JComboBox<>();
        DeleteSongItem = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        delcmbbx = new javax.swing.JComboBox<>();
        deletePlaylist = new javax.swing.JButton();
        searchsong = new javax.swing.JButton();
        searchsongby = new javax.swing.JButton();
        dPL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new java.awt.CardLayout());

        playplay.setText("Play");
        playplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playplayActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Song Name");

        dispSongsSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Song" }));
        dispSongsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispSongsSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(playplay))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addGap(96, 96, 96)
                        .addComponent(dispSongsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dispSongsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(playplay)
                .addGap(67, 67, 67))
        );

        mainpanel.add(Panel1, "panelone");

        jLabel4.setText("New PlayList Name");

        NewPlayListName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPlayListNameActionPerformed(evt);
            }
        });

        AddSongtoPlaylist.setText("Add");
        AddSongtoPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSongtoPlaylistActionPerformed(evt);
            }
        });

        SavePlayList.setText("Save");
        SavePlayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePlayListActionPerformed(evt);
            }
        });

        dspSongs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Song " }));
        dspSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspSongsActionPerformed(evt);
            }
        });

        EditSelectedSongs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edit a Song", " " }));
        EditSelectedSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSelectedSongsActionPerformed(evt);
            }
        });

        DeleteSongItem.setText("Delete");
        DeleteSongItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSongItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditSelectedSongs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dspSongs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewPlayListName)
                    .addComponent(AddSongtoPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteSongItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SavePlayList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(dspSongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddSongtoPlaylist)
                .addGap(18, 18, 18)
                .addComponent(EditSelectedSongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteSongItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavePlayList)
                    .addComponent(jLabel4)
                    .addComponent(NewPlayListName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanel.add(Panel2, "paneltwo");

        delcmbbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select playlist" }));

        deletePlaylist.setText("Delete");
        deletePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(delcmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(deletePlaylist)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(delcmbbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(deletePlaylist)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        mainpanel.add(Panel3, "panelthree");

        searchsong.setText("Search Song");
        searchsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsongActionPerformed(evt);
            }
        });

        searchsongby.setText("Create or Delete Playlists");
        searchsongby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsongbyActionPerformed(evt);
            }
        });

        dPL.setText("Delete playlists");
        dPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(searchsong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchsongby)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dPL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchsong)
                    .addComponent(searchsongby)
                    .addComponent(dPL))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsongActionPerformed
        CardLayout card = (CardLayout) mainpanel.getLayout();
        card.show(mainpanel, "panelone");
        fSong n = new fSong();
        n.addSongs();

        for (SongValues item : n.songs) {
            dispSongsSearch.addItem(item.song.rettitle());
        }
    }//GEN-LAST:event_searchsongActionPerformed

    private void searchsongbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsongbyActionPerformed
        CardLayout card = (CardLayout) mainpanel.getLayout();
        card.show(mainpanel, "paneltwo");
         fSong n = new fSong();
        n.addSongs();
        for (SongValues item : n.songs) {
            dspSongs.addItem(item.song.rettitle());
        }
    }//GEN-LAST:event_searchsongbyActionPerformed

    private void dPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPLActionPerformed
        CardLayout card = (CardLayout) mainpanel.getLayout();
        card.show(mainpanel, "panelthree");
delcmbbx.removeAllItems();
       deleteProfile n=new deleteProfile();
       n.dispAllprofiles();
        for (File item:n.allprofiles) {
            delcmbbx.addItem(item.getName());
        }
        n.delallProf();
        
    }//GEN-LAST:event_dPLActionPerformed

    private void playplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playplayActionPerformed
        // TODO add your handling code here:
        Integer i;
        musicStreamermain player = new musicStreamermain();
        player.mp3play("/Users/nisalgamage/NetBeansProjects/MS/src/ms/imperial.mp3");


    }//GEN-LAST:event_playplayActionPerformed

    private void NewPlayListNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPlayListNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPlayListNameActionPerformed

    private void dispSongsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispSongsSearchActionPerformed

    }//GEN-LAST:event_dispSongsSearchActionPerformed

    private void dspSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspSongsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dspSongsActionPerformed

    private void AddSongtoPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSongtoPlaylistActionPerformed
        // TODO add your handling code here:
        EditSelectedSongs.addItem((String) dspSongs.getSelectedItem());
        
    }//GEN-LAST:event_AddSongtoPlaylistActionPerformed

    private void EditSelectedSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSelectedSongsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditSelectedSongsActionPerformed

    private void DeleteSongItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSongItemActionPerformed
        // TODO add your handling code here:
        EditSelectedSongs.removeItem(EditSelectedSongs.getSelectedItem());
    }//GEN-LAST:event_DeleteSongItemActionPerformed

    private void SavePlayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePlayListActionPerformed
        // TODO add your handling code here:
        createPlayList n=new createPlayList();
        for (int i=0;i<EditSelectedSongs.getItemCount();i++) {
            n.addSong(EditSelectedSongs.getItemAt(i));
        }
        n.convertTOJSON(NewPlayListName.getText());
       
    }//GEN-LAST:event_SavePlayListActionPerformed

    private void deletePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlaylistActionPerformed
        // TODO add your handling code here:
        createPlayList nn=new createPlayList();
        nn.deleteplaylist(delcmbbx.getSelectedItem().toString());
        
        
        
    }//GEN-LAST:event_deletePlaylistActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(musicStreamermain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicStreamermain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicStreamermain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicStreamermain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicStreamermain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSongtoPlaylist;
    private javax.swing.JButton DeleteSongItem;
    private javax.swing.JComboBox<String> EditSelectedSongs;
    private javax.swing.JTextField NewPlayListName;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton SavePlayList;
    private javax.swing.JButton dPL;
    private javax.swing.JComboBox<String> delcmbbx;
    private javax.swing.JButton deletePlaylist;
    private javax.swing.JComboBox<String> dispSongsSearch;
    private javax.swing.JComboBox<String> dspSongs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton playplay;
    private javax.swing.JButton searchsong;
    private javax.swing.JButton searchsongby;
    // End of variables declaration//GEN-END:variables
}