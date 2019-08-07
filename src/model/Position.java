package model;
import java.lang.Math;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Position {
	private Coordinates start;
	private Coordinates end;

	public Position(Coordinates start, Coordinates end) {
		this.start = start;
		this.end = end;
	}

	public Coordinates getStart()
	{
		return start;
	}
	public Coordinates getEnd()
	{
		return end;
	}
	
	public boolean isHorizontal()
	{
		return this.getStart().getI() == this.getEnd().getI();
	}
	
	public boolean isVertical()
	{
		return this.getStart().getJ() == this.getEnd().getJ();
	}
	
	public int getLength()
	{
		if (this.isHorizontal())
		{
			return Math.abs(this.getStart().getJ() - this.getEnd().getJ()) + 1;
		}
		
		return  Math.abs(this.getStart().getI() - this.getEnd().getI()) + 1  ;
	}
	
	public Set<Coordinates> getArea() throws Exception
	{
	 Set<Coordinates> area = new LinkedHashSet<>();
     int size = this.getLength();
			int i = 0;
			while( i < size)
			{
				
					if (this.isHorizontal())	
					    area.add(new Coordinates(this.getStart().getI(), this.getStart().getJ() + i));
					else
						area.add(new Coordinates(this.getStart().getI() + i, this.getStart().getJ()));
						
				i++;
			}
			
			return area;

		}
	
	 public Set<Coordinates> getBorders(){
		 	Set<Coordinates> coordinates;
		 	Set<Coordinates> borders = new TreeSet<Coordinates>(); 
		 	int i = 0; 
            int j = 0;
		 	try {
				coordinates = this.getArea();
				 for (Coordinates l : coordinates) {
			            i = l.getI(); 
			            j = l.getJ(); 
			            	            
			            if(i> 0)
			                borders.add(new Coordinates(i-1,j));
			            if(i < 9)
			                borders.add(new Coordinates(i+1,j));
			            if(j> 0)
			                borders.add(new Coordinates(i,j-1));
			            if(j < 9)
			                borders.add(new Coordinates(i,j+1));
			            if(i> 0 && j > 0)
			                borders.add(new Coordinates(i-1,j-1));
			            if(i<9 && j <9)
			                borders.add(new Coordinates(i+1,j+1)); 
			            if(i> 0 && j < 9)
			                borders.add(new Coordinates(i-1,j+1));
			            if(i<9 && j >0)
			                borders.add(new Coordinates(i+1,j-1));   
			            
			        }
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
	       
	        try {
				borders.removeAll(this.getArea());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        return borders; 
	    }
	    
	
	public static Position getRandomPosition(int shipSize){
		
		try {
			Coordinates start = Coordinates.getRandomCoordinate();
			Coordinates end= null; 
			Random rand = new Random(); 
			boolean validEnd = false; 
			boolean horizontal = false;
			int xEnd =0; 
			int yEnd =0;
			
			while(validEnd == false){
				horizontal = rand.nextBoolean();
				start = Coordinates.getRandomCoordinate();
				xEnd =0; 
				yEnd =0;
				
				if(horizontal == true){
					xEnd = start.getI();
					yEnd = start.getJ() + shipSize - 1; 
				}
				else{
					xEnd = start.getI()+ shipSize - 1; 
					yEnd = start.getJ();
				}
				
				
				if(xEnd < 10 && yEnd <10){
					validEnd = true; 
				}
			}
			end = new Coordinates(xEnd, yEnd);
			return new Position(start, end); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
	}

	@Override
	public String toString() 
	{
		return "Position [start=" + start + ", end=" + end + "]";
	}
	public static void main(String[] args) {
		
		Position p = getRandomPosition(3);
		System.out.println(p);
	
		TreeSet<Coordinates> l= (TreeSet<Coordinates>) p.getBorders(); 
		System.out.println(l);
		
	}
	

	
}
