package JavaTrainer;

public class DataLayerSqlite implements IDataLayer {

	/**
	 * @param args
	 */
	private TrainerDaoSqlite trainerDaoSqlite;
		
	public DataLayerSqlite() {
	}
    {
        this.trainerDaoSqlite = new TrainerDaoSqlite();
    }

	@Override
	public ITrainerDao getTrainerDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
