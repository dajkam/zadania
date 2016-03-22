package faktura;

public class klient { 
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getKonto() {
		return konto;
	}
	
	public klient(String firma, String adres, String nip) {
		super();
		this.firma = firma;
		this.adres = adres;
		this.nip = nip;
		
	}
	@Override
	public String toString() {
		return "klient [firma=" + firma + ", adres=" + adres + ", nip=" + nip
				+ ", konto=" + konto + "]";
	}
	String firma; 
	String adres; 
	String nip; 
	 final String konto="konto";

}
