public class Restaurant {
	private String restuarnatName;
	private long[] restaurantContacts;
	private String restaurantAddress;
	private float rating;
	
	public Restaurant(String name, long[] restaurantContacts, String restaurantAddress, float rating) {
	this.restuarnatName = name;
	this.restaurantContacts = restaurantContacts;
	this.restaurantAddress = restaurantAddress;
	this.rating = rating;
	}
	
	public String getRestuarnatName() {
		return restuarnatName;
	}
	public void setRestuarnatName(String restuarnatName) {
		this.restuarnatName = restuarnatName;
	}
	public long[] getRestaurantContact() {
		return restaurantContacts;
	}
	public void setRestaurantContact(long[] restaurantContacts) {
		this.restaurantContacts = restaurantContacts;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void displayRestaurantDetails() {
	System.out.println("Displaying restaurant details \n***************");
	System.out.println("Restaurant Name : "+this.restuarnatName);
	System.out.println("Restaurant Rating : "+this.rating);
	System.out.println("Restaurant Contacts:");
	for (int index = 0; index < this.restaurantContacts.length; index++)
		System.out.println(this.restaurantContacts[index]);
	System.out.println("Restaurant Address : "+this.restaurantAddress);
	System.out.println();
	}
}
// class Tester {
// 	public static void main(String[] args) {
// 		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
// 		Restaurant restaurant1 = new Restaurant("SwiftFood",
// 				restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
// 		restaurant1.displayRestaurantDetails();
// 	}
// }
