package drawingView;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public void addRectangle()
	{
		
	}
	
	public void addSquare()
	{
		
	}
	
	public void addEllipse()
	{
		
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
	}
}
