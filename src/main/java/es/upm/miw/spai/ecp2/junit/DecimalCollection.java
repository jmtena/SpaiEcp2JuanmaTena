package es.upm.miw.spai.ecp2.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    
    public double amplitud(){
    	double max = Collections.max(collection);
    	double min = Collections.min(collection);
    	return max-min;
    }
    
    
    public double media() 
    {
        double media = 0.0;
        for (Double number : this.collection) 
        {
            media += number;
        }
        media = media / this.collection.size();
        return media;
    }

}
