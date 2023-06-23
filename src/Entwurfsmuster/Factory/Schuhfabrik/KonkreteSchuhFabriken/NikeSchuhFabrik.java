package Entwurfsmuster.Factory.Schuhfabrik.KonkreteSchuhFabriken;

import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuh;
import Entwurfsmuster.Factory.Schuhfabrik.interfaces.ISchuhFabrik;

/**
 * NikeSchuhFabrik
 */
public class NikeSchuhFabrik implements ISchuhFabrik{

    @Override
    public ISchuh createSchuh(String typ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createSchuh'");
    }
    
}