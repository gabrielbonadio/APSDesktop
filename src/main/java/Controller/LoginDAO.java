
package Controller;


import Model.Usuario;
import Model.UsuarioLogar;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;

import org.apache.http.util.EntityUtils;


public class LoginDAO extends GenericDAO {
    
    
     public Usuario logar(UsuarioLogar usuarioLogar) throws Exception{
         
         HttpResponse response = this.post(usuarioLogar, "/logarUsuario");
         if(response.getStatusLine().getStatusCode() != 200){
             throw new Exception("Falha ao logar");
         }
         
         return new Gson().fromJson(EntityUtils.toString(response.getEntity()), Usuario.class);
     } 

      
   
}
