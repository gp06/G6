package main;

import javax.swing.JFrame;

public class JTabbedPaneDemo
{
   public static void main( String[] args )
   { 
      JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();  
      tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      tabbedPaneFrame.setSize( 1280, 1080 ); // set frame size
      tabbedPaneFrame.setVisible( true ); // display frame
      
   } // end main
}
