package com.qa.swamp;

import java.util.ArrayList;

public class DistanceCalc
{
	private ArrayList<Integer> location = new ArrayList<Integer>();
	private ArrayList<Integer> goal = new ArrayList<Integer>();

	private int distance;

	DistanceCalc (ArrayList<Integer> location)
	{
		this.location = location; 
		//this.goal 	  = goal;
		this.distance = (int) Math.sqrt(Math.pow((location.get (0) - goal.get (0)), 2) + Math.pow((location.get (1)- goal.get (1)), 2));
	}

	// public int getDistance()
	// {	
	// 	return distance;
	// }	

	// public void setlocation(int[] location)
	// {
	// 	this.location = location; 
	// }
}