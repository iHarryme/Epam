package epam.training.sweets;

public class Kova implements Sweet
{
	String name;
	int cost;
	public Kova()
	{
		setCost(66);
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
