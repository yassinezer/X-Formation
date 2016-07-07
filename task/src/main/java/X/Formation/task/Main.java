package X.Formation.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import X.Formation.task.Ananas;
import X.Formation.task.Banane;
import X.Formation.task.Baranina;
import X.Formation.task.Camote;
import X.Formation.task.Cuisine;
import X.Formation.task.Culatello;
import X.Formation.task.Fanta;
import X.Formation.task.ItalianCuisine;
import X.Formation.task.MexicanCuisine;
import X.Formation.task.Orange;
import X.Formation.task.Pepsi;
import X.Formation.task.PolishCuisine;



public class Main {

	static int choice = 0;
	static BufferedReader br;
	static boolean boolchoice1= false;
	static boolean boolchoice2= false;
	static String ch="";

	public static void PolishCuisine() throws NumberFormatException, IOException{

		Cuisine polishCuisine = new PolishCuisine();
		do{
        System.out.println("        1. Lunch       \n        2. Drink        \n        3. Exit            ");  
        choice=Integer.parseInt(br.readLine()); 
		switch (choice){
		case 1:{
			do{
            System.out.println("        1. Main Course       \n        2. Dessert        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{        				
                System.out.println("        1. Baranina       \n        2. Exit            \n");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        
    	        switch (choice){
    			case 1:{
    				polishCuisine.addItem(new Baranina());
                    polishCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("baranina")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }
			}
			break;
			case 2:{
                System.out.println("        1. Banane       \n        2. Exit            ");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        switch (choice){
    			case 1:{
    				polishCuisine.addItem(new Banane());
                    polishCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("banane")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }

			}
			break;
			}

			}while (choice != 3);
		}
		break;
		case 2:{
            System.out.println("        1. Fanta       \n        2. Pepsi        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{ 
    			System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y"))boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			polishCuisine.addItem(new Fanta("icecubes", "lemon"));
			else if(boolchoice1)
			polishCuisine.addItem(new Fanta("icecubes", ""));
			else if(boolchoice2)
			polishCuisine.addItem(new Fanta("", "lemon"));
			else
    		polishCuisine.addItem(new Fanta("", ""));

            polishCuisine.getMenu().parallelStream().limit(1).filter(
            		e->e.getName().equalsIgnoreCase("fanta")).forEach(
            		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			case 2:{
    			System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			polishCuisine.addItem(new Pepsi("icecubes", "lemon"));
			else if(boolchoice1)
			polishCuisine.addItem(new Pepsi("icecubes", ""));
			else if(boolchoice2)
			polishCuisine.addItem(new Pepsi("", "lemon"));
			else
    		polishCuisine.addItem(new Pepsi("", ""));


                polishCuisine.getMenu().parallelStream().limit(1).filter(
                		e->e.getName().equalsIgnoreCase("pepsi")).forEach(
                		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			}

			
		}
		break;
		}
		}while(choice!=3);
		System.out.println(" The total cost : "+ ((PolishCuisine) polishCuisine).getCost());

		polishCuisine.deleteAllItem();
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void MexicanCuisine() throws NumberFormatException, IOException{


		Cuisine mexicanCuisine = new MexicanCuisine();
		do{
        System.out.println("        1. Lunch       \n        2. Drink        \n        3. Exit            ");  
        choice=Integer.parseInt(br.readLine()); 
		switch (choice){
		case 1:{
			do{
            System.out.println("        1. Main Course       \n        2. Dessert        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{        				
                System.out.println("        1. Camote       \n        2. Exit            \n");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        
    	        switch (choice){
    			case 1:{
    				mexicanCuisine.addItem(new Camote());
    				mexicanCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("camote")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }
			}
			break;
			case 2:{
                System.out.println("        1. Orange       \n        2. Exit            ");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        switch (choice){
    			case 1:{
    				mexicanCuisine.addItem(new Orange());
    				mexicanCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("orange")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }

			}
			break;
			}

			}while (choice != 3);
		}
		break;
		case 2:{
            System.out.println("        1. Fanta       \n        2. Pepsi        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{ 
    			System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			mexicanCuisine.addItem(new Fanta("icecubes", "lemon"));
			else if(boolchoice1)
				mexicanCuisine.addItem(new Fanta("icecubes", ""));
			else if(boolchoice2)
				mexicanCuisine.addItem(new Fanta("", "lemon"));
			else
				mexicanCuisine.addItem(new Fanta("", ""));


			mexicanCuisine.getMenu().parallelStream().limit(1).filter(
            		e->e.getName().equalsIgnoreCase("fanta")).forEach(
            		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			case 2:{
				System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			mexicanCuisine.addItem(new Pepsi("icecubes", "lemon"));
			else if(boolchoice1)
				mexicanCuisine.addItem(new Pepsi("icecubes", ""));
			else if(boolchoice2)
				mexicanCuisine.addItem(new Pepsi("", "lemon"));
			else
				mexicanCuisine.addItem(new Pepsi("", ""));
			
			mexicanCuisine.getMenu().parallelStream().limit(1).filter(
                		e->e.getName().equalsIgnoreCase("pepsi")).forEach(
                		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			}

			
		}
		break;
		}
		}while(choice!=3);
		System.out.println(" The total cost : "+ ((MexicanCuisine) mexicanCuisine).getCost());
		mexicanCuisine.deleteAllItem();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void ItalianCuisine() throws NumberFormatException, IOException{
		Cuisine italianCuisine = new ItalianCuisine();
		do{
        System.out.println("        1. Lunch       \n        2. Drink        \n        3. Exit            ");  
        choice=Integer.parseInt(br.readLine()); 
		switch (choice){
		case 1:{
			do{
            System.out.println("        1. Main Course       \n        2. Dessert        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{        				
                System.out.println("        1. Culatello       \n        2. Exit            \n");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        
    	        switch (choice){
    			case 1:{
    				italianCuisine.addItem(new Culatello());
    				italianCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("culatello")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }
			}
			break;
			case 2:{
                System.out.println("        1. Orange       \n        2. Exit            ");  
    	        choice=Integer.parseInt(br.readLine()); 
    	        switch (choice){
    			case 1:{
    				italianCuisine.addItem(new Ananas());
    				italianCuisine.getMenu().parallelStream().limit(1).filter(
                    		e->e.getName().equalsIgnoreCase("ananas")).forEach(
                    		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
    			}
    			break;
    			case 2:{break;}
    	        }
			}
			break;
			}
			}while (choice != 3);
		}
		break;
		case 2:{
            System.out.println("        1. Fanta       \n        2. Pepsi        \n        3. Exit            ");  
	        choice=Integer.parseInt(br.readLine()); 
	        switch (choice){
			case 1:{ 
				System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			italianCuisine.addItem(new Fanta("icecubes", "lemon"));
			else if(boolchoice1)
				italianCuisine.addItem(new Fanta("icecubes", ""));
			else if(boolchoice2)
				italianCuisine.addItem(new Fanta("", "lemon"));
			else
				italianCuisine.addItem(new Fanta("", ""));

			italianCuisine.getMenu().parallelStream().limit(1).filter(
            		e->e.getName().equalsIgnoreCase("fanta")).forEach(
            		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			case 2:{
				System.out.println("are you want to add ice Cubes: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice1=true;
    			System.out.println("are you want to add Lemon: (Y/N)"); 
    			ch= br.readLine();
    			if(ch.equalsIgnoreCase("Y")) boolchoice2=true;
    			
			if(boolchoice1&& boolchoice2)
			italianCuisine.addItem(new Pepsi("icecubes", "lemon"));
			else if(boolchoice1)
				italianCuisine.addItem(new Pepsi("icecubes", ""));
			else if(boolchoice2)
				italianCuisine.addItem(new Pepsi("", "lemon"));
			else
				italianCuisine.addItem(new Pepsi("", ""));


			italianCuisine.getMenu().parallelStream().limit(1).filter(
            		e->e.getName().equalsIgnoreCase("pepsi")).forEach(
            		e->System.out.println("this price : "+e.getPrice() +" will be add to your ordering menu."));
			}
			boolchoice1 = false;
			boolchoice2 = false;
			break;
			}
		}
		break;
		}
		}while(choice!=3);
		System.out.println(" The total cost : "+ ((ItalianCuisine) italianCuisine).getCost());
		italianCuisine.deleteAllItem();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		do {
	        System.out.print("================== Menu ================== \n");  
	        System.out.print("    1. Polish Cuisine   \n    2. Mexican Cuisine   \n    3. Italian Cuisine   \n    4. Exit   \n");  
	        System.out.print("Enter your choice: ");  
	        br=new BufferedReader(new InputStreamReader(System.in));   
	        choice=Integer.parseInt(br.readLine()); 
			switch (choice){
			case 1:{PolishCuisine();}
			break;
			
			case 2:{MexicanCuisine();}
			break;
			
			case 3:{ItalianCuisine();}
			break;
			
			default:{    
	            System.out.println("Other Than These Choices No Cuisine Available");  
	        }
			}
		}while (choice !=4);
		
	}

}
