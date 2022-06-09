package Models;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    long id;
    @Column(name ="artista")
    String nombreDelArtista;
    @Column(name = "genero")
    String generoLiterario;
    @Column(name = "pais")
    String pais;
    @Column (name = "precio")
    long precio;
    @Column (name = "tipo")
    String tipoDeLibro;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getTipoDeLibro() {
        return tipoDeLibro;
    }

    public void setTipoDeLibro(String tipoDeLibro) {
        this.tipoDeLibro = tipoDeLibro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreDelArtista() {
        return nombreDelArtista;
    }

    public void setNombreDelArtista(String nombreDelArtista) {
        this.nombreDelArtista = nombreDelArtista;
    }
}
