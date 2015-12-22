package examples;

public class Movie {

	public static int movie(int card, int ticket, double perc) {

		int aCard = card;
		int aTicket = ticket;
		double aPerc = perc;

		double tPrice = 0;
		double cPrice = 0;
		double cPriceTemp = 0;
		cPrice = aCard + cPrice;
		int i = 0;

		while (tPrice <= cPrice) {
			i++;
			cPrice = cPrice + cPriceTemp;
			cPriceTemp = (int) aTicket * Math.pow(aPerc, i);
			tPrice = (int) aTicket * i;
			
		}
		System.out.println(cPrice);
		System.out.println(tPrice);
		return i;
	}

	// System.out.println(cPrice);
	// System.out.println(tPrice);

	// System.out.println(i);

	public static void main(String[] args) {
		//System.out.println(movie(500, 15, 0.9));
		System.out.println(movie(100, 10, 0.95));

	}

}
// your code

// System A : 15 * 3 = 45
// System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90

/*
 * movie(500, 15, 0.9) should return 43 (with card the total price is 634, with * tickets 645) 
 * movie(100, 10, 0.95) should return 24 (with card the total price * is 235, with tickets 240)
 */
