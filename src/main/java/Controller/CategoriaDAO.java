package Controller;

import Model.Categoria;
import Model.Produto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;

public class CategoriaDAO extends GenericDAO {

    public List<Categoria> getTodasCategorias() throws Exception {
        HttpResponse response = this.get("/categorias");
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Buscar a categoria");

        }
        return new Gson().fromJson(responseToString(response.getEntity()),
                new TypeToken<ArrayList<Categoria>>() {
                }.getType());

    }
}
