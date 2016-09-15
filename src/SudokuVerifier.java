

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct

		//Que mida 81 y este entre 1 y 9

		if(candidateSolution.length() != 81) return -5;

		for (int i = 0; i < 81; i++) {

			if((candidateSolution.charAt(i)<1 || candidateSolution.charAt(i)>9)) return -1;
		}




		return 0;
	}
	public String[] createRaw(String candidateSolution){
		for(int l = 0; l < 9; l++){
			for (int k = 0; k < 9; k++) {

				char[] raw = new char[9];

				raw[k] = candidateSolution.charAt(l);
			}
			return raw;

		}
	}
}






//check



