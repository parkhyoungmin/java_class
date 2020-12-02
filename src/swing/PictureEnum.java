
package swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum PictureEnum {
	APPLE("apple", "assets/image/apple.jpeg"),
	BANANA("banana", "assets/image/banana.jpg"),
	PENGUIN("Æë±Ï", "assets/image/penguin.jpg");
	
	String kName;
	String img_path;
	Image image;
		
	PictureEnum(String kName, String img_path) {
		this.kName = kName;
		this.img_path = img_path;
		try {
			this.image = ImageIO.read(new File(img_path));			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
