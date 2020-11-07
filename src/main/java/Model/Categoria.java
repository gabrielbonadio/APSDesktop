
package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Categoria {
    
    
    @SerializedName("idCategoria")
    @Expose
    private Integer idCategoria;
    
    @SerializedName("descr")
    @Expose
    private String descr;
   
    @SerializedName("img")
    @Expose
    private String img;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return descr;
    }
    
}
