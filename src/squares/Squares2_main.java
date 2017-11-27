package squares;

public class Squares2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double y[] = { 0.2, 0.8, 1.0, 2.0, 4.0, 6.0, 8.0 };
		double theta[] = new double[2];
			
		Squares2_ib slib = new Squares2_ib(x, y);
		for(int i = 0;i<100;i++) {
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}
		
	}

}
