package soDePassagem.backendDevelopment.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "PUBLICO")
public class UserEntity {
    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "NOME")
    String nomeCompleto;
    @Column(name = "EMAIL")
    String email;

    public UserEntity(String nomeCompleto, String email) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public UserEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
