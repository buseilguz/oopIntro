package oopIntro;

public class Product {
	public Product()//constructor blogu
	{
		System.out.println("Ben çalýþtým");
	}
	public Product(int id,String name,double unitPrice,String detail)
	{	this();//Ustteki constructor calistirmak icin
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	

}
