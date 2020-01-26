
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
public class ImageSizes{
    private String normal;
    private String small;
    private String large;
    private String png;
    private String art_crop;
    private String border_crop;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getArt_crop() {
        return art_crop;
    }

    public void setArt_crop(String art_crop) {
        this.art_crop = art_crop;
    }

    public String getBorder_crop() {
        return border_crop;
    }

    public void setBorder_crop(String border_crop) {
        this.border_crop = border_crop;
    }
    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }
    
    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }
    
}
