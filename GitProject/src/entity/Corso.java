package entity;
import java.io.File;
import java.util.Date;
import javax.persistence.*;
@Entity
public class Corso {
	@Id
	@Column(name ="id_corso")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idCorso;
	private String titolo;
	private Lezione[] lezioni;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inizio")
	private Date dataInizio;
	@Column(name = "num_lezioni")
	private int numLezioni;
	@Column(name = "ore_totali")
	private float oreTotali;
	@Column(name = "num_giorni")
	private int numGiorni;
	@Column(name = "ore_per_giorno")
	private float orePerGiorno;
	@Column(name = "num_max_studenti")
	private int numMaxStudenti;
	@Column(name = "requisiti_minimi")
	private String requisitiMinimi;
	private Docente docente;
	private String descrizione;
	@Column(name = "num_lezioni_per_giorno")
	private int numLezioniPerGiorno;
	private String sede;
	@Column(name = "ore_trascorse")
	private float oreTrascorse;
	@Column(name = "immagine_corso")
	private File immagineCorso;
	@Column(name = "lezione_corrente")
	private Lezione lezioneCorrente;
	
	
	public int getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Lezione[] getLezioni() {
		return lezioni;
	}
	public void setLezioni(Lezione[] lezioni) {
		this.lezioni = lezioni;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public int getNumLezioni() {
		return numLezioni;
	}
	public void setNumLezioni(int numLezioni) {
		this.numLezioni = numLezioni;
	}
	public float getOreTotali() {
		return oreTotali;
	}
	public void setOreTotali(float oreTotali) {
		this.oreTotali = oreTotali;
	}
	public int getNumGiorni() {
		return numGiorni;
	}
	public void setNumGiorni(int numGiorni) {
		this.numGiorni = numGiorni;
	}
	public float getOrePerGiorno() {
		return orePerGiorno;
	}
	public void setOrePerGiorno(float orePerGiorno) {
		this.orePerGiorno = orePerGiorno;
	}
	public int getNumMaxStudenti() {
		return numMaxStudenti;
	}
	public void setNumMaxStudenti(int numMaxStudenti) {
		this.numMaxStudenti = numMaxStudenti;
	}
	public String getRequisitiMinimi() {
		return requisitiMinimi;
	}
	public void setRequisitiMinimi(String requisitiMinimi) {
		this.requisitiMinimi = requisitiMinimi;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getNumLezioniPerGiorno() {
		return numLezioniPerGiorno;
	}
	public void setNumLezioniPerGiorno(int numLezioniPerGiorno) {
		this.numLezioniPerGiorno = numLezioniPerGiorno;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public float getOreTrascorse() {
		return oreTrascorse;
	}
	public void setOreTrascorse(float oreTrascorso) {
		this.oreTrascorse = oreTrascorso;
	}
	public File getImmagineCorso() {
		return immagineCorso;
	}
	public void setImmagineCorso(File immagineCorso) {
		this.immagineCorso = immagineCorso;
	}
	public Lezione getLezioneCorrente() {
		return lezioneCorrente;
	}
	public void setLezioneCorrente(Lezione lezioneCorrente) {
		this.lezioneCorrente = lezioneCorrente;
	}
	
	
	
}