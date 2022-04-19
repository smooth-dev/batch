package com.websystique.springbatch;


import com.websystique.springbatch.model.Prelevement;
import org.springframework.batch.support.annotation.Classifier;


public class ExampleWriterRouteImpl {

    @Classifier
    public String classify(Prelevement extratEntry) {
        String x= extratEntry.getCode_produit();
        String type =  x.contains("76") ? "over76" : "under76";
        return type;
    }

}
