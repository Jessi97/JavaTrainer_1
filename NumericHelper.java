package JavaTrainer;

public class NumericHelper {
	
	
	public static boolean isNumeric(String string){
		int x;
		try{
			x = Integer.parseInt(string);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
}