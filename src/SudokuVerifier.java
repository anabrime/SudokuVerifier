
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct

		int temp;
		
		if(candidateSolution.length()!=81){
			return -5;

		}else{

			for (int i = 0; i < 9; i++) {
				
				
				temp = Integer.parseInt(candidateSolution); 
				
				 if(candidateSolution.charAt(i) > 0){
					
					
					for (int j = 0; j < 9; j++) {
						if(candidateSolution.charAt(j) > 0){
						temp = Integer.parseInt(candidateSolution); 
						}else{
							return -1;
						}
					}
				}else{
					return -1;
				}
			}
		}


		return 0;

		//check
	}
}
