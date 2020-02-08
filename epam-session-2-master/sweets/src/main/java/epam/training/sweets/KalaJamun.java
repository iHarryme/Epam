package epam.training.sweets;

public class KalaJamun implements Sweet
{
	String name;
	int cost;
	public KalaJamun()
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
