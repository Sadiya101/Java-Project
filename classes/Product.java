package classes;
import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
 {
 	protected String pid;
    protected String name;
    protected int availableQuantity;
    protected double price;



    public void setPid(String pid)
    {
    	this.pid=pid;
    }

    public void setName(String name)
    {
    	this.name=name;
    }
    public void setAvailableQuantity(int quantity)
    {
    	this.availableQuantity=quantity;
    }
    public void setPrice(double price)
    {
    	this.price=price;
    }



    public String getPid()
    {
    	return pid;
    }
    public String getName()
    {
    	return name;
    }
    public int getAvailableQuantity()
    {
    	return availableQuantity;
    }
    public double getPrice()
    {
    	return price;
    }
    public abstract void showInfo();


    public boolean addQuantity(int amount)
    {
    	if(amount>0)
		{
			System.out.println("Available Quantity: "+availableQuantity);
			System.out.println("Add Quantity: "+amount);
			availableQuantity= availableQuantity + amount;
			System.out.println("New Quantity: "+availableQuantity);
			System.out.print("Add quantity status : ");
			return true;
		}
		else
		{
			System.out.print("Add quantity status : ");
			return false;
		}
    }

    public boolean sellQuantity(int amount)
    {

    	if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Available Quantity: "+availableQuantity);
			System.out.println("Sell Quantity: "+amount);
			availableQuantity= availableQuantity - amount;
			System.out.println("New Quantity: "+availableQuantity);
			System.out.print("Selling quantity status : ");
			return true;
		}
		else
		{
			System.out.print("Selling quantity status : ");
			return false;
		}
	}

}