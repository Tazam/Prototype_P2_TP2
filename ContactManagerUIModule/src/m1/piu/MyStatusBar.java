/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author Tazam
 */
public final class MyStatusBar extends JLabel{
    /** Creates a new instance of StatusBar */
    public MyStatusBar() {
        super();
        //super.setPreferredSize(new Dimension(100, 16));
        setMessage("Ready to work");
    }
    
    public void setMessage(String message) {
        setText(" "+message);        
    }
}
