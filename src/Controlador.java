// clase controlador 
 
// controller (la parte logica del software)
 
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
 
public class Controlador{

	private Modelo model;
	private Vista view;

	public Controlador(Modelo model, Vista view){
		this.model = model;
		this.view = view;
                this.view.addIncrementListener(new IncrementListener());
                this.view.addDecrementListener(new DecrementListener()); 
	} 

	class IncrementListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			model.increment();
			view.updateCount(model.getCount());
		}

	}

	class DecrementListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			model.decrement();
			view.updateCount(model.getCount());
		}
	}
}
 