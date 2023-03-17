package calculadora;

public class Calculadora {
	//atributos
	
		double n1;
		double n2;
		double result;
		
		public void setN1(double n){
			n1 = n;
		}
		public double getN1() {
			return n1;
		}
		
		
		public void setN2(double n){
			n2 = n;
		}
		public double getN2() {
			return n2;
		}
		
		
		public void setResult(double r){
			result = r;
		}
		public double getResult() {
			return result;
		}
		
		
		// metodos operacionais
		
		public double add(double n1, double n2) {
			
			return n1 + n2;
		}
		
		public double sub (double n1, double n2) {
			
			return n1 - n2;
		}
		
		public double mult (double n1, double n2) {
			
			return n1 * n2;
		}
		
		public double div (double n1, double n2) {
			
			return n1 / n2;
		}
		
	
}