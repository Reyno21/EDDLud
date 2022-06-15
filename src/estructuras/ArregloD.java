package estructuras;

public class ArregloD
{

    private String[] arr = null;

    public ArregloD()
    {
    }

    /**
     * @return the arr
     */
    public String[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(String[] arr)
    {
        this.arr = arr;
    }

    public int tamaño()
    {
        if (arr != null)
        {
            return arr.length;
        } else
        {
            return 0;
        }
    }

    public String get(int i)
    {
        return arr[i];
    }

    public void inserta(String nuevo)
    {
        if (arr == null)
        {
            arr = new String[1];
            arr[0] = nuevo;
        } else
        {
            String[] tmp = new String[arr.length + 1];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            tmp[arr.length] = nuevo;
            arr = tmp;
        }
    }

    public void eliminar(String eliminar)
    {
        if (arr != null)
        {
            if (arr.length == 1)
            {
                arr = null;
            } else
            {
                String[] tmp = new String[arr.length - 1];

                int index = 0;
                for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i].compareTo(eliminar) != 0)
                    {
                        tmp[index] = arr[i];
                        index++;
                    }
                }

                arr = tmp;
            }
        }
    }

    public String desp()
    {
        String s = "";
        if (arr != null)
        {
            for (String arr1 : arr)
            {
                s += arr1 + "\n";
            }
        }
        return s;
    }

    public boolean existe(String bus)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (bus.compareTo(arr[i]) == 0)
            {
                return true;
            }
        }
        return false;
    }

}
