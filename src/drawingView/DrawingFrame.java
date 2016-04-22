package drawingView;

import javax.swing.JFrame;

import drawingController.DrawingController;


public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		
		buildFrame();
	}
	
	private void buildFrame()
	{
		setContentPane(basePanel);
		setSize(800,800);
		setTitle("Drawing stuffs");
		setVisible(true);
	}
}
