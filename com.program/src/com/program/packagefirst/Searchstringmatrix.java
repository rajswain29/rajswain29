package com.program.packagefirst;

public class Searchstringmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] matrix = {"GEEKS","FORAM","GEEKS"};
		
		String search = "GFG";
		String[] verticalMatrix = vertical(matrix);
		int horizontalsearch = check(matrix,search);
		int verticalsearch = check(verticalMatrix,search);
		if (horizontalsearch == 1 || verticalsearch == 1) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
		

	}

	private static int check(String[] matrix, String search) {
		// TODO Auto-generated method stub
		for (String input : matrix) { 
			  
            // using split operator 
            String[] value = input.split(search); 
  
            if (value.length >= 2 || value.length == 0) { 
                return 1; 
            } 
            else if (value.length == 1
                     && input.length() != value[0].length()) { 
                return 1; 
            } 
        } 
		return 0;
	}

	private static String[] vertical(String[] matrix) {
		// TODO Auto-generated method stub
		String [] verticalvalue = new String [matrix[0].length()];
		for(int i=0;i<matrix[0].length();i++) {
			String temp ="";
			for(int j=0;j<matrix.length;j++) {
				temp = temp +matrix[j].charAt(i);
				
			}
			verticalvalue[i] = temp;
		}
		return verticalvalue;
	}

}
