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
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public abstract class GenericDAO {


    protected HttpResponse get(final String servico) {

        HttpGet requisicao = new HttpGet(URLConstant.ENDPOINT + servico);
        final CloseableHttpClient http = HttpClientBuilder.create().build();

        try {
            requisicao.addHeader("Accept", "application/json");

            return http.execute(requisicao);

        } catch (IOException | ParseException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } 
    }

    protected HttpResponse post(Object object, String servico) {

        HttpPost requisicao = new HttpPost(URLConstant.ENDPOINT + servico);
        final CloseableHttpClient http = HttpClientBuilder.create().build();
        
        try {
            requisicao.addHeader("Content-Type", "application/json");

            StringEntity se = new StringEntity(new Gson().toJson(object), "UTF-8");
            requisicao.setEntity((HttpEntity) se);

            return http.execute(requisicao);

        } catch (IOException | UnsupportedCharsetException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected HttpResponse put(Object object, String servico) {

        HttpPut requisicao = new HttpPut(URLConstant.ENDPOINT + servico);
        final CloseableHttpClient http = HttpClientBuilder.create().build();
        
        try {
            requisicao.addHeader("Content-Type", "application/json");

            StringEntity se = new StringEntity(new Gson().toJson(object), "UTF-8");
            requisicao.setEntity((HttpEntity) se);

            return http.execute(requisicao);

        } catch (IOException | UnsupportedCharsetException | ParseException e) {
            return null;
        }
    }

    protected HttpResponse delete(String servico, Integer idDeletado) {

        HttpDelete requisicao = new HttpDelete(URLConstant.ENDPOINT + servico + "/" + idDeletado);
        final CloseableHttpClient http = HttpClientBuilder.create().build();
        
        try {
            requisicao.addHeader("Content-Type", "application/json");
            return http.execute(requisicao);

        } catch (IOException | UnsupportedCharsetException | ParseException e) {
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
