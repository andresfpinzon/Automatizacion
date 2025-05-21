package co.com.AutoFacebook.models;

public class RangoValor {

    private Integer valormin;



    public Integer getValormax() {
        return valormax;
    }

    public void setValormax(Integer valormax) {
        this.valormax = valormax;
    }

    private Integer valormax;

    public Integer getValormin() {
        return valormin;
    }

    public void setValormin(Integer valormin) {
        this.valormin = valormin;
    }

    public RangoValor(Integer valormin, Integer valormax) {
        this.valormin = valormin;
        this.valormax = valormax;
    }


}
