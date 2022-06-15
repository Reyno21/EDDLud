package estructuras;

import java.io.Serializable;

public class TablaHash implements Serializable
{

    private ArbolBinario[] Tbl;

    /**
     * @return the Tbl
     */
    public ArbolBinario[] getTbl()
    {
        return Tbl;
    }

    /**
     * @param Tbl the Tbl to set
     */
    public void setTbl(ArbolBinario[] Tbl)
    {
        this.Tbl = Tbl;
    }

    public TablaHash(int n)
    {
        Tbl = new ArbolBinario[n];
        for (int i = 0; i < n; i++)
        {
            Tbl[i] = new ArbolBinario(); //Crea un arbol bin * elemento
        }
    }

    public int Place(char c)
    {
        int Indice = -1;
        
        if (c >= 97 && c <= 122)
        {
            c = (char) (c - 32);
        }
        if (c >= 65 && c <= 90)
        {
            Indice = c - 65;
        } else
        {
            if (c == 209 || c == 241)
            {
                Indice = 26;
            }
        }
        return Indice;//Ligar de la letra
    }

    public ArbolBinario getTablaPosicion(int n)
    {
        return Tbl[n];
    }

    public void Insertar(String Etq, NArbol New)//ETq de la persona para insertar
    {
        char Car = Etq.charAt(0);
        int Place = Place(Car);
        if (Place == -1)//Inserta el n a su lugar
        {

        } else
        {
            Tbl[Place].setR(Tbl[Place].inserta(Tbl[Place].getR(), New));
        }
    }

    public void Eliminar(String Etq)//Etq persona que se va a eliminar
    {
        char Car = Etq.charAt(0);
        int Place = Place(Car);
        if (Place == -1)
        {

        } else//Se borra 
        {
            NArbol[] arr = new NArbol[2];  //POR QUE EMPIEZA EN [2]??
            //0 retorna lo eliminado, en el 1 retorna la raiz sin el elemento 
            Tbl[Place].elimina(Tbl[Place].getR(), Etq, arr);
            Tbl[Place].setR(arr[1]);
        }
    }

    public NArbol Busqueda(String Etq)
    {
        char Car = Etq.charAt(0);
        int Place = Place(Car);
        if (Place == -1)
        {
            return null;
        } else
        {
            //System.out.println(Tbl[Place]);
            if (Tbl[Place] != null)
            {
                NArbol encontrado = Tbl[Place].busqueda(Tbl[Place].getR(), Etq);
                return encontrado;
            } else
            {
                return null;
            }
        }
    }

}
