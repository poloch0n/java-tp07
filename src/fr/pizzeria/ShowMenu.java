package fr.pizzeria;

public class ShowMenu {

	public ShowMenu() {
		
	}

	public static void showIntroduction() {
		showText("***** Pizzeria Administration v4 (with List) *****");
	}
	
	public static void showMenuOptions() {
		showText("1. Lister les pizzas \r\n2. Ajouter une nouvelle pizza \r\n3. Mettre � jour une pizza \r\n4. Supprimer une pizza \r\n99. Sortir");
	}	
	
	public static void showText(String texte) {
		System.out.println(texte);
	}
}
