/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JMusiPlaylistpackage;
/**
 *
 * @author jamie
 */
public class JMusicApp {
    public static void main(String[] args){
        /*displays the GUI when this page is run*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMusicGUI().setVisible(true);
            }
        });
}
}

