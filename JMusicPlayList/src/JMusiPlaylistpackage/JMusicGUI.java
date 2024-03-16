/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JMusiPlaylistpackage;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**imports all needed imports

/**
 *
 * @author jamie
 */
public class JMusicGUI extends javax.swing.JFrame {
    
    private Stack<String> likedSongs;
    private Stack<String> IndieSongs;
    private Stack<String> OTAcoreSongs;
    
    private enum PlayListType {LIKED, INDIE, OTACORE}
    
   private PlayListType currentPlayListType;
   
   public Stack<String> getLikedSongs() {
       return likedSongs;
   }
   
   public Stack<String> getIndieSongs() {
       return IndieSongs;
   }
   
   public Stack<String> getOTAcoreSongs() {
       return OTAcoreSongs;
   }
   
   private Queue<String> playlistQueue = new LinkedList<>();
   
   private void addToPlaylistQueue(String songName) {
       playlistQueue.add(songName);
   }
   
   private int likedIndex = 0;
   private int indieIndex = 0;
   private int otaIndex = 0;
   
   private boolean Repeat = false;
   
   
   private void addToPlaylistQueue(Stack<String> songStack) {
       while (!songStack.isEmpty()){
           String songName = songStack.pop();
           playlistQueue.add(songName);
       }
   }
   
  
   
   
    
    
   

    /**
     * Creates new form JMusicGUI
     */
    public JMusicGUI() {
        initComponents();
        likedSongs = new Stack<>();
        IndieSongs = new Stack<>();
        OTAcoreSongs = new Stack<>();
        currentPlayListType = PlayListType.LIKED;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LikedPlaylist = new javax.swing.JButton();
        OtaCorePlaylist = new javax.swing.JButton();
        AddOTAcore = new javax.swing.JButton();
        SearchIndie = new javax.swing.JButton();
        DeleteOta = new javax.swing.JButton();
        SongInput = new javax.swing.JTextField();
        AddIndie = new javax.swing.JButton();
        SearchOta = new javax.swing.JButton();
        DeleteIndie = new javax.swing.JButton();
        IndiePlaylist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("JMusic App");

        LikedPlaylist.setText("Play LikedPlaylist ");
        LikedPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikedPlaylistActionPerformed(evt);
            }
        });

        OtaCorePlaylist.setText(" PLay OTAcCorePlaylist ");
        OtaCorePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtaCorePlaylistActionPerformed(evt);
            }
        });

        AddOTAcore.setText("add");
        AddOTAcore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOTAcoreActionPerformed(evt);
            }
        });

        SearchIndie.setText("search");
        SearchIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIndieActionPerformed(evt);
            }
        });

        DeleteOta.setText("delete");
        DeleteOta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOtaActionPerformed(evt);
            }
        });

        SongInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongInputActionPerformed(evt);
            }
        });

        AddIndie.setText("add");
        AddIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIndieActionPerformed(evt);
            }
        });

        SearchOta.setText("search");
        SearchOta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOtaActionPerformed(evt);
            }
        });

        DeleteIndie.setText("delete");
        DeleteIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteIndieActionPerformed(evt);
            }
        });

        IndiePlaylist.setText("Play IndiePlaylist ");
        IndiePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndiePlaylistActionPerformed(evt);
            }
        });

        jLabel2.setText("enter song here and press ENTER key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LikedPlaylist)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(149, Short.MAX_VALUE)
                        .addComponent(SearchOta)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteOta)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(SearchIndie)
                        .addGap(21, 21, 21)
                        .addComponent(DeleteIndie)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(IndiePlaylist)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AddOTAcore, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(AddIndie)
                                .addGap(39, 39, 39))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OtaCorePlaylist)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SongInput, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SongInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OtaCorePlaylist)
                    .addComponent(IndiePlaylist)
                    .addComponent(LikedPlaylist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddOTAcore, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddIndie))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteOta)
                    .addComponent(SearchOta)
                    .addComponent(SearchIndie)
                    .addComponent(DeleteIndie))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LikedPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikedPlaylistActionPerformed
             currentPlayListType = PlayListType.LIKED;
             JOptionPane.showMessageDialog(this, likedSongs);
    }//GEN-LAST:event_LikedPlaylistActionPerformed

    private void OtaCorePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtaCorePlaylistActionPerformed
             currentPlayListType = PlayListType.OTACORE;
             JOptionPane.showMessageDialog(this, OTAcoreSongs);
    }//GEN-LAST:event_OtaCorePlaylistActionPerformed

    private void AddOTAcoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOTAcoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOTAcoreActionPerformed

    private void SearchIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIndieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchIndieActionPerformed

    private void DeleteOtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteOtaActionPerformed

    private void SongInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongInputActionPerformed
       String songName = SongInput.getText().trim();
       if (!songName.isEmpty()) {
           likedSongs.push(songName);
           JOptionPane.showMessageDialog(this,songName + " has been added to liked songs");
           getLikedSongs();
           addToPlaylist(songName,currentPlayListType);
       }else{
           javax.swing.JOptionPane.showMessageDialog(this, "please enter a song name");
           
       }
    }//GEN-LAST:event_SongInputActionPerformed

    private void AddIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIndieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddIndieActionPerformed

    private void SearchOtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchOtaActionPerformed

    private void DeleteIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteIndieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteIndieActionPerformed

    private void IndiePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndiePlaylistActionPerformed
               currentPlayListType = PlayListType.INDIE;
             JOptionPane.showMessageDialog(this, IndieSongs);
    }//GEN-LAST:event_IndiePlaylistActionPerformed

    private void addToPlaylist(String songName, PlayListType currentPlaylistType) {
    switch (currentPlaylistType) {
        case INDIE:
            IndieSongs.push(songName);
            break;
        case OTACORE:
            OTAcoreSongs.push(songName);
            break;
    }
}
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
            java.util.logging.Logger.getLogger(JMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMusicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddIndie;
    private javax.swing.JButton AddOTAcore;
    private javax.swing.JButton DeleteIndie;
    private javax.swing.JButton DeleteOta;
    private javax.swing.JButton IndiePlaylist;
    private javax.swing.JButton LikedPlaylist;
    private javax.swing.JButton OtaCorePlaylist;
    private javax.swing.JButton SearchIndie;
    private javax.swing.JButton SearchOta;
    private javax.swing.JTextField SongInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
