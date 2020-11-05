
package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UsuarioLogar {
    @SerializedName("username")
    @Expose
    private String username;
    
    @SerializedName("senha")
    @Expose
    private String senha;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "UsuarioLogar{" + "username=" + username + ", senha=" + senha + '}';
    }
    
    
    
}
