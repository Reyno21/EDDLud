package correos;

import java.io.Serializable;

public class Correo implements Serializable
{
    private boolean estatus;
    private String destino;
    private String asunto;
    private String mensaje;

    public Correo(boolean estatus, String correoDestino, String asunto, String mensaje)
    {
        this.estatus = estatus;
        this.destino = correoDestino;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    /**
     * @return the estatus
     */
    public boolean isEstatus()
    {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(boolean estatus)
    {
        this.estatus = estatus;
    }

    /**
     * @return the destino
     */
    public String getCorreoDestino()
    {
        return destino;
    }

    /**
     * @param correoDestino the destino to set
     */
    public void setCorreoDestino(String correoDestino)
    {
        this.destino = correoDestino;
    }

    /**
     * @return the asunto
     */
    public String getAsunto()
    {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto)
    {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje()
    {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }

}
