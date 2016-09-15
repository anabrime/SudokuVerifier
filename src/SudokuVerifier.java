
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct

		//Que mida 81 y este entre 1 y 9

		int i = 0;
		while (candidateSolution.length()==81 && (candidateSolution.charAt(i)>=1 && candidateSolution.charAt(i)<=9)&& i<81) {	
			i++;
		}
		
		if(i == 81){
			return 1;
		}else{
			return -1;
		}
	}


	//check
}


