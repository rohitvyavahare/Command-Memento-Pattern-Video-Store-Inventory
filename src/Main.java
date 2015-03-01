


public class Main {

	 public static void main(String[] args) {
	       
	     
	       InventoryDecorator invent = new InventoryDecorator();
	       Integer price;
	       
	       invent.addMovie(new Movie("MIB-1", 500, 5));
	       invent.addMovie(new Movie("MIB-2", 600, 5));
	       invent.addMovie(new Movie("MIB-5", 700, 5));
	       invent.addCopy("MIB-1", 5); 
			try{	
				price = invent.findQuantityByID(1);
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
		   //invent.saveState();
	       
	       InventoryDecorator invent2 = new InventoryDecorator();
	        invent2.getState();
	      invent2.addMovie(new Movie("MIB-4", 800, 5));
	      invent2.sellMovie("MIB-1");
	      try{	
				price = invent2.findQuantityByName("MIB-1");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println(e);
			}
	      try{	
				price = invent2.findPriceByName("MIB-2");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
	      try{	
				price = invent2.findPriceByName("MIB-3");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
	      try{	
				price = invent2.findPriceByName("MIB-4");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
			//	price = invent.findPriceByName("MIB-4");
	       
	       
	       
	 }
}
