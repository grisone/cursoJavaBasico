package cl.kibernum.objetos.paquete;

/**
 * Created by Kibernum on 17/05/2016.
 */
public class clase1 {

    {
        try{}catch(Exception e){}
    }

    public int mInt_Public;
    protected int mInt_Protected;
    int mInt_Package;
    private int mInt_Private;


    class claseHija{
        public void test(){
            clase1 c = new clase1();
            c.mInt_Private = 89;
        }
    }


}

