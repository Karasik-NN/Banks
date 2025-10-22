package Banks;


public class Banks implements Comparable<Banks> {

	private int CVC, KarNum, DerTer, nauduSk;
	private String MakSis;
	
	
	public Banks(int CVC,int numurs, int DerTer, String MakSis, int nauduSk) {
		
		//Konstruktors
		this.CVC = CVC;
		this.KarNum = numurs;
		this.DerTer = DerTer;
		this.MakSis = MakSis;
		
	}
		//Metodes
		
		public int noteiktCVC() {
			return CVC;
		}
		
		public int noteiktKarNum() {
			return KarNum;
			
		}
		
		public int noteiktDerTer() {
			return DerTer;
		}
		
		public String noteiktMakSis() {
			return MakSis;
		}

		public int noteiktnauduSk() {
			return nauduSk;
		}
		@Override
		public int compareTo(Banks o) {
			
			return 0;
		}
	}

	
	
	
	

