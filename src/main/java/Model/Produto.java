
package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Produto{
    
    @SerializedName("idProduto")
    @Expose
    private Integer idProduto;
       
    @SerializedName("idCategoria")
    @Expose
    private Integer idCategoria;
    
    @SerializedName("descricao")
    @Expose
    private String descricao;
    
    @SerializedName("preco")
    @Expose
    private Double preco;
    
    @SerializedName("img")
    @Expose
    private String img;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", idCategoria=" + idCategoria + 
                ", descricao=" + descricao + ", preco=" + preco + ", img=" + img + '}';
    }
    
    
}