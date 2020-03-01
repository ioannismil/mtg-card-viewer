
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
    public String getLegal(){
        String output="";
        if(getStandard().equals("legal"))
            output+="Standard \n";
        if(getFuture().equals("legal"))
            output+="Future \n";
        if(getHistoric().equals("legal"))
            output+="Historic \n";
        if(getPioneer().equals("legal"))
            output+="Pioneer \n";
        if(getModern().equals("legal"))
            output+="Modern \n";
        if(getLegacy().equals("legal"))
            output+="Legacy \n";
        if(getPauper().equals("legal"))
            output+="Pauper \n";
        if(getVintage().equals("legal"))
            output+="Vintage \n";
        if(getPenny().equals("legal"))
            output+="Penny \n";
        if(getCommander().equals("legal"))
            output+="Commander \n";
        if(getBrawl().equals("legal"))
            output+="Brawl \n";
        if(getDuel().equals("legal"))
            output+="Duel \n";
        if(getOldschool().equals("legal"))
            output+="Oldschool \n";
        return output;
    }
        public String getNotLegal(){
        String output="";
        if(getStandard().equals("not_legal"))
            output+="Standard \n";
        if(getFuture().equals("not_legal"))
            output+="Future \n";
        if(getHistoric().equals("not_legal"))
            output+="Historic \n";
        if(getPioneer().equals("not_legal"))
            output+="Pioneer \n";
        if(getModern().equals("not_legal"))
            output+="Modern \n";
        if(getLegacy().equals("not_legal"))
            output+="Legacy \n";
        if(getPauper().equals("not_legal"))
            output+="Pauper \n";
        if(getVintage().equals("not_legal"))
            output+="Vintage \n";
        if(getPenny().equals("not_legal"))
            output+="Penny \n";
        if(getCommander().equals("not_legal"))
            output+="Commander \n";
        if(getBrawl().equals("not_legal"))
            output+="Brawl \n";
        if(getDuel().equals("not_legal"))
            output+="Duel \n";
        if(getOldschool().equals("not_legal"))
            output+="Oldschool \n";
        return output;
    }
    public String getAll(){
        return  "standard: " + getStandard()+
                "\n future: "+ getFuture()+
        "\nhistoric: "+ getHistoric()+
        "\npioneer: "+ getPioneer()+
        "\nmodern: "+ getModern()+
        "\nlegacy: "+ getLegacy()+
        "\npauper: "+ getPauper()+
        "\nvintage: "+ getVintage()+
        "\npenny: "+ getPenny()+
        "\ncommander: "+ getCommander()+
        "\nbrawl: "+ getBrawl()+
        "\nduel: "+ getDuel()+
        "\noldschool: "+ getOldschool();
    }
}
