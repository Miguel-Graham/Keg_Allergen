package application;

import java.util.HashMap;
import java.util.Map;

public class Dish {
	
    private String name;
    private Map<Allergies, String> allergyList;

  public Dish(String name) {
	 this.name = name;
	 allergyList = new HashMap<Allergies, String>();
}
  
  public String getname() {
	return this.name;
}
  
  public void setName(String name) {
	  this.name = name;
  }
  public String getAllergy(Allergies allergy){
	  String resultString = allergyList.get(allergy); 
	  if(resultString != null) {
		  return resultString;
	  }
	  else {
		return "No Allergens Found";
	}
  }
  
  public void addAllergy(Allergies name, String description) {
	allergyList.put(name, description);
}
    
}
