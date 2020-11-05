
package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Usuario {
    
    @SerializedName("idUsuario")
    @Expose
    private Integer idUsuario;
    
    @SerializedName("nome")
    @Expose
    private String nome;
    
    @SerializedName("username")
    @Expose
    private String username;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
}
