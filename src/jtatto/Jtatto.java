/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jtatto;

import com.jtattoo.plaf.AbstractBorderFactory;
import com.jtattoo.plaf.AbstractIconFactory;
import com.jtattoo.plaf.AbstractLookAndFeel;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author aerdy
 */
public class Jtatto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException{
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new AbstractLookAndFeel() {
                
              
                @Override
                public AbstractBorderFactory getBorderFactory() {
                    throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public AbstractIconFactory getIconFactory() {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            }); 
        } catch (Exception e) {
        }
    }
}
