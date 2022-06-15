package estructuras;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class MultiListas implements Serializable
{

    private static Nodo mov = null;

    public static Nodo inserta(Nodo r, Nodo n, int nivel, String etqs[])
    {
        if (nivel == etqs.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            ls.inserta(n);
            r = ls.getR();
            return r;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(inserta(aux.getAbj(), n, nivel + 1, etqs));
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el dato", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
            return r;
        }
    }

    public static Nodo elimina(Nodo r, int nivel, String etqs[])
    {
        if (nivel == etqs.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            Nodo aux = ls.eliminar(etqs[nivel]);
            mov = aux;
            if (aux == null)
            {
//                JOptionPane.showMessageDialog(null, "No se encontro el dato", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else
            {
                r = ls.getR();
            }
            return r;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(elimina(aux.getAbj(), nivel + 1, etqs));
            } else
            {
                System.out.println("No se encontro " + etqs[nivel] + " En el nivel " + nivel);
            }
            return r;
        }
    }

    public static Nodo mover(Nodo r, int nivel, String etqsE[], String etqsI[])
    {
        r = elimina(r, nivel, etqsE);
        if (mov != null)
        {
            r = inserta(r, mov, nivel, etqsI);
        }
        return r;
    }

    public static Nodo busca(Nodo r, String etq)
    {
        Nodo aux = null;
        while (r != null)
        {
            if (r.getEtq().equals(etq))
            {
                return r;
            } else
            {
                r = r.getSig();
            }
        }
        return aux;
    }

    public static int length(Nodo r, int nivel)
    {
        int len = 0;

        Nodo aux = r;
        while (aux != null)
        {
            len++;
            aux = aux.getSig();
        }

        return len;
    }

    public static Nodo buscarB(String bus, Nodo r)
    {
        Nodo encontrado = null;
        Nodo aux = r.getAbj();
        Nodo auxS = r;
        while (aux != null)
        {
            Object obj = (Object) aux.getObj();
            if (bus.compareTo(obj.toString()) == 0)
            {
                encontrado = aux;
                return encontrado;
            }
            aux = aux.getSig();
            if (aux == null)
            {
                if (auxS.getSig() != null)
                {
                    aux = auxS.getSig();
                    aux = aux.getAbj();
                    if (aux == null)
                    {
                        break;
                    } else
                    {
                        auxS = auxS.getSig();
                    }
                }
            }
        }

        return encontrado;
    }

    public static String desp(Nodo r, int nivel)
    {
        String s = "";

        if (r == null)
        {
            s = "No hay nada";
        } else
        {
            while (r != null)
            {
                String ss = "";
                for (int i = 0; i < nivel; i++)
                {
                    ss += "\t";
                }
                s += ss + "Nivel= " + String.valueOf(nivel) + "\n ";
                s += ss + r.getEtq() + "\n";
                s += desp(r.getAbj(), nivel + 1);
                r = r.getSig();
            }
        }
        return s;
    }
}
