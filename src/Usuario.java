import javax.persistence.*;

@Table(name="TB_USUARIOS")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "usuarioGenerator")
    @SequenceGenerator(name = "usuarioGenerator", sequenceName="SEQ_USUARIO" )
    private Integer id;
    @Column(name="TB_NOME")
    private String nome;
    @Column(name="USUARIO_EMAIL", length=60, nullable=false)
    private String email;
    @Column(length=25, unique = false)
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
