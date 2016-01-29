package com.training.domains;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		ShowRoom showRoom = new ShowRoom();
		NewShowRoom ns = new NewShowRoom();
		
		Automobile polyauto=null;
		int key=1;
		//polyauto = showRoom.getItem(key);
		//showRoom .printQuote(polyauto);
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter  the choice::::::::::::::\n 1.passenger car \n 2.sports car \n3. luxury car\n 4. Sports bike\n 5.exit\n");
			
			key=in.nextInt();
			
	    switch(key){
        case 1:
					
					polyauto = showRoom.getItem(key);
				  showRoom .printQuote(polyauto);
					break;
					
				case 2:
					polyauto = showRoom.getItem(key);
					showRoom .printQuote(polyauto);
					break;
					
				case 3:
					polyauto = showRoom.getItem(key);
					showRoom .printQuote(polyauto);
					break;
					
				case 4:
					polyauto = ns.getItem(key);
					showRoom.printQuote(polyauto);
					
					break;
				case 5:
					System.exit(0);
			}
			
	    	
				
		}
		
	}

	

}
