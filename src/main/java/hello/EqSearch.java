package hello;

public class EqSearch {
	EqSearch() {
		distance = 0;
		minmag = 0;
	}

	public int getDistance() {return distance;}
	public int getMinmag() {return minmag;}
	public void setDistance(int dist) {distance = dist;}
	public void setMinmag(int mm) {minmag = mm;} 
	private int distance;
	private int minmag;
}
