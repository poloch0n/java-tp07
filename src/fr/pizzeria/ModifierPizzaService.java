package fr.pizzeria;

import fr.pizzeria.FromMenu;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {
	void executeUc(PizzaMemDao dao) {
		
		showText("Mise � jour d�une pizza");
		if(dao.checkMenuEmpty()) {
			showText("Vous n'avez pas encore ajouter de pizza, prenez l'option 2");
			return;
		}
		
		showText("Veuillez choisir le code de la pizza � modifier");
		String code = FromMenu.getCode();
		//V�rification de l'existance de la pizza
		if(!dao.pizzaExists(code)) {
			showText("Le code saisi semble ne correspondre a aucune pizza, pouvez vous r�essayer ?\r\n");
			executeUc(dao);
			return;
		}
		Pizza updatedPizza = FromMenu.getInformationPizza();
		dao.updatePizza(code,updatedPizza);
			
	}
}
