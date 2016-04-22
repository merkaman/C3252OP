
public class Gawkatrice extends Enemy{

		public Gawkatrice(String name, int ehealth) {
			super(name, ehealth);
			setDescription("A dull-witted Cockatrice. It can turn you to stone with a mere touch!\n If only someone told it that...");
		}
		
		@Override
		public int fight()
		{
			int dmg = 0;
			dmg = m * (10 + random.nextInt(15) + a);
			return dmg;
		}
		
		@Override
		public String atkdesc()
		{
			int n;
			n = 1 + random.nextInt(4);
			
			switch(n)
			{
			case 1:
				m = 0;
				a = 10;
			return "The Gawkatrice just sits there and stares... vapidly.";
			case 2:
				m = 1;
				a = 20;
			return "The Gawkatrice stumbles around and bumps its toe on you!";
			case 3:
				m = 1;
				a = 18;
			return "The Gawkatrice dribbles toxic spittle!";
			default:
				m = 2;
				a = 1;
			return "The Gawkatrice screams insipid chatter!";
			}
		}
		
		@Override
		public String toString()
		{
		return "\nThe enemy is " + getName() + ", " + getDescription() + "\nIts health is: " + getEHealth();
		}

	}