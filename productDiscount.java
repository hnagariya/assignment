package assignment;

public class productDiscount {
float actualPriceOfProduct;
float priceAfter1stDiscount;
float priceAfterPromo5;
float priceAfterPromo10;
float priceAfterPromo20;
boolean Promo5;
boolean Promo10;
boolean Promo20;
void discountApplied() {
	System.out.println("Actual price "+actualPriceOfProduct);
	priceAfter1stDiscount = actualPriceOfProduct * 0.5f;
	System.out.println("price after 50% "+priceAfter1stDiscount);
	
	if (Promo5==true) {
	priceAfterPromo5 = priceAfter1stDiscount * 0.05f;
		System.out.println(priceAfterPromo5);
	}
	else if(Promo10==true) {
	priceAfterPromo10 = priceAfter1stDiscount * 0.9f;
	System.out.println(priceAfterPromo10);
	}
	else if(Promo20==true) {
	 priceAfterPromo20 = priceAfter1stDiscount * 0.8f;
	 System.out.println(priceAfterPromo20);
	}
	else{
		System.out.println(priceAfter1stDiscount);
	}
}
}
