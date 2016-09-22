package JavaTrainer;

public class NoTrainerFoundException extends Exception {
	public String getMessage() {
		return "Es wurde kein Trainer gefunden.";
	}

}
