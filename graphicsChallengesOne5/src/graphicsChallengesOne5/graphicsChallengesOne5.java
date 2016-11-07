package graphicsChallengesOne5;
import java.awt.*;
import javax.swing.*;
public class graphicsChallengesOne5 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        graphicsChallengesOne5 canvas = new graphicsChallengesOne5();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
	
	        graphics.setColor(Color.YELLOW);
	        graphics.fillOval(250,250,500,500);
	        
	        graphics.setColor(Color.black);
	        graphics.fillOval(360,350,100,100);
	       
	        graphics.setColor(Color.white);
	        graphics.fillOval(380,375,50,50);
	        
	        graphics.setColor(Color.black);
	        graphics.fillOval(550,350,100,100);
	        
	        graphics.setColor(Color.white);
	        graphics.fillOval(575,375,50,50);
	        
	        graphics.setColor(Color.black);
	        graphics.fillOval(375,475,250,250);
	        
    		}
    		
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
