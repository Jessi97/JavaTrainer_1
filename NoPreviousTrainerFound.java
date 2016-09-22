package JavaTrainer;

public class NoPreviousTrainerFound extends Exception{

	public String getMessage() {
		return "Es wurde kein vorheriger Trainer gefunden.";
	}
	
}
