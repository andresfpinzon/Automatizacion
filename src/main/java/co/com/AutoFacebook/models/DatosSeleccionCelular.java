package co.com.AutoFacebook.models;

public class DatosSeleccionCelular {
    private String usuarios;
    private String clave;
    private Integer valormin;
    private Integer valormax;

    public String getUsuario() {
        return usuarios;
    }

    public void setUsuario(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getValormin() {

        return valormin;
    }
    public void setValormin(Integer valormin) {

        this.valormin = valormin;
    }

    public Integer getValormax() {

        return valormax;
    }

    public void setValormax(Integer valormax) {

        this.valormax = valormax;
    }


    public DatosSeleccionCelular(String usuarios, String clave, Integer valormin, Integer valormax) {
        this.usuarios = usuarios;
        this.clave = clave;
        this.valormin = valormin;
        this.valormax = valormax;
    }
}
