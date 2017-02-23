public class Advance extends Ticket_Superclass
{
    private int daysLeft;

    public Advance(int daysLeft) 
	{
        this.daysLeft = daysLeft;
    }

    public int getPrice()
	{
       
	   if (daysLeft >= 10)
		{
            return 30;
        } 
		
		else 
		{
            return 40;
        }
    }
}