package LabProject;

public class HugeInteger {
	private int myNumberSize;  //initializes variable for number of digits in number
	private int [] myNumber; //array stores values of the integer
	private boolean sign; //stores 0 for negative number and 1 for positive integer
	
	public String toPrint(HugeInteger integer) { // this method is used to print final answers
		String StringSolution2 = "";
		if (integer.sign==false) {
			StringSolution2 += "-";	
		}
		for (int alpha = 0; alpha < integer.myNumberSize; alpha++) {
			StringSolution2 += Integer.toString(integer.myNumber[alpha]);
		}
		return StringSolution2;
		
	}
	
	//CONSTRUCTOR 1
	public HugeInteger(String val) {
		if (val.charAt(0) == '0') {
			if (val.length() == 1) {
				//throw new IllegalArgumentException("0");
				myNumberSize = 1;
				myNumber = new int[myNumberSize];
				sign = true;
				myNumber[0] = 0;
			}
		}
		else if (val.length() == 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		else if (val.charAt(0) != '-') { //This is for the case that the integer is positive
			if (val.charAt(0)=='0') {// Searches for the first non-zero term
				while (val.charAt(0)=='0') { 
					val = val.substring(1, val.length()); //creates a substring starting from the next value
				}
			}
			
			int counter = 0;
			while (counter < val.length()) { //iterates through every character in the string
				if (Character.isDigit(val.charAt(counter)) == false){ //checks to see if they are all integers
					throw new IllegalArgumentException("Invalid Input"); //if it is not an integers then this is thrown
				}
				counter++;
			}
			myNumberSize = val.length(); // sets integer length
			myNumber = new int[myNumberSize];
			sign = true; //sets integer sign
			
			int counter2 = 0;
			while (counter2 < myNumberSize) { //iterates through all characters of string
				myNumber[counter2] = Character.getNumericValue(val.charAt(counter2)); // appends their numeric value to myNumber array
				counter2++;
			}
		}
		else {
			if(val.charAt(0) == '-') {
				if (val.length() == 1) {
					throw new IllegalArgumentException("Invalid Input"); // this is used in case ever digit entered is just 0
					}
				}
			if (val.length() == 0) {
				throw new IllegalArgumentException("Invalid Input");
			}
			if (val.charAt(1) == '0') {
				val = val.substring(1, val.length()); // this will test to see if the first actual digit is 0 or not
				}
			while (val.charAt(0) == '0') { // this will only run if a substring was required to be used before
				val = val.substring(1, val.length()); // In this case it will now have no '-' and first integer will be non-zero
				if (val.length() == 0) {
					throw new IllegalArgumentException("Invalid Input"); // this is used in case ever digit entered is just 0
				}
			}
			int counter = 1;
			while (counter < val.length()) { //iterates through every character in the string
				if (Character.isDigit(val.charAt(counter)) == false){ //checks to see if they are all integers
					throw new IllegalArgumentException("Invalid Input"); //if it is not an integers then this is thrown
				}
				counter++;
			}
			if(val.charAt(0) == '-') {
				val = val.substring(1, val.length()); //will make sure there is no longer a - in the string
			}
			myNumberSize = val.length(); // sets integer length
			sign = false; //sets integer sign
			myNumber = new int[myNumberSize];
			int counter2 = 0;
			while (counter2 < myNumberSize) { //iterates through all characters of string
				myNumber[counter2] = Character.getNumericValue(val.charAt(counter2)); // appends their numeric value to myNumber array
				counter2++;
			}
		}
	}
	
	
	//CONSTRUCTOR 2
	public HugeInteger(int n) {
		if (n == 0) { 
			throw new IllegalArgumentException("Invalid Input"); //Checks to see if n is 0 which is not allowed
		}
		else if (n < 0) {
			throw new IllegalArgumentException("Invalid Input");//Checks to see if n is less than 0 which is not allowed
		}
		else {
			int signValue = 1;
			//int signValue = (int)(Math.random()*2); //obtains a random value (either 0 or 1) to decide if integer is negative or not
			if (signValue == 0) {
				sign = false;
			}
			else {
				sign = true;
			}
			myNumberSize = n; //sets private variable to have size required for myNumber
			myNumber = new int[myNumberSize];
			myNumber[0] =  (int)(Math.random()*8+1); //math.random must be multiplied by the max value
			int counter = 1;
			while (counter < n) {//we multiply by 9 then add one so that 0 isn't a possible first value
				myNumber[counter] = (int)(Math.random()*9); //any other number can now be anything from 0-9
				counter++;
			}
		}
	}
	
	//ADD METHOD
	public HugeInteger add(HugeInteger h) { 
		String StringSolution = ""; //this is where all new values will be appended
		int sum = 0;
		int []solutionarray;
		int newLength = 0;//length of new array
		int i = 0;// placeholder for length of longest array
		int j = 0;// placeholder for length of shorter array
		
		String thisstring = this.toString(); //converts both huge numbers to string so it can evaluate them
		String hstring = h.toString();
		
		 if(thisstring.charAt(0) == '-') {//gets rid of negative sign in string
			  thisstring = thisstring.substring(1);
		  }
		  if(hstring.charAt(0) == '-') {
			  hstring = hstring.substring(1);
		  }
		
		if(thisstring == "0" && hstring != "0") {
			return h;
		}
		else if(thisstring != "0" && hstring == "0") {
			return this;
		}
		else if(thisstring == "0" && hstring == "0") {
			return h;
		}
		
		//FOR THE CASE BOTH SIGNS ARE POSITIVE OR BOTH NEGATIVE
		if (this.sign == true && h.sign == true || this.sign == false && h.sign == false) {
			if(this.sign == false && h.sign == false) {
				StringSolution = "-";
			}
			//The following chunk is used to determine the size of arrays and compares to see which is larger
			//the largers array size is stored as i and the smaller as j
			// this is then used as out counters for the for loops
			
			if (this.myNumberSize > h.myNumberSize) {
				newLength = this.myNumberSize +1; //used as a placeholder to determine length of new array
				j = h.myNumberSize -1;
				i = this.myNumberSize-1;
			}
			else if (this.myNumberSize < h.myNumberSize) {
				newLength = h.myNumberSize +1 ;
				j = this.myNumberSize-1;
				i = h.myNumberSize -1;
			}
			else {
				newLength = h.myNumberSize +1 ;
				j = this.myNumberSize-1;
				i = h.myNumberSize -1;
			}
			solutionarray = new int[newLength];//initializes solution array of newLength as 0
			for (int x = 0; x <newLength; x++) {
				solutionarray[x] = 0;
			}
			//according to the sizes of the array the for loops run and adds corresponding values
			if (this.myNumberSize > h.myNumberSize) {
				while (i>= 0){
					while (j>=0) {
						sum = h.myNumber[j] + this.myNumber[i];
						solutionarray[i] = sum + solutionarray[i];
						i--;
						j--;
					}
					sum = this.myNumber[i];
					solutionarray[i] = sum + solutionarray[i];
					i--;
				}
			}
			else if (this.myNumberSize < h.myNumberSize) {
				while (i>= 0){
					while (j>=0) {
						sum = h.myNumber[i] + this.myNumber[j];
						solutionarray[i] = sum + solutionarray[i];
						i--;
						j--;
					}
					sum = h.myNumber[i];
					solutionarray[i] = sum + solutionarray[i];
					i--;
				}
			}
			else {
				while (i>= 0){
					while (j>=0) {
						sum = h.myNumber[j] + this.myNumber[i];
						solutionarray[i] = sum + solutionarray[i];
						i--;
						j--;
					}
					i--;
				}
			}
			//checks for the carries and makes the change accordingly
			for (int l = newLength - 1 ; l >= 0 ; l--) {
				if (l>0) {
					if(solutionarray[l] >= 10 ) {
						solutionarray[l] -= 10;
						if (l != 0) {
							solutionarray[l-1] += 1;
						}
					}
				}
				
			}
			for (int s = 0; s<newLength-1 ; s++) { //converts answer to string
				StringSolution += Integer.toString(solutionarray[s]);
			}
		}
		//FOR THE CASE ONE IS POSITIVE AND ONE IS NEGATIVE
		int placeholder = 0;
		int carryForward = 0;
		if (h.sign == false && this.sign == true || this.sign == false && h.sign == true) {
			if ((this.sign == false && h.sign == true)){
				//checks if the size of the numbers is the same
                if (this.myNumberSize == h.myNumberSize){
                    if (this.compareTo(h) == -1){
                    	int counter = h.myNumberSize - 1;
                        while (counter >= 0){
                            placeholder = h.myNumber[counter] - carryForward - this.myNumber[counter] ;
                            if (carryForward > 0){
                                carryForward -= 1;
                            }
                            if (placeholder < 0){
                                StringSolution += placeholder + 10;
                                carryForward += 1;
                            }
                            else{
                                 StringSolution += placeholder;   
                            }
                            counter--;
                        }
                    }
                    //checks if h is bigger than this and executes code
                    else if(this.compareTo(h) == 1){
                    	int counter = this.myNumberSize - 1;
                        while ( counter >= 0) {
                            placeholder = this.myNumber[counter]- carryForward - h.myNumber[counter] ;
                            //checks carryForward and resets it
                            if (carryForward > 0){
                                carryForward = carryForward - 1;
                            }
                            if(placeholder >= 0){
                                StringSolution = StringSolution+ placeholder;   
                           }
                            //if placeholder retrieves -, it means top number was bigger than bottom then it basically adds 10 to make it positive
                            if (placeholder < 0){
                                carryForward += 1;
                            	StringSolution = StringSolution + 10 + placeholder;
                            }
                            counter--;
                        }
                        StringSolution += '-'; //adds negative to the solution
                    }
    				//checks if numbers are the same and returns 0
                    else if(this.compareTo(h) == 0){
                        StringSolution = "0";
                    } 
                }
                //the following case is for this size greater than h size
                else if(this.myNumberSize > h.myNumberSize){
                	int counter = h.myNumberSize - 1;
                    int placeholder2 = this.myNumberSize - h.myNumberSize; //used to represent the new length of the number
                    while(counter >= 0){
                        placeholder = this.myNumber[placeholder2 + counter] - h.myNumber[counter] - carryForward;
                        if (carryForward > 0){
                            carryForward -= 1;
                        }
                        if (placeholder < 0){
                            StringSolution += 10 + placeholder ;
                            carryForward += 1;
                        }
                        else{
                            StringSolution += placeholder;
                        }
                        counter--;
                    }
                    int counter2 = placeholder2 - 1;
                    while( counter2 >= 0){
                        placeholder = this.myNumber[counter2] - carryForward;
                        if (carryForward > 0){
                            carryForward = carryForward - 1;
                        }
                        if (placeholder>=0){
                            StringSolution += placeholder;
                        }
                        else if (placeholder < 0){
                            StringSolution = StringSolution + 10 + placeholder ;
                            carryForward = carryForward + 1;
                        }
                        
                        counter2--;
                    }
                    StringSolution += "-";
                }
                //this is for the case that h size is bigger than this size
                else if(h.myNumberSize > this.myNumberSize) {
                    int counter = this.myNumberSize - 1;
                    int placeholder3 = h.myNumberSize - this.myNumberSize;
                    while (counter >= 0){
                        placeholder = h.myNumber[placeholder3 + counter] - carryForward - this.myNumber[counter];
                        if (carryForward > 0){
                            carryForward -= 1;
                        }
                        if(placeholder>=0){
                            StringSolution += placeholder;
                        }
                        if (placeholder < 0){
                            StringSolution += placeholder + 10;
                            carryForward = carryForward + 1;
                        }
                        counter--;
                    }
                    int newCounter = placeholder3 - 1;
                    while(newCounter >= 0){
                        placeholder = h.myNumber[newCounter] - carryForward;
                        if (carryForward > 0){
                            carryForward -= 1;
                        }
                        if(placeholder >= 0 ){
                            StringSolution += placeholder;
                        }
                        if (placeholder < 0){
                            StringSolution += placeholder + 10;
                            carryForward = carryForward + 1;
                        }
                        newCounter--;
                    }
                }
            }
            else if(this.sign == true && h.sign == false){
            	return h.add(this);
            }
			//makes it of type StringBuilder because it has to reverse string
			StringBuilder newSoln = new StringBuilder(StringSolution);
			HugeInteger Solved = new HugeInteger(newSoln.reverse().toString());
			return Solved;
		}
		HugeInteger Solved = new HugeInteger(StringSolution); //method must return of this type
		return Solved;
	}

	
	
	//SUBTRACT METHOD
	public HugeInteger subtract(HugeInteger h) {
		String newtemp = h.toString();
		
		if (newtemp.charAt(0) == '-') {
			newtemp = newtemp.substring(1);
		}
		
		HugeInteger newh = new HugeInteger(newtemp);
		
		newh.sign = true;
		
		if (h.sign == false) {
			h.sign = true;
			newh.sign = true;
		}
		if(h.sign == true) {
			h.sign = false;
			newh.sign = false;
		}
		
		
		return this.add(newh);
	}
	
	

	
	//MULTIPLY METHPD 
	public HugeInteger multiply(HugeInteger h) {
		  String solutionString = new String(""); 
		  int placeholder = 0;  
		  int placeholder1 = 0;  //placeholder are used as indexes when iterating through Solution Array
		  int int1 = 0; //number1 and number2 will be used to as temp positions for multiplying numbers
		  int int2 = 0;
		  
		  String firstNumber = this.toString(); //converts both huge numbers to string so it can evaluate them
		  String secondNumber = h.toString();
		  int SolnArray[] = new int[h.myNumberSize + this.myNumberSize]; //creates new array of h.myNumberSize+ this.myNumberSize
		  
		 
		  if(h.sign == false && this.sign == false || h.sign == true && this.sign == true) {
			  solutionString = "";
			  }
		  else if(h.sign == false && this.sign == true || h.sign == true && this.sign == false) {
			  solutionString += "-";
			  }
		  if(firstNumber.charAt(0) == '-') {//gets rid of negative sign in string
			  firstNumber = firstNumber.substring(1);
		  }
		  if(secondNumber.charAt(0) == '-') {
			  secondNumber = secondNumber.substring(1);
		  }
		  
		  
		  int counter = this.myNumberSize - 1;
		  while(counter >= 0){ 
			  int counter2 = h.myNumberSize - 1;
			  placeholder1 = 0;  
			  int Forward = 0; 
			  int1 = firstNumber.charAt(counter) - '0';  // you do -0 to get the right number (since it finds in ascii)
			  while ( counter2 >= 0) { 
				  int2 = secondNumber.charAt(counter2) - '0'; 
				  int product = int1 * int2 + SolnArray[placeholder + placeholder1] + Forward; 
				  Forward = product / 10; 
				  SolnArray[placeholder + placeholder1] = product % 10; 
				  placeholder1++; 
				  counter2--;
				  } 
			  if (Forward > 0) { //this will detect if there is a carryForward
				  SolnArray[placeholder + placeholder1] += Forward; 
				  }
			  placeholder++; 
			  counter--;
		    } 
		  int i = SolnArray.length - 1; 
		  while (i >= 0 && SolnArray[i] == 0) {
			  i--; 
			  }
		  if (i == -1) {
			  solutionString = "0"; 
			  }
		  while (i >= 0) {
			  solutionString += (SolnArray[i--]); 
			  }
		  
		  HugeInteger finalProduct = new HugeInteger(solutionString);
		  return finalProduct; 
	}
	

	//COMPARE METHOD
	public int compareTo(HugeInteger h) {
		if (this.sign == true && h.sign == false) { //checks if this is positive and h is not
			return 1;
		}
		else if(this.sign == false && h.sign == true) {//checks if h is positive and this is not
			return -1;
		}
		else if(this.sign == true && h.sign == true) { //in case both are positive
			if (this.myNumberSize > h.myNumberSize) { //compares sizes
				return 1;
			}
			else if(h.myNumberSize> this.myNumberSize) {
				return -1;
			}
			else if(this.myNumberSize == h.myNumberSize){ //if size is the same checks individual values
				for (int i = 0; i < h.myNumberSize; i++) {
					if( this.myNumber[i] > h.myNumber[i]) {
						return 1;
					}
					if( this.myNumber[i] < h.myNumber[i]) {
						return -1;
					}
				}
			}
			else {
				return 0; //if same gives 0
			}
		}
		else {
			if (this.myNumberSize > h.myNumberSize) {
				return -1;
			}
			else if(h.myNumberSize> this.myNumberSize) {
				return 1;
			}
			else if(this.myNumberSize == h.myNumberSize){
				for (int i = 0; i < h.myNumberSize; i++) {
					if( this.myNumber[i] > h.myNumber[i]) {
						return -1;
					}
					if( this.myNumber[i] < h.myNumber[i]) {
						return 1;
					}
				}
			}
			else {
				return 0;
			}
			
		}
		return 0;
	}
	
	
	//TO STRING METHOD
	public String toString() {
		String newString = "";
		if (this.sign == false) {
			newString = "-";
		}
		for(int y = 0; y < this.myNumberSize; y++) {
			newString += Integer.toString(this.myNumber[y]);
		}
		return newString;
	}
	
}











