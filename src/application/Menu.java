package application;

import java.util.ArrayList;

public class Menu {
	//private final Allergies allergy = null;
	public ArrayList<Dish> appetizer;
	public ArrayList<Dish> salad;
	public ArrayList<Dish> vegetarian;
	public ArrayList<Dish> steakAndPrime;
	public ArrayList<Dish> steakAndSeafood;
	public ArrayList<Dish> addons;
	public ArrayList<Dish> sauces;
	public ArrayList<Dish> kegClassics;
	public ArrayList<Dish> seafood;
	public ArrayList<Dish> chickRibsBurger;
	public ArrayList<Dish> accompaniments;
	public ArrayList<Dish> lunchStarters;
	public ArrayList<Dish> lunchSalads;
	public ArrayList<Dish> lunchSandwich;
	public ArrayList<Dish> lunchCasualPlates;
	

	
	public  void popSalad() {
	
		salad = new ArrayList<>();
		Dish caesar = new Dish("Caesar");
		salad.add(caesar);
		
		Dish mixedGreens = new Dish("Mixed Greens");
		salad.add(mixedGreens);
		
		Dish wedge = new Dish("Wedge Salad");
		salad.add(wedge);
		
	}
	public void popSeafood() {
		seafood = new ArrayList<>();
	}

	public void popAppetizer() {
		appetizer = new ArrayList<>();
		Dish escargot = new Dish("Escargot");
		escargot.addAllergy(Allergies.CORN, "Mushroom Broth");
		escargot.addAllergy(Allergies.DAIRY_LACTOSE, "Escargot Butter, Mushroom Broth(Euro Butter), Dipper Bun");
		escargot.addAllergy(Allergies.EGGS, "Escargot Butter, Dipper Bun");
		escargot.addAllergy(Allergies.ANIMALFATS_OILS, "Mushroom Broth(Beef Base), Dipper Bun");
		escargot.addAllergy(Allergies.FISH, "Escargot Butter");
		escargot.addAllergy(Allergies.GARLIC,"Mushroom Broth(Beef and veg Base)");
		escargot.addAllergy(Allergies.NUTS, "Dipper Bun");
		escargot.addAllergy(Allergies.SEAFOOD, "Escargot Butter, Escargot");
		escargot.addAllergy(Allergies.SOY, "Escargot Butter, Mushroom Broth(Euro Butter, Beef and Veg Base)");
		escargot.addAllergy(Allergies.SULFITES, "Mushroom Broth(Sauterne, Beef Broth)");
		escargot.addAllergy(Allergies.TARZANINIE, "Escargot Butter");
		escargot.addAllergy(Allergies.GLUTEN, "Dipper Bun");
		appetizer.add(escargot);
		
		Dish neptune = new Dish("Neptune");
		neptune.addAllergy(Allergies.CORN, "Mushroom Broth(Beef and veg Base");
		neptune.addAllergy(Allergies.DAIRY_LACTOSE, "Neptune Mix");
		neptune.addAllergy(Allergies.EGGS, "Dipper Bun");
		neptune.addAllergy(Allergies.ANIMALFATS_OILS, "Mushroom Broth(Beef Base), Dipper Bun");
		neptune.addAllergy(Allergies.FISH, "Neptune Mix(Worcestershire sauce)");
		neptune.addAllergy(Allergies.GARLIC, "Neptine Mix, Mushroom Broth(Beef and vege Base)");
		neptune.addAllergy(Allergies.NUTS, "Dipper Bun");
		neptune.addAllergy(Allergies.SEAFOOD, "Neptune Mix(Crab Meat, Worcestershire sauce)");
		neptune.addAllergy(Allergies.SOY, "Mushroom Broth");
		neptune.addAllergy(Allergies.SULFITES, "Mushroom Broth");
		neptune.addAllergy(Allergies.GLUTEN, "Dipper BunS");
		appetizer.add(neptune);
		
		Dish shrimpCocktail = new Dish("Shrimp Cocktail");
		shrimpCocktail.addAllergy(Allergies.EGGS, "Martini Cocktail sauce(May Contain)");
		shrimpCocktail.addAllergy(Allergies.FISH, "Martini Cocktail Sauce(May Contain)");
		shrimpCocktail.addAllergy(Allergies.SEAFOOD, "Shrimp, Martini Cocktail Sauce(May Contain)");
		shrimpCocktail.addAllergy(Allergies.SOY, "Martini Cocktail Sauce(May Contain)");
		shrimpCocktail.addAllergy(Allergies.SULFITES, "Martini Cocktail Sauce(May Contain)");
		appetizer.add(shrimpCocktail);
		
		Dish garlicShrimp = new Dish("Baked Garlic Shrimp");
		garlicShrimp.addAllergy(Allergies.CORN, "Bread Crumbs(May Contain)");
		garlicShrimp.addAllergy(Allergies.DAIRY_LACTOSE, "Montery Jack, Cheddar, Dipper Bun, Bread Crumbs(May Contain)");
		garlicShrimp.addAllergy(Allergies.EGGS, "Dipper Bun");
		garlicShrimp.addAllergy(Allergies.ANIMALFATS_OILS, "Dipper Bun");
		garlicShrimp.addAllergy(Allergies.FISH, "Garlic Butter");
		garlicShrimp.addAllergy(Allergies.GARLIC, "Garlic Butter");
		garlicShrimp.addAllergy(Allergies.NUTS, "Dipper Bun");
		garlicShrimp.addAllergy(Allergies.SEAFOOD, "Garlic Butter, Shrimp");
		garlicShrimp.addAllergy(Allergies.SOY, "Garlic Butter");
		garlicShrimp.addAllergy(Allergies.GLUTEN, "Bread Crumbs, Dipper Bun");
		appetizer.add(garlicShrimp);
		
		Dish scalBacon = new Dish("Scallops and Bacon");
		scalBacon.addAllergy(Allergies.EGGS, "Martini Cocktail Sauce(May Contain)");
		scalBacon.addAllergy(Allergies.ANIMALFATS_OILS, "Applewood Smoked Bacon");
		scalBacon.addAllergy(Allergies.FISH, "Martini Coctail Sauce(May Contain), Scallops(May Contain)");
		scalBacon.addAllergy(Allergies.SEAFOOD, "Scallops, Martini Coctail Sauce(May Contain)");
		scalBacon.addAllergy(Allergies.SOY, "Martini Coctail Sauce(May Contain)");
		scalBacon.addAllergy(Allergies.SULFITES, "Martini Coctail Sauce(May Contain)");
		appetizer.add(scalBacon);
		
		Dish bakedBrie = new Dish("Baked Brie");
		appetizer.add(bakedBrie);
	
		Dish calamari = new Dish("Calamari");
		appetizer.add(calamari);
		
		Dish tunaTare = new Dish("Tuna Tare Tare");
		appetizer.add(tunaTare);
		
		Dish freidCauliflower = new Dish("Fried Cauliflower");
		appetizer.add(freidCauliflower);
		
		Dish fenchOnion = new Dish("French Onion");
		appetizer.add(fenchOnion);
		
		Dish cheeseToast = new Dish("Garlic Cheese Toast");
		appetizer.add(cheeseToast);
		
		
	}
	

}
