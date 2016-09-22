package JavaTrainer;

public class Trainer implements ITrainer {
	
	private int id; 
	private String nname; 
	private String vname;  
	private int alter; 
	private int erfahrung;

        public Trainer(int id, String nname, String vname, int alter, int erfahrung)
        {
           this.id = id;
           this.nname = nname;
           this.vname = vname;
           this.alter = alter;
           this.erfahrung = erfahrung;
        }

	public int getId(){
		return id;
	}
	public void setID(int id){
		this.id = id; 
	}
	public String getNName(){
		return nname;
	}
	public void setNName(String nname){
		this.nname = nname; 
	}
	
	public String getVName(){
		return vname;
	}
	public void setVName(String vname){
		this.vname = vname; 
	}
	public int getAlter(){
		return alter;
	}
	public void setAlter(int alter){
		this.alter = alter; 
	}
	public int getErfahrung(){
		return erfahrung;
	}
	public void setErfahrung(int erfahrung){
		this.erfahrung = erfahrung; 
	}
}
