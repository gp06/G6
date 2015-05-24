package blacksmith.smithing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SmithingPanel extends JPanel{
    private JPanel smithingPanel;
    private JPanel personalPanel;
    private JLabel leftPanel;
    private JLabel name;
    private JLabel level;
    private JLabel reputation;
    private JLabel skilled;
    private JLabel money;
    
    private TextArea text;
    
    public SmithingPanel() {
        super();
        this.setLayout(new BorderLayout());
        smithingPanel = new JPanel();
        smithingPanel.setBounds(0, 0, 1280, 1080);
        
        
        
        personalPanel = new JPanel(new GridLayout(5,1));  
        personalPanel.setLocation(100, 100);
        personalPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        personalPanel.setBorder(BorderFactory.createEmptyBorder(10,10,20,10));       
        name = new JLabel("名字");      
        personalPanel.add(name);
        level = new JLabel("段位");        
        personalPanel.add(level);
        reputation = new JLabel("聲望值");        
        personalPanel.add(reputation);
        skilled = new JLabel("熟練度");        
        personalPanel.add(skilled);
        money = new JLabel("所持金");        
        personalPanel.add(money);
        smithingPanel.add(personalPanel , BorderLayout.WEST);
        
    
//        Icon Pic = new ImageIcon( getClass().getResource( "blacksmith.jpg" ) );
//        leftPanel = new JLabel (Pic);
//        smithingPanel.add(leftPanel, BorderLayout.EAST);
        
        String s = "This is test sample"; 
        text = new TextArea(s, 10, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
        smithingPanel.add(text , BorderLayout.SOUTH);
        this.add(smithingPanel,BorderLayout.WEST);
    }
}
