package classes;
import java.lang.*;
public class LocalProduct extends Product
{
	private double discountRate;

	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}


	public double getDiscountRate()
	{
		return discountRate;

	}


	public void showInfo()
	{
		System.out.println("Product id :"+getPid());
		System.out.println("Product Name : "+getName());
		System.out.println("Available Quantity : "+ getAvailableQuantity());
		System.out.println("Price : "+getPrice());
		System.out.println("Discount rate : "+discountRate);
	}
}