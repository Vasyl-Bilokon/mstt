package Buyer;

public interface BookBuyerGUIInterface {
    void setAgent(BookBuyerAgent a);
    
	void show();
    
	void hide();
    
	void notifyUser(String message);
	
    void dispose();
}
