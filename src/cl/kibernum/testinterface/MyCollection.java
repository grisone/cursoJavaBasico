package cl.kibernum.testinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import static java.lang.System.out;
/**
 * Created by Kibernum on 24/05/2016.
 */

public class MyCollection {
    public static void main (String[] args){

        Collection c  = new ArrayList<>();
        List<String> mList = new ArrayList<>();


        for (String subcadena : mList){
            out.printf("%s \n", subcadena);
        }
    }
}
