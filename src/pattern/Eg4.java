package pattern;

public class Eg4 {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		
		
		//rows-->5  star-->5
		
		int star=5;
		
		//outer for loop
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
		
	}

}
