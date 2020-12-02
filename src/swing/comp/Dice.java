package swing.comp;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dice extends JPanel {

        private static final long serialVersionUID = 1L;

        public int num;
        
        static ImageIcon[] images;        
        static {
              try {
                    images = new ImageIcon[] { 
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\1�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\2�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\3�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\4�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\5�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH)),
                            new ImageIcon(ImageIO.read(new File("D:\\10�� �ڹ� sw������ �缺���� ������\\6�ֻ���.jpeg"))
                                            .getScaledInstance(100, 100, Image.SCALE_SMOOTH))
                       };
                                        
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
        
        public Dice() {
                super(new CardLayout());
                setBackground(Color.black);
                
                for (int i = 0; i < 6; ++i) {
                        add(Integer.toString(i), new JLabel(images[i]));
                }                
                
                num = 0;
        }

        public void roll() {
                ((CardLayout) this.getLayout())
                        .show(this, Integer.toString(num = (int)(Math.random() * 6)));
        }        
}















