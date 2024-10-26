package homeworkpack4;

// Class file
public class Location {
	// Instance Variables
	public int row, column;
	public double maxValue;
	
	// Constructors
	Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
	
	// Methods
	public static Location locateLargest(double[][] a) {
		double maxVal = a[0][0];
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (maxVal < a[i][j]) {
					maxVal = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		Location data = new Location(row, column, maxVal);
		return data;
	}
}