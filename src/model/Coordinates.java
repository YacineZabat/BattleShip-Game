package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Coordinates implements Comparable<Coordinates> {
	private int i;
	private int j;

	public Coordinates(int i, int j) throws Exception
	{
		if (i < 0 || i>9  || j < 0 || j >9 )
		{
			throw new   Exception("values out of bound");
		}
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Coordinates shot = (Coordinates) o;
		return i==shot.i &&
				j==shot.j;
	}
	@Override
	public int hashCode() {
		return Objects.hash(i, j);
	}

	@Override
	public String toString() {
		return "Coordinates [i=" + i + ", j=" + j + "]";
	}
        
    public static Coordinates getRandomCoordinate() throws Exception {
		Random rand = new Random();
		int i = rand.nextInt(10);
		int j = rand.nextInt(10);
		return new Coordinates(i,j);
	}
	
	public static boolean isAllHorizontal(ArrayList<Coordinates> coordinates)
	{
		int i = coordinates.get(0).getI();
		for (int index = 1; index < coordinates.size();index++)
		{
			if (coordinates.get(index).getI() != i)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAllVertical(ArrayList<Coordinates> coordinates)
	{
		int j = coordinates.get(0).getJ();
		for (int index = 1; index < coordinates.size();index++)
		{
			if (coordinates.get(index).getJ() != j)
			{
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Coordinates> getHorizontalSort(ArrayList<Coordinates> coordinates)
	{
		ArrayList<Coordinates> sorted = new ArrayList<>();
		sorted.addAll(coordinates);
		Collections.sort(sorted, new Comparator<Coordinates>() {

			@Override
			public int compare(Coordinates o1, Coordinates o2) {
				
				return o1.getJ() - o2.getJ();
			}
			
		});
		
		return sorted;
	}
	
	public static ArrayList<Coordinates> getVerticalSort(ArrayList<Coordinates> coordinates)
	{
		ArrayList<Coordinates> sorted = new ArrayList<>();
		sorted.addAll(coordinates);
		Collections.sort(sorted, new Comparator<Coordinates>() {

			@Override
			public int compare(Coordinates o1, Coordinates o2) {
				
				return o1.getI() - o2.getI();
			}
			
		});
		
		return sorted;
	}
	
	public static ArrayList<Coordinates> getSort(ArrayList<Coordinates> coordinates)
	{
		if (isAllHorizontal(coordinates))
			return getHorizontalSort(coordinates);
		if(isAllVertical(coordinates))
			return getVerticalSort(coordinates);
		
		return null;
	}
	
	public static boolean isContiguous(ArrayList<Coordinates> coordinates) {
		
		if (isAllHorizontal(coordinates))
		{
			ArrayList<Coordinates> array = getSort(coordinates);
			int j = array.get(0).getJ();
			
			for(int index = 1; index<array.size();index++)
			{
				if(array.get(index).getJ() != (j+1))
					{return false;}
				j++;
			}
			return true;		
		}
		if (isAllVertical(coordinates))
		{
			ArrayList<Coordinates> array = getSort(coordinates);
			int i = array.get(0).getI();
			
			for(int index = 1; index<coordinates.size();index++)
			{
				if(array.get(index).getI() != (i+1))
					return false;
				i++;
			}
			return true;		
		}
		
		return false;
	}
	
	
	public static Position getPositionOfCoordinates(ArrayList<Coordinates> array)
	{
		if (!(isContiguous(array)))
		{
			return null;
		}
		
		ArrayList<Coordinates> sorted = getSort(array);
		return new Position(sorted.get(0), sorted.get(sorted.size()-1));
	}

	
	@Override
	public int compareTo(Coordinates c) {
		int result = 0 ;
		if(this.i == c.getI())
			result = this.getJ() - c.getJ();
		else
			result = this.getI() - c.getI();
		return result ;
		
	}
	
}
