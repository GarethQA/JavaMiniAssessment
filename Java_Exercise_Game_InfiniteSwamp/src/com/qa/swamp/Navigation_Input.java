package com.qa.swamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Navigation_Input
{
	static int x = 0;
	static int y = 0;
	static ArrayList<Integer> location = new ArrayList<Integer>(2);

	
	public static void main(String[] args) 
	{
		if (location.get(0) == null || location.get(0) == null)
		{
			location.add(x);
			location.add(y);
		}

		Navigation_Input playerInput = new Navigation_Input();
		System.out.println (playerInput.input ()); // needs return!!!
	}
	// ----------------------------------------------
	public void input()
	//public String input() 
	{
		Scanner console = new Scanner (System.in);
		String input = console.nextLine ();
		//return input;
		
		if (input instanceof String) // wrong place???? needs own method
		{
			input = input.toUpperCase();

			if(input == "North" || input == "N") 
			{
				// - Just north direction
				// north = y +1 or y++
				x = x;
				y = y++;
				
				Navigation_Input.newlocation(x, y);

				DistanceCalc calc = new DistanceCalc(location);
				//calc.setlocation(location);

				System.out.println("In = " + calc);
			}
		}
		else
		{
			System.out.println("Please pick a Direction");
		}
	}
	public static void newlocation(int newX, int newY)
	{
		location.set(0, x);
		location.set(1, y);
	}

}