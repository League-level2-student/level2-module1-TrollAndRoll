package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) 
	{
		GuestBook book = new GuestBook();
		book.run();
	}
	
	List<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addB = new JButton();
	JButton viewB = new JButton();
	
	private void run()
	{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	addB.setText("Add Name");
	viewB.setText("View names");
	addB.addActionListener(this);
	viewB.addActionListener(this);
	panel.add(addB);
	panel.add(viewB);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. 
		if(buttonPressed == addB)
		{
			String newName = JOptionPane.showInputDialog("Enter a name plz.");
			names.add(newName);
		}
		//When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
		if(buttonPressed == viewB)
		{
			for(int i = 0; i < names.size(); i++) 
			{
			String s = names.get(i);
			System.out.println("Guest #" + (i+1) + ": " + s);
			}
		}
	}
}
