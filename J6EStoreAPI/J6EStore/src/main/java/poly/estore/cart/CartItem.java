package poly.estore.cart;

import lombok.Data;
import lombok.NoArgsConstructor;
import poly.estore.entity.Product;

@NoArgsConstructor
@Data
public class CartItem {
	Integer id;
	String name;
	double price;
	int quantity = 1;
	public double getAmount() {
		return quantity*price;
	}
	public CartItem(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.price = product.getPrice();
	}
}
