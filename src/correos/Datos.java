package correos;

import estructuras.Nodo;
import estructuras.TablaHash;
import java.io.Serializable;

public class Datos  implements Serializable
{
    private Nodo contenido = null;
    private TablaHash[] niveles;

    public Datos(int n)
    {
        this.contenido = null;
        this.niveles = new TablaHash[3];
        this.niveles[0] = new TablaHash(27);
        this.niveles[1] = new TablaHash(27);
        this.niveles[2] = new TablaHash(27);
    }

    /**
     * @return the contenido
     */
    public Nodo getContenido()
    {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(Nodo contenido)
    {
        this.contenido = contenido;
    }

    /**
     * @return the niveles
     */
    public TablaHash[] getNiveles()
    {
        return niveles;
    }

    /**
     * @param niveles the niveles to set
     */
    public void setNiveles(TablaHash [] niveles)
    {
        this.niveles = niveles;
    }
    
    
}
