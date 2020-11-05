package Controller;

import Helper.URLConstant;
import Model.Usuario;
import Model.UsuarioLogar;
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public abstract class GenericDAO {

    private final HttpClient http;

    public GenericDAO() {
        this.http = HttpClientBuilder.create().build();
    }

    protected HttpResponse get(final String servico) {
        try {
            //Criação de um Cliente HTTP
            HttpClient cli = HttpClientBuilder.create().build();

            //Requisição
            HttpGet req = new HttpGet(URLConstant.ENDPOINT + servico);
            req.addHeader("Accept", "application/json");

            return cli.execute(req);

        } catch (IOException | ParseException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }
    }

    protected HttpResponse post(Object object, String servico) {
        try {
            HttpPost requisicao = new HttpPost(URLConstant.ENDPOINT + servico);
            requisicao.addHeader("Content-Type", "application/json");

            StringEntity se = new StringEntity(new Gson().toJson(object), "UTF-8");
            requisicao.setEntity((HttpEntity) se);

            return http.execute(requisicao);

        } catch (IOException | UnsupportedCharsetException | ParseException e) {

            e.printStackTrace();
            return null;
        }

    }

    protected String responseToString(HttpEntity entity) {

        String response = "";

        try {
            response = EntityUtils.toString(entity);
        } catch (IOException ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return response;
    }

}
