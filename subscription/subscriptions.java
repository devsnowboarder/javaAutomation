package subscription;

import VantiqTest.utility;
import buttonsObject.buttonsObject;
import textFieldObject.textFieldObject;


public class subscriptions extends utility {
	
	buttonsObject buttonItem =  new buttonsObject();
	textFieldObject textFieldItem = new textFieldObject();
	
	public void createNewsubscriptions() throws InterruptedException {
		
		 buttonItem.newSubscriptions();
		 Thread.sleep(1000);
		 textFieldItem.subscriptionNameTextField("Joe Montana");
		 
	}
	
	
	
	

}
