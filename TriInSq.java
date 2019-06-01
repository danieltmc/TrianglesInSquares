import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.*;

public class TriInSq
{
	int white = (255 << 24) + (255 << 16) + (255 << 8) + 255;
	int black = 0;
	/*public TriInSq()
	{
		JFrame frame = new JFrame();
		String[] tri_options = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty-One", "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five", "Twenty-Six", "Twenty-Seven"};
		JComboBox tri_list = new JComboBox(tri_options);
		tri_list.setSelectedIndex(0);
		tri_list.addActionListener(this);
		
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JComboBox tri_list = (JComboBox) e.getSource();
		String selection = (String) tri_list.getSelectedItem();
		
	}*/
	
	public TriInSq()
	{
		System.out.println("Input the number of triangles to fit in a 12x12in square");
		Scanner input = new Scanner(System.in);
		int triangles = input.nextInt();
		BufferedImage output = createImage(triangles);
		
		try
		{
			File file = new File(System.getProperty("user.dir") + "/output.png");
			ImageIO.write(output, "png", file);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	
	public BufferedImage createImage(int num_triangles)
	{
		System.out.println("Length of the side of the square: s");
		// 1152 pixels = 12 inches. This creates a 12x12in image
		BufferedImage output = new BufferedImage(1152, 1152, BufferedImage.TYPE_INT_ARGB);
		int x_count = 0;
		int y_count = 0;
		if (num_triangles == 1)
		{
			System.out.println("Length of the side of the triangle: [sqrt(2) + sqrt(6)]/4 * s = 0.965*s");
			for (int x = 0; x < 1152; x++)
			{
				if (x % 3 == 0)
				{
					output.setRGB(x, y_count, white);
				}
				y_count++;
			}
		}
		return(output);
	}
	
	public static void main(String args[])
	{
		new TriInSq();
		//byte[] image_array = createImage(Integer.parseInt(args[0]));
	}
}
