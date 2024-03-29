package HeadFirst.proxy.virtual;

//import javax.swing.Icon;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
  volatile ImageIcon imageIcon;
  final URL imageURL;
  Thread retrievalThread;
  boolean retrieving = false;

  public ImageProxy(URL url) {
    imageURL = url;
  }

  @Override
  public int getIconWidth() {
    if (imageIcon != null) {
      return imageIcon.getIconWidth();
    } else {
      return 800;
    }
  }

  @Override
  public int getIconHeight() {
    if (imageIcon != null) {
      return imageIcon.getIconHeight();
    } else {
      return 600;
    }
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    if (imageIcon != null) {
      imageIcon.paintIcon(c, g, x, y);
    } else {
      g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려주세요.", x+300, y+190);

      if (!retrieving) {
        retrieving = true;

        retrievalThread = new Thread(() -> {
          try {
            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
            c.repaint();
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
        retrievalThread.start();
      }
    }
  }

  void setImageIcon(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }
}
