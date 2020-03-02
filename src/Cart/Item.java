package Cart;

public class Item 
{

	private String iName;
	private double cost;

	public Item(String iName, double cost) 
	{

		setItem(iName, cost);
	}

	public void setItem(String iName, double cost) 
	{
		this.setiName(iName);
		this.setcost(cost);
	}

	public String getiName() 
	{
		return iName;
	}

	public void setiName(String iName)
	{
		this.iName = iName;
	}

	public double getcost() 
	{
		return cost;
	}

	public void setcost(double cost) 
	{
		this.cost = cost;
	}

}
