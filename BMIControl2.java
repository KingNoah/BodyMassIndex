/**
 * This program calculates body mass index.
 * 
 * @author Noah King
 *
 */

import java.text.*;

import javax.swing.*;

public class BMIControl2 {

	public static void main(String[] args) {
		String weightS = null,
			   heightS = null;
		double weight = isValWeight(weightS),
			   height = isValHeight(heightS),
			   bmi = calcs(weight, height);
		
		closing(bmi);
	}

	private static double isValWeight(String weightS) {
		double weight;
		
		weightS = JOptionPane.showInputDialog(null,"Please enter your weight in kilograms. ");
		try {
			weight = Double.parseDouble(weightS);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Invalid weight.\nUsing default value of 70 Kg.");
			weight = 70.0;
		}	
		return weight;
	}

	private static double isValHeight(String heightS) {
		double height;
		
		heightS = JOptionPane.showInputDialog(null,"Please enter your height in centimeters. ");
		try {
			height = Double.parseDouble(heightS);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Invalid height.\nUsing default value of 170 centimeters.");
			height = 170.0;
		}		
		return height;
	}
	
	private static double calcs(double weight, double height) {
		double bmi;
		
		bmi = weight / Math.pow((height/100.0), 2);
		return bmi;
	}
	
	public static void closing(double bmi) {
		DecimalFormat df = new DecimalFormat("###.0");
		String status;
		
		if (bmi < 20)
			status = ("Low");
		else
			if (bmi > 25)
				status = ("High");
			else
				status = ("Normal");
		JOptionPane.showMessageDialog(null, "Your body mass index is " + df.format(bmi) + "\nYour BMI is " + status);
	}
}

/**
* Your body mass index is 31.1
* Your BMI is High
* 
* Your body mass index is 22.2
* Your BMI is Normal
* 
* Your body mass index is 17.3
* Your BMI is Low
* 
* Please enter your weight in kilograms. abc
* Invalid weight.
* Using default value of 50 Kg.
* Please enter your height in centimeters. 150
* Your body mass index is 22.2
* Your BMI is Normal
* 
* Please enter your weight in kilograms. 50
* Please enter your height in centimeters. abc
* Invalid height
* Using default value of 170 centimeters.
* Your body mass index is 17.3
* Your BMI is Low
*/
