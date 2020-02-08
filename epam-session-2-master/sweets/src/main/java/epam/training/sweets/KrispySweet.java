package epam.training.sweets;

public class KrispySweet implements Sweet
{
	String name;
	int cost;
	public KrispySweet()
	{
		setCost(150);
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
