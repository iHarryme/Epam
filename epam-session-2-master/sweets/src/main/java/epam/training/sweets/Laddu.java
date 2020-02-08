package epam.training.sweets;

public class Laddu implements Sweet
{
	String name;
	int cost;
	public Laddu()
	{
		setCost(15);
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
}
