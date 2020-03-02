package Cart;

import java.text.NumberFormat;
public class ItemOrder
{
	
	private int qty;
	private Item itm;
	public ItemOrder(Item itm,int qty)
	{
		this.itm=itm;
		this.setqty(qty);
	}
	public int getqty() 
     {
		return qty;
	}
	public void setqty(int qty)
     {
		this.qty = qty;
	}
	public double getiOrderPrice()
	{
		double iOrderPrice=0;
		if(qty%2==0)
		{
			for(int i=0;i<qty/2;i++)
			iOrderPrice+=4.0;		
			return iOrderPrice;
		}
		else
		{
			for(int index=0;index<qty/2;index++)
			iOrderPrice+=4.0;
			
			return iOrderPrice+itm.getcost();	
		}
	}
}