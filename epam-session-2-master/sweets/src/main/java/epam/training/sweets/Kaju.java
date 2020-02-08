package epam.training.sweets;

public class Kaju implements Sweet
{
	String name;
	int cost;
	public Kaju()
	{
		setCost(30);
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
