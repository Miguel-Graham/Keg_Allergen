package application;

public enum Allergies {
CORN("Corn"), EGGS("Eggs"), GLUTEN("Gluten"), ANIMALFATS_OILS("AnimalFats_Oils"), DAIRY_LACTOSE("Dairy_Lactose"), GARLIC("Garlic"), MSG("MSG"), SEAFOOD("Seafood"),
SOY("Soy"), NUTS("Nuts"), SULFITES("Sulfites"), TARZANINIE("Tarzanine"), FISH("Fish") ;




  Allergies(String allergyName){
	this.allergyName = allergyName;
}
  private final String allergyName;
  
  public String getAllergyName() {
	return allergyName;
}
   
}
