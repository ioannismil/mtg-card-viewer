
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
public class Legalities {
        private String standard;
        private String future;
        private String historic;
        private String pioneer;
        private String modern;
        private String legacy;
        private String pauper;
        private String vintage;
        private String penny;
        private String commander;
        private String brawl;
        private String duel;
        private String oldschool;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public String getPioneer() {
        return pioneer;
    }

    public void setPioneer(String pioneer) {
        this.pioneer = pioneer;
    }

    public String getModern() {
        return modern;
    }

    public void setModern(String modern) {
        this.modern = modern;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public String getPauper() {
        return pauper;
    }

    public void setPauper(String pauper) {
        this.pauper = pauper;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public String getPenny() {
        return penny;
    }

    public void setPenny(String penny) {
        this.penny = penny;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getBrawl() {
        return brawl;
    }

    public void setBrawl(String brawl) {
        this.brawl = brawl;
    }

    public String getDuel() {
        return duel;
    }

    public void setDuel(String duel) {
        this.duel = duel;
    }

    public String getOldschool() {
        return oldschool;
    }

    public void setOldschool(String oldschool) {
        this.oldschool = oldschool;
    }
    public String getAll(){
        return  " standard: " + getStandard()+
                "\n future: "+ getFuture()+
        "\n historic: "+ getHistoric()+
        "\n pioneer: "+ getPioneer()+
        "\n modern: "+ getModern()+
        "\n legacy: "+ getLegacy()+
        "\n pauper: "+ getPauper()+
        "\n vintage: "+ getVintage()+
        "\n penny: "+ getPenny()+
        "\n commander: "+ getCommander()+
        "\n brawl: "+ getBrawl()+
        "\n duel: "+ getDuel()+
        "\n oldschool: "+ getOldschool();
    }
}
