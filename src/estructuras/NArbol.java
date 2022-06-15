package estructuras;

import java.io.Serializable;

public class NArbol implements Serializable
{
    private String etq;
    private Object obj;
    private NArbol izq = null;
    private NArbol der = null;
    
    public NArbol(String etq, Object obj)
    {
        this.etq=etq;   
        this.obj=obj;
    }

    /**
     * @return the etq
     */
    public String getEtq()
    {
        return etq;
    }

    /**
     * @param etq the etq to set
     */
    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the izq
     */
    public NArbol getIzq()
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NArbol izq)
    {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NArbol getDer()
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NArbol der)
    {
        this.der = der;
    }
}
