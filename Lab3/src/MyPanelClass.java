import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                      //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                      //Draw a second border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x2, y1, x1, y2);
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1+10, y1 + 10, x2 - 20, 2*y2/9);
                        g.fillRect(x1+10, 5*y2/12, x2 - 20, y2/6);
                        g.fillRect(x1+10, 9*y2/12, x2 - 20, y2/6);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, 7*y2/12, x2 - 20, y2/6);
                        g.fillRect(x1+10, 5*y2/24, x2 - 20, 5*y2/24);
                        
                        g.setColor(Color.BLUE);
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 10, y1 + 10);
                        p3.addPoint(x1 + 10, 9*y2/12 + y2/6);
                        p3.addPoint(x2/2, y2/2);
                        g.fillPolygon(p3);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 119*x2/1000, y1 + 406*y2/1000);
                        p2.addPoint(x1 + 195*x2/1000, y1 + 406*y2/1000);
                        p2.addPoint(x1 + 224*x2/1000, y1 + 322*y2/1000);
                        p2.addPoint(x1 + 252*x2/1000, y1 + 406*y2/1000);
                        p2.addPoint(x1 + 329*x2/1000, y1 + 406*y2/1000);
                        p2.addPoint(x1 + 267*x2/1000, y1 + 461*y2/1000);
                        p2.addPoint(x1 + 290*x2/1000, y1 + 544*y2/1000);
                        p2.addPoint(x1 + 224*x2/1000, y1 + 489*y2/1000);
                        p2.addPoint(x1 + 162*x2/1000, y1 + 544*y2/1000);
                        p2.addPoint(x1 + 181*x2/1000, y1 + 461*y2/1000);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}
