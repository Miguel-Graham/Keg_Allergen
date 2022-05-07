package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class AllergenController implements Initializable {
	 Menu kegMenu = new Menu();
	
    @FXML
    private ComboBox<String> allergyCombo;
    
    @FXML
    private Button clrbutn;

    @FXML
    private Button checkButn;

    @FXML
    private CheckBox dinnerCheck;

    @FXML
    private ComboBox<String> dishCombo;

    @FXML
    private ComboBox<String> itemCombo;

    @FXML
    private CheckBox kidsCheck;

    @FXML
    private CheckBox lunchCheck;

    @FXML
    private TextArea resultArea;
   
    
    private String[] appetizers = {"Escargot", "Baked Garlic Shrimp","Shrimp Cocktail", "Calamari", "Neptune"}; 
    private String[] items = {"Appetizer", "Seafood", "Accompaniments", "Sauces", "Keg Classics"};
    private String[] Seafood = {"Pistachio Salmon", "Lin Cod", "Lobster Tail"};
    private String[] accomp = {"Baked Potato(Plain)", "Butter", "Sour Cream", "Bacon Bits", "3 Cheese", "Twice Baked", "Garlic Mashed"
    		, "Mushroom Rice", "French Fries", "Frites", "Fresh Veges", "Gnocci Medley", "Cauli Mashed"};
    private String[] sauces = {"Bernaise", "Chive Butter", "W. Peppercorn"};
    private String[] classics = {"Top Sirloin", "Teriyaki Sirloin", "Filet", "Baseball", "New York", "Prime Rib"};
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		resultArea.setEditable(false);
		itemCombo.getItems().addAll(items);
		itemCombo.setValue("Select Item");
		for(Allergies allergies : Allergies.values()) {
			allergyCombo.getItems().add(allergies.getAllergyName());
		}
		allergyCombo.setValue("Allergy");
		
	}
	  @FXML
	  private void setDish() {

		  String state = itemCombo.getValue();
		  switch(state) {
		  case "Appetizer":
			  dishCombo.getItems().clear();
			  dishCombo.setValue("Escargot");
			  dishCombo.getItems().addAll(appetizers);
			  break;
		  case "Seafood":
			  dishCombo.getItems().clear();
			  dishCombo.setValue("Pistachio Salmon");
			  dishCombo.getItems().addAll(Seafood);
			  break;
		  case "Accompaniments":
			  dishCombo.getItems().clear();
			  dishCombo.setValue("Baked Potato(Plain) ");
			  dishCombo.getItems().addAll(accomp);
			  break;
		  case "Sauces":
			  dishCombo.getItems().clear();
			  dishCombo.setValue("Bernaise");
			  dishCombo.getItems().addAll(sauces);
			  break;
		  case "Keg Classics":
			  dishCombo.getItems().clear();
			  dishCombo.setValue("Top Sirloin");
			  dishCombo.getItems().addAll(classics);
			  break;
		  }
		  
	    }
	  @FXML
	  private void checkAllergy() {
		  resultArea.setWrapText(true);
		  ArrayList<Dish> tempArrayList = new ArrayList<>();
		  String selectedAllergy = allergyCombo.getValue().toUpperCase();
		  String selectedItem = itemCombo.getValue();
		  String selectedDish = dishCombo.getValue();
 		  Allergies a = Allergies.valueOf(selectedAllergy);
		  
		  
		  switch (selectedItem) {
		       case "Appetizer":
			       kegMenu.popAppetizer();
			       tempArrayList = kegMenu.appetizer;
			       allergyOut(tempArrayList, a, selectedDish);
			       break;
		       case "Seafood":
		    	   kegMenu.popSeafood();
		    	   tempArrayList =kegMenu.seafood;
		    	   allergyOut(tempArrayList, a, selectedDish);
		  } 
	  }
	  
	  private void allergyOut(ArrayList<Dish> tempArrayList, Allergies allergy, String selectedDish) {
		  for(Dish dish: tempArrayList) {
				 if(dish.getname().equals(selectedDish)) {
					resultArea.appendText("(" + selectedDish.toString()+") "+ dish.getAllergy(allergy));
					resultArea.appendText("\n");
					break;
				 }
	  }
	  }
	  @FXML
	  private void clear() {
		  resultArea.clear();
		
	}
	  @FXML 
	  private void setAllergy() {
		  resultArea.appendText(allergyCombo.getValue().toUpperCase());
		  resultArea.appendText("\n");
		  
	  }

}
  

