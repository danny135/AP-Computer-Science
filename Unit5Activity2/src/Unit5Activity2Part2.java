import java.util.Scanner;

/**
 * Asks for students' grades and then displays some data.
 * @author Daniel Ruano
 *
 */
public class Unit5Activity2Part2 
{
	int[] student1 = {-1, -1, -1};
	int[] student2 = {-1, -1, -1};
	int[] student3 = {-1, -1, -1};
	
	private double minimum(double x, double y, double z)
	{
		return Math.min(Math.min(x, y), z);
	}
	
	private double maximum(double x, double y, double z)
	{
		return Math.max(Math.max(x, y), z);
	}
	
	private double average(double x, double y, double z)
	{
		return Math.round((x + y + z) / 0.3) / 10.0;
	}
	
	public double getAverageGrade(int student)
	{
		switch(student)
		{
			case 1:
				return average(student1[0], student1[1], student1[2]);
			case 2:
				return average(student2[0], student2[1], student2[2]);
			case 3:
				return average(student3[0], student3[1], student3[2]);
		}
		throw new IllegalArgumentException("Invalid student.");
	}
	
	public int getMaximumGrade(int student)
	{
		switch(student)
		{
			case 1:
				return (int) maximum(student1[0], student1[1], student1[2]);
			case 2:
				return (int) maximum(student2[0], student2[1], student2[2]);
			case 3:
				return (int) maximum(student3[0], student3[1], student3[2]);
		}
		throw new IllegalArgumentException("Invalid student.");
	}
	
	public int getMinimumGrade(int student)
	{
		switch(student)
		{
			case 1:
				return (int) minimum(student1[0], student1[1], student1[2]);
			case 2:
				return (int) minimum(student2[0], student2[1], student2[2]);
			case 3:
				return (int) minimum(student3[0], student3[1], student3[2]);
		}
		throw new IllegalArgumentException("Invalid student.");
	}
	
	public char getLetterGrade(int student)
	{			
		int grade = (int) Math.ceil(getAverageGrade(student));
		
		if (grade >= 90 && grade <= 100)
		{
			return 'A';
		}
		if (grade >= 80 && grade <= 89)
		{
			return 'B';
		}
		if (grade >= 70 && grade <= 79)
		{
			return 'C';
		}
		if (grade >= 65 && grade <= 69)
		{
			return 'D';
		}
		if (grade >= 0 && grade <= 64)
		{
			return 'F';
		}
		throw new IllegalArgumentException("Invalid grade.");
	}
	
	public String getGrades(int student)
	{
		switch(student)
		{
			case 1:
				return student1[0] + ", " + student1[1] + ", " + student1[2];
			case 2:
				return student2[0] + ", " + student2[1] + ", " + student2[2];
			case 3:
				return student3[0] + ", " + student3[1] + ", " + student3[2];
		}
		return "";
	}
	
	public void addGrade(int student, int grade)
	{
		if (grade < 0 || grade > 100) throw new IllegalArgumentException("Invalid grade.");
		
		switch(student)
		{
			case 1:
				for (int i = 0; i < student1.length; i++)
				{
					if (student1[i] == -1) 
					{
						student1[i] = grade;
						return;
					}
				}
			case 2:
				for (int i = 0; i < student2.length; i++)
				{
					if (student2[i] == -1) 
					{
						student2[i] = grade;
						return;
					}
				}
			case 3:
				for (int i = 0; i < student3.length; i++)
				{
					if (student3[i] == -1) 
					{
						student3[i] = grade;
						return;
					}
				}
		}
	}

	public static void main(String[] args) 
	{
		Unit5Activity2Part2 grades = new Unit5Activity2Part2();
		
		Scanner input = new Scanner(System.in);
		
		for (int s = 1; s <= 3; s++)
		{
			System.out.print("\nEnter three grades for student " + s + ": ");
			for (int g = 0; g < 3; g++)
			{
				grades.addGrade(s, input.nextInt());
			}
		}
		
		input.close();
		
		for (int s = 1; s <= 3; s++)
		{
			System.out.println("\nSTUDENT " + s + ":");
			System.out.println("Minimum score: " + grades.getMinimumGrade(s));
			System.out.println("Maximum score: " + grades.getMaximumGrade(s));
			System.out.println("Average score: " + grades.getAverageGrade(s));
			System.out.println("Letter grade: " + grades.getLetterGrade(s) + "\n");
		}
	}

}
