package Seller;

public interface BookSellerGUIInterface {
    void setAgent(BookSellerAgent a);
	
    void show();
	
    void hide();
	
    void notifyUser(String message);
	
    void dispose();
}
