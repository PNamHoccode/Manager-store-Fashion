/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Log;
import Com.Sport.UI.HomeStoreJFrame;
import javax.swing.JFrame;

public class NewClass {
    public static void main(String[] args) {
        openFull();
    }

    public static void openFull() {
        HomeStoreJFrame home = new HomeStoreJFrame();
        home.setExtendedState(JFrame.MAXIMIZED_BOTH);
        home.setVisible(true);
    }
}


