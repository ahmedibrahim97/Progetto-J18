package magazinestore.entity;
// Generated 27-apr-2019 19.55.30 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Rivista generated by hbm2java
 */
@Entity
@Table(name = "rivista", catalog = "magazinestoredb", uniqueConstraints = @UniqueConstraint(columnNames = "title"))
public class Rivista implements java.io.Serializable {

	private Integer revistaId;
	private Categoria categoria;
	private String title;
	private String author;
	private String description;
	private byte[] immagine;
	private String price;
	private Date publishDate;
	private Date lastUpdtaedTime;
	private Set<Recensione> recensiones = new HashSet<Recensione>(0);
	private Set<DettagliOrdine> dettagliOrdines = new HashSet<DettagliOrdine>(0);

	public Rivista() {
	}

	public Rivista(Categoria categoria, String title, String author, String description, byte[] immagine, String price,
			Date publishDate, Date lastUpdtaedTime) {
		this.categoria = categoria;
		this.title = title;
		this.author = author;
		this.description = description;
		this.immagine = immagine;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdtaedTime = lastUpdtaedTime;
	}

	public Rivista(Categoria categoria, String title, String author, String description, byte[] immagine, String price,
			Date publishDate, Date lastUpdtaedTime, Set<Recensione> recensiones, Set<DettagliOrdine> dettagliOrdines) {
		this.categoria = categoria;
		this.title = title;
		this.author = author;
		this.description = description;
		this.immagine = immagine;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdtaedTime = lastUpdtaedTime;
		this.recensiones = recensiones;
		this.dettagliOrdines = dettagliOrdines;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "revista_id", unique = true, nullable = false)
	public Integer getRevistaId() {
		return this.revistaId;
	}

	public void setRevistaId(Integer revistaId) {
		this.revistaId = revistaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", nullable = false)
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "title", unique = true, nullable = false, length = 128)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "author", nullable = false, length = 64)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "description", nullable = false, length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "immagine", nullable = false)
	public byte[] getImmagine() {
		return this.immagine;
	}

	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}

	@Column(name = "price", nullable = false, length = 45)
	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "publish_date", nullable = false, length = 10)
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updtaed_time", nullable = false, length = 19)
	public Date getLastUpdtaedTime() {
		return this.lastUpdtaedTime;
	}

	public void setLastUpdtaedTime(Date lastUpdtaedTime) {
		this.lastUpdtaedTime = lastUpdtaedTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rivista")
	public Set<Recensione> getRecensiones() {
		return this.recensiones;
	}

	public void setRecensiones(Set<Recensione> recensiones) {
		this.recensiones = recensiones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rivista")
	public Set<DettagliOrdine> getDettagliOrdines() {
		return this.dettagliOrdines;
	}

	public void setDettagliOrdines(Set<DettagliOrdine> dettagliOrdines) {
		this.dettagliOrdines = dettagliOrdines;
	}

}
