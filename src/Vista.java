// vista (es la parte grafica)
 
import javax.swing.*;
import java.awt.event.ActionListener;
 
public class Vista extends JFrame {
    
	private JLabel countLabel;
	private JButton incrementButton;
	private JButton decrementButton; 
	
        public Vista(){
		setTitle("MVC Controller");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		countLabel = new JLabel("Count ",SwingConstants.CENTER);
		incrementButton = new JButton("increment");
		decrementButton = new JButton("decrement");
		JPanel panel = new JPanel();
		panel.add(countLabel);
		panel.add(incrementButton);
		panel.add(decrementButton);
		add(panel);
	}
        
	public void updateCount(int newCount){
		countLabel.setText("Count: "+newCount);
	}
        
	public void addIncrementListener(ActionListener listener){
		incrementButton.addActionListener(listener);
	}
        
	public void addDecrementListener(ActionListener listener){
		decrementButton.addActionListener(listener);
	}
        
}