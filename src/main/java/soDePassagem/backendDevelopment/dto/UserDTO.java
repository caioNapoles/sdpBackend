package soDePassagem.backendDevelopment.dto;


public class UserDTO {
    String nomeCompleto;
    String email;

    public UserDTO() {
    }

    public UserDTO(String nomeCompleto, String Email) {
        this.nomeCompleto = nomeCompleto;
        this.email = Email;
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
