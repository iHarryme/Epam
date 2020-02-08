package epam.training.sweets;

public class Jamun implements Sweet
{
	String name;
	int cost;
	public Jamun()
	{
		setCost(20);
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
