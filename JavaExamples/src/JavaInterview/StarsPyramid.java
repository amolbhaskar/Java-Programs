package JavaInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//pyramid: https://www.youtube.com/watch?v=6FFGDpgeg8g

public class StarsPyramid {

	public static void main(String[] args) {
		
		int rc = 5, spaceCounter = 4, starCounter = 1;

		// Loop 1 for rows
		for (int i = 1; i <= 5; i++) 
			
			{System.out.println();

			// Loop 2 for spaces
			for (int j = 1; j <= spaceCounter; j++) 

				{System.out.print(" ");}
			
			// Loop 3 for stars
			for (int k = 1; k <= starCounter; k++) 
				
				{System.out.print("*");}
			
				spaceCounter--; //1st row will have 4 spaces, 2nd row will have 3 spaces and so on
				starCounter = starCounter + 2; //1st row will have 1 star, 2nd row will have 3 stars and so on
		}

	}
}


