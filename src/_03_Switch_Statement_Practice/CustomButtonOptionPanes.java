package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice){
		case "Sunday":
			System.out.println("League Day");
			break;
		case "Monday":
			System.out.println("ugg");
			break;
		case "Tuesday":
			System.out.println("dont say taco");
			break;
		case "Wednesday":
			System.out.println("Robo");
			break;
		case "Thursday":
			System.out.println("Were close now");
			break;
		case "Friday":
			System.out.println("And its over");
			break;
		case "Saterday":
			System.out.println("Relax time");
			break;
			
		}
	}
}
