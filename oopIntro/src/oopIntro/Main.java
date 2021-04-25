package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"LEnovo v14",15000,"16 gb ram");
		
		
		Product product2=new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="32 gb ram";
		Product product3=new Product();
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice=10000;
		product3.detail="8 gb ram";
		
		
		
	Product[] products= {product1,product2,product3};
	System.out.println(products.length);
	
	for (Product product : products) {
		System.out.println(product.name);
	}
	
	Category category1= new Category();
	category1.name="Bilgisayar";
	category1.id= 1;
	Category category2= new Category();
	category2.name="Ev/Bahçe";
	category2.id= 2;
	ProductManager productManager=new ProductManager();
	productManager.addToCart(product1);
	productManager.addToCart(product2);
	productManager.addToCart(product3);
}
}