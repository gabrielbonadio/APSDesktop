package Controller;

import Model.Produto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;

public class ProdutoDAO extends GenericDAO {

    public List<Produto> getTodosProdutos() throws Exception {
        HttpResponse response = this.get("/produtos");
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Buscar Produtos");
        }
        return new Gson().fromJson(responseToString(response.getEntity()),
                new TypeToken<ArrayList<Produto>>() {
                }.getType());
    }
    
    public Produto getProdutoById(Integer idProduto) throws Exception {
        HttpResponse response = this.get("/produto/"+idProduto);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Buscar Produto");
        }
        return new Gson().fromJson(responseToString(response.getEntity()),Produto.class);
    }

    public void novoProduto(Produto produto) throws Exception {
        HttpResponse response = this.post(produto, "/produto");
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Buscar Produtos");
        }
    }
    
    public void alterarProduto(Produto produto) throws Exception{
        HttpResponse response = this.put(produto, "/produto");
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Atualizar Produtos");
        }
    }
    
    public void deletarProduto(Integer idProduto) throws Exception{
        HttpResponse response = this.delete("/produto",idProduto);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new Exception("Falha ao Deletar Produtos");
        }
    }
}
