
public class Program1 {

public static int iterativeSearch (int d[], int g) {
	int ndx = 0;
	while (ndx< d.length);{

	if (g== d[ndx]) return ndx;
	  
	else ndx++;
	
	}
	return -1;
}

public static void main(String[] args) {

int[] d = {1,8,7,19,15,11,21,25};

	System.out.println("The position of number 7 is: " +iterativeSearch(d, 7));
	System.out.println("The position of number 15 is: " + iterativeSearch(d, 15));
}
}
