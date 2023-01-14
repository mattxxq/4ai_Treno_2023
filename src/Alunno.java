
public class Alunno {
	//attributi
	private String nome;
	private String cognome;
	private String data;
	private String classe;
	private String residenza;
	private boolean siOno=false;
	//costruttore
	public Alunno(String nome, String cognome, String data) {
		this.nome=nome;
		this.cognome=cognome;
		this.data=data;
	}
	//get and set methods
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getData() {
		return data;
	}
	public String getClasse() {
		return classe;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setClasse(String clas) {
		classe=clas;
		siOno=true;
	}
	public void setResidenza(String residenza) {
		this.residenza=residenza;
	}
	public String toString() {
		String s="";
		s+=cognome+" "+nome;
				if(siOno)
					s+=", "+classe;
			s+=". Nato il: "+data;
		return s;
	}

	public static void main(String[] args) {
		Alunno a1=new Alunno("Matteo", "Filoni", "14/01/2005");
		/*System.out.println(a.toString());
		System.out.println(a.getCognome());
		a.setClasse("IV Ai");
		System.out.println(a);*/
		Alunno a2 = new Alunno("Gioele","Filoni","14/01/2005");
		Alunno a3 = new Alunno("Gabbo","Yo","76/76/76");
		
		Alunno[] f= {a1,a2,a3};
		for(Alunno a: f)
			System.out.println(a.getClasse());
		
	}

}
