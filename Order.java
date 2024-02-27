public class Order {
	
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	
	public Order() {
		this.status = "Ordered";
	}
	
	public Order(int orderId, Food[] orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
//	public static int getTotalNoOfOrders() {
//		return Order.orderIdCounter-100;
//	}
	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
    
    //other methods
	
	public double calculateTotalPrice(String paymentMode) {
		double foodPrice = 0;
		double finalPrice = 0;
		float serviceCharge = 0f;
		for (Food food : orderedFoods) {
			foodPrice+=food.getUnitPrice()*1;
		}
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card")) {
			serviceCharge = 2.0f;
		}
		else if (paymentMode.equals("PayPal")) {
			serviceCharge = 2.9f;
		}
		finalPrice = foodPrice+foodPrice*(serviceCharge/100);
//		this.setTotalPrice(finalPrice);
		return finalPrice;
	}
}
