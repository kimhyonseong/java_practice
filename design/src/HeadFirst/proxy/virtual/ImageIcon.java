package HeadFirst.proxy.virtual;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon{
  public ImageIcon(URL imageURL, String album_cover) {

  }

  @Override
  public int getIconWidth() {
    return 0;
  }

  @Override
  public int getIconHeight() {
    return 0;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {

  }
}
