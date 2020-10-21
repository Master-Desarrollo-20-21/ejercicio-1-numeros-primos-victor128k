
public class PrimeNumbers {
	
	private boolean isPrime(int number) {
		assert (number >= 0);
		
		if (number < 2) {
			return false;
		}

		int i = 2;
		
		while (i < number / 2 && number % i != 0) {
			i++;
		}
		
		return number % i != 0;
	}
	
	private int addFirstPrimes(int numberOfPrimes) {
		assert (numberOfPrimes >= 0);
		
		int primesFound = 0;
		int sum = 0;
		int i = 0;
		
		while (primesFound < numberOfPrimes) {
			if (this.isPrime(i)) {
				primesFound++;
				sum += i;
			}
			i++;
		}
		
		return sum;
	}
	
	private int addPrimesInFirst(int maxNumber) {
		assert (maxNumber >= 0);
		
		int sum = 0;
		for (int i = 0; i <= maxNumber; i++) {
			if (this.isPrime(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		GestorIO gestorIO = new GestorIO();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		
		gestorIO.out("suma de los primeros 50 primos: " + primeNumbers.addFirstPrimes(50) + "\n");
		gestorIO.out("suma de los primos en los 50 primeros números: " + primeNumbers.addPrimesInFirst(50) + "\n");
		
	}
}
