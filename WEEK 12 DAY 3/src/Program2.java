
public class Program2 {

	private static String[] data  = {"Sumit Kumar","Hiteshwar",};
	
	public static int iterativeSearch (String[] data, String goal) {
		int ndx = 0;
		while (ndx< data.length ) ndx++;
		if (ndx >= data.length) return -1;
		if (goal== data[ndx]) return ndx;
		else return -1;
	}

	public static void main(String[] args) {
		String goal = "Hiteshwar;
		int result = iterativeSearch(data,goal);
		if (result<0)
			System.out.println("The goal could not find:" + goal);
		else
			System.out.println("The goal of" + ""+goal +""+ "was found at index:" + result);
}
}