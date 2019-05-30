import javax.swing.*;

public class TriInSq
{
	public TriInSq()
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
		
	}
	
	public static void main(String args[])
	{
		new TriInSq();
	}
}
