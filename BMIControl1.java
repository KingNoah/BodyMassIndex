/**
 * This program calculates body mass index.
 * 
 * @author Noah King
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;

public class BMIControl1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.0");
		Scanner scanner = new Scanner(System.in);
		double weight,
			   height,
			   bmi;
		String status,
			   weightS,
			   heightS;

		System.out.print("Please enter your weight in kilograms. ");
		weightS = scanner.next();
		try {
			weight = Double.parseDouble(weightS);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid weight.");
			System.out.println("Using default value of 50 Kg.");
			weight = 50.0;
		}
		System.out.print("Please enter your height in centimeters. ");
		heightS = scanner.next();
		try {
			height = Double.parseDouble(heightS);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid height");
			System.out.println("Using default value of 170 centimeters.");
			height = 170.0;
		}
		bmi = weight / Math.pow((height/100.0), 2);
		if (bmi < 20)
			status = ("Low");
		else
			if (bmi > 25)
				status = ("High");
			else
				status = ("Normal");
		System.out.println("Your body mass index is " + df.format(bmi));
		System.out.println("Your BMI is " + status);
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
