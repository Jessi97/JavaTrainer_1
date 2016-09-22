package JavaTrainer;

public class NoNextTrainer {

	public class NoNextTrainerFound extends Exception{
		public String getMessage() {
			return "Es wurde kein vorheriger Trainer gefunden.";
		}

	}
}
