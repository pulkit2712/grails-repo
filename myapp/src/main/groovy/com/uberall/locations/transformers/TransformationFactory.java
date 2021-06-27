package com.uberall.locations.transformers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationFactory {
    static TransformationFactory tFactory;
   static{
       tFactory=new TransformationFactory();
   }

    public  static OutputTransformer getTransformer(String Key) throws Exception {
        OutputTransformer t=null;
        switch(Key){
            case "LOCATION":
                t= new LocationOutputTransformer();
                break;
            default:
                throw new Exception("Transformer Not Found");


        }
        return t;

    }
}
