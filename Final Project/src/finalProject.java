import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class finalProject extends JFrame
		{
			static ArrayList<stats> finalProject1 = new ArrayList<stats>();
			static ArrayList<stats> finalProject2 = new ArrayList<stats>();

			static int character;
			static int location;
			static int enemy;
			static int weapon;
			static JFrame frame = new JFrame();
			public static void main(String[] args){


				{
					fillArray();
					characterCustomization();
					textAdventure();
					
				}
				}
	private static final long serialVersionUID = 1L;
						
					private static void characterCustomization()
							{
			Object[] options1 = {"wizard", "skeleton",};
			character = JOptionPane.showOptionDialog(frame, "Who would you like to play as?",
			"Your character",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options1, options1[1]);
			switch(character)
			{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "Your powerful spells do a lot of damage.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "Your lightweight bones allow you to run fast.");
					break;
					}
			}
			Object[] options2 = {"sword", "spear",};
			weapon = JOptionPane.showOptionDialog(frame, "What weapon do you want?",
			"Your character",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options2, options2[1]);
			switch(character)
			{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "Lightweight but it does not do much damage.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "Heavy but it does a lot of damage.");
					break;
					}
			}

							}
			
					private static void textAdventure()
			{
			Object[] options3 = {"Castle", "Forset", "Cave",};
			location = JOptionPane.showOptionDialog(frame, "Where do you want to go?",
			"Your location",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options3, options3[2]);
			switch(location)
			{
			case 0:
					{
					JOptionPane.showMessageDialog(frame, "You enter the castle.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "You enter the forest.");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(frame, "You enter the cave.");
					break;
					}
			}				
			JOptionPane.showMessageDialog(frame, "You're attacked by an ogre.");
					Object[] options4 = {"Run", "Attack",};
					enemy = JOptionPane.showOptionDialog(frame, "What do you do?",
					"Your ",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options4, options4[1]);
					switch(enemy)
					{
					case 0:
							{
							JOptionPane.showMessageDialog(frame, "You decide to run from the ogre.");
							System.out.println(character);
							System.out.println(finalProject1.get(character).getAttack());
							
							if (finalProject1.get(character).getAttack() + finalProject1.get(weapon).getSpeed() >= 150)
								{
									JOptionPane.showMessageDialog(frame, "You outran the ogre.");
								}
							else if (finalProject1.get(character).getAttack() + finalProject1.get(weapon).getSpeed() < 150)
								{
									JOptionPane.showMessageDialog(frame, "You were not fast enough to outrun the ogre.");
								}
							break;
							}
						case 1:
							{
							JOptionPane.showMessageDialog(frame, "You decide to fight the ogre.");
							if (finalProject1.get(character).getSpeed() + finalProject1.get(weapon).getSpeed() >= 150)
								{
									JOptionPane.showMessageDialog(frame, "You defeated the ogre.");
								}
							else if (finalProject1.get(character).getSpeed() + finalProject1.get(weapon).getSpeed() < 150)
								{
									JOptionPane.showMessageDialog(frame, "You were not strong enough to defeat the ogre.");
								}
							break;
							}
							
					}
			}

			

				
						private static void fillArray()
				{
							finalProject1.add(new stats("wizard", 100, 50));
							finalProject1.add(new stats("skeleton", 50, 100));
							finalProject2.add(new stats("sword", 50, 100));
							finalProject2.add(new stats("spear", 100, 50));
						

				}

						
		}

		

		
