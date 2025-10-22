package Banks;

public class norkerte extends Banks{
public String KarVeid;
	public norkerte(int CVC, int KarNum, int DerTer, String MakSis,int nauduSk ,String KarVeid ) {
		super(CVC, KarNum, DerTer, MakSis, nauduSk);
	this.KarVeid = KarVeid;
	}
public String noteiktKartVeid() {
	return KarVeid;
}
	public String izvadit() {
		return "Kartes veids: "+noteiktKartVeid()+
				"\nKartes Numurs: "+noteiktKarNum()+
				"\nKartes CVC: "+noteiktCVC()+
				"\nDeriguma termiņš"+noteiktDerTer()+
				"\nMaksajuma sistēma: "+noteiktMakSis()+
				"\n"+noteiktnauduSk()+"EURO";
				
	}
	
}
