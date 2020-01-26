
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prices {
    private String usd;
    private String usd_foil;
    private String eur;
    private String tix;

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getUsd_foil() {
        return usd_foil;
    }

    public void setUsd_foil(String usd_foil) {
        this.usd_foil = usd_foil;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getTix() {
        return tix;
    }

    public void setTix(String tix) {
        this.tix = tix;
    }
    
    

    
}
