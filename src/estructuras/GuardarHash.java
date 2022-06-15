package estructuras;

import java.io.Serializable;

public class GuardarHash implements Serializable
  {
    private Nodo r;
    //Iniciamos a  A en 0 y Z en 25, 0++
    private TablaHash arriba;

    public GuardarHash()
    {
        r = null;
        arriba = new TablaHash(27);
    }

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }

    /**
     * @return the arboles
     */
    public TablaHash getArriba()
    {
        return arriba;
    }

    /**
     * @param arboles the arboles to set
     */
    public void setArriba(TablaHash arboles)
    {
        this.arriba = arboles;
    }
    
  }
