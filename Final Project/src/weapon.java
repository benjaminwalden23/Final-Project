
public class weapon
	{
		String weapon;
		int attack;
		int speed;
		public weapon(String w, int a, int s)
			{
				weapon = w;
				attack = a;
				speed = s;
	}
		public String getWeapon()
			{
				return weapon;
			}
		public void setWeapon(String enemy)
			{
				this.weapon = weapon;
			}
		public int getAttack()
			{
				return attack;
			}
		public void setAttack(int attack)
			{
				this.attack = attack;
			}
		public int getSpeed()
			{
				return speed;
			}
		public void setSpeed(int speed)
			{
				this.speed = speed;
			}

	}
