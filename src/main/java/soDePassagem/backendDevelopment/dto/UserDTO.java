package soDePassagem.backendDevelopment.dto;


public class UserDTO {
    String nomeCompleto;
    String eMail;

    public UserDTO() {
    }

    public UserDTO(String nomeCompleto, String eMail) {
        this.nomeCompleto = nomeCompleto;
        this.eMail = eMail;
    }
}
