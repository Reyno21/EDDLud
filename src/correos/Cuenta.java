package correos;

import java.io.Serializable;

public class Cuenta implements Serializable
{
    private String correo;
    private String contra;

    public Cuenta(String correo, String contrasenia)
    {
        this.correo = correo;
        this.contra = contrasenia;
    }
    /**
     * @return the correo
     */
    public String getCorreo()
    {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    /**
     * @return the contra
     */
    public String getContrasenia()
    {
        return contra;
    }

    /**
     * @param contrasenia the contra to set
     */
    public void setContrasenia(String contrasenia)
    {
        this.contra = contrasenia;
    }
}
