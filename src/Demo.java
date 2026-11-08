// drive executer class 
import javax.swing.SwingUtilities;

public class Demo{
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> {
			Modelo model = new Modelo();
			Vista view = new Vista();
			Controlador controller = new Controlador(model,view);
			
			view.setVisible(true);
			view.updateCount(model.getCount());
		});
	}
}
