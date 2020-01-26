
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Miltiadous
 */
@JsonIgnoreProperties(ignoreUnknown = true)//used to ignore the attributes which are not used
public class ApiReturnMapper {
    private String name;
    private ImageSizes image_uris;
    private Legalities legalities;
    private Prices prices;

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }
    
    public Legalities getLegalities() {
        return legalities;
    }

    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }
    
    public ImageSizes getImage_uris() {
        return image_uris;
    }

    public void setImage_uris(ImageSizes image_uris) {
        this.image_uris = image_uris;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
