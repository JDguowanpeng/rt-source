package javax.swing.plaf.nimbus;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

final class RadioButtonMenuItemPainter extends AbstractRegionPainter {
  static final int BACKGROUND_DISABLED = 1;
  
  static final int BACKGROUND_ENABLED = 2;
  
  static final int BACKGROUND_MOUSEOVER = 3;
  
  static final int BACKGROUND_SELECTED_MOUSEOVER = 4;
  
  static final int CHECKICON_DISABLED_SELECTED = 5;
  
  static final int CHECKICON_ENABLED_SELECTED = 6;
  
  static final int CHECKICON_SELECTED_MOUSEOVER = 7;
  
  static final int ICON_DISABLED = 8;
  
  static final int ICON_ENABLED = 9;
  
  static final int ICON_MOUSEOVER = 10;
  
  private int state;
  
  private AbstractRegionPainter.PaintContext ctx;
  
  private Path2D path = new Path2D.Float();
  
  private Rectangle2D rect = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
  
  private RoundRectangle2D roundRect = new RoundRectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
  
  private Ellipse2D ellipse = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
  
  private Color color1 = decodeColor("nimbusSelection", 0.0F, 0.0F, 0.0F, 0);
  
  private Color color2 = decodeColor("nimbusBlueGrey", 0.0F, -0.08983666F, -0.17647058F, 0);
  
  private Color color3 = decodeColor("nimbusBlueGrey", 0.055555582F, -0.09663743F, -0.4627451F, 0);
  
  private Color color4 = decodeColor("nimbusBlueGrey", 0.0F, -0.110526316F, 0.25490195F, 0);
  
  private Object[] componentColors;
  
  public RadioButtonMenuItemPainter(AbstractRegionPainter.PaintContext paramPaintContext, int paramInt) {
    this.state = paramInt;
    this.ctx = paramPaintContext;
  }
  
  protected void doPaint(Graphics2D paramGraphics2D, JComponent paramJComponent, int paramInt1, int paramInt2, Object[] paramArrayOfObject) {
    this.componentColors = paramArrayOfObject;
    switch (this.state) {
      case 3:
        paintBackgroundMouseOver(paramGraphics2D);
        break;
      case 4:
        paintBackgroundSelectedAndMouseOver(paramGraphics2D);
        break;
      case 5:
        paintcheckIconDisabledAndSelected(paramGraphics2D);
        break;
      case 6:
        paintcheckIconEnabledAndSelected(paramGraphics2D);
        break;
      case 7:
        paintcheckIconSelectedAndMouseOver(paramGraphics2D);
        break;
    } 
  }
  
  protected final AbstractRegionPainter.PaintContext getPaintContext() { return this.ctx; }
  
  private void paintBackgroundMouseOver(Graphics2D paramGraphics2D) {
    this.rect = decodeRect1();
    paramGraphics2D.setPaint(this.color1);
    paramGraphics2D.fill(this.rect);
  }
  
  private void paintBackgroundSelectedAndMouseOver(Graphics2D paramGraphics2D) {
    this.rect = decodeRect1();
    paramGraphics2D.setPaint(this.color1);
    paramGraphics2D.fill(this.rect);
  }
  
  private void paintcheckIconDisabledAndSelected(Graphics2D paramGraphics2D) {
    this.path = decodePath1();
    paramGraphics2D.setPaint(this.color2);
    paramGraphics2D.fill(this.path);
  }
  
  private void paintcheckIconEnabledAndSelected(Graphics2D paramGraphics2D) {
    this.path = decodePath2();
    paramGraphics2D.setPaint(this.color3);
    paramGraphics2D.fill(this.path);
  }
  
  private void paintcheckIconSelectedAndMouseOver(Graphics2D paramGraphics2D) {
    this.path = decodePath2();
    paramGraphics2D.setPaint(this.color4);
    paramGraphics2D.fill(this.path);
  }
  
  private Rectangle2D decodeRect1() {
    this.rect.setRect(decodeX(1.0F), decodeY(1.0F), (decodeX(2.0F) - decodeX(1.0F)), (decodeY(2.0F) - decodeY(1.0F)));
    return this.rect;
  }
  
  private Path2D decodePath1() {
    this.path.reset();
    this.path.moveTo(decodeX(0.0F), decodeY(2.097561F));
    this.path.lineTo(decodeX(0.90975606F), decodeY(0.20243903F));
    this.path.lineTo(decodeX(3.0F), decodeY(2.102439F));
    this.path.lineTo(decodeX(0.90731704F), decodeY(3.0F));
    this.path.lineTo(decodeX(0.0F), decodeY(2.097561F));
    this.path.closePath();
    return this.path;
  }
  
  private Path2D decodePath2() {
    this.path.reset();
    this.path.moveTo(decodeX(0.0024390244F), decodeY(2.097561F));
    this.path.lineTo(decodeX(0.90975606F), decodeY(0.20243903F));
    this.path.lineTo(decodeX(3.0F), decodeY(2.102439F));
    this.path.lineTo(decodeX(0.90731704F), decodeY(3.0F));
    this.path.lineTo(decodeX(0.0024390244F), decodeY(2.097561F));
    this.path.closePath();
    return this.path;
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\javax\swing\plaf\nimbus\RadioButtonMenuItemPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */