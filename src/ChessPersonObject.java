/**
 * Created by sachin on 7/4/16.
 */
public class ChessPersonObject {

    String IDcode;
    String Name;
    String T;
    String WT;
    String OT;
    String Fed;
    String Rtg;
    String Rpd;
    String Blz;
    String N;
    String B_Year;
    String s;
    String F;

    public ChessPersonObject(String IDcode, String name, String t, String WT, String OT, String fed, String rtg, String rpd, String blz, String n, String b_Year, String s, String f) {
        this.IDcode = IDcode;
        Name = name;
        T = t;
        this.WT = WT;
        this.OT = OT;
        Fed = fed;
        Rtg = rtg;
        Rpd = rpd;
        Blz = blz;
        N = n;
        B_Year = b_Year;
        this.s = s;
        F = f;
    }

    public String getIDcode() {
        return IDcode;
    }

    public void setIDcode(String IDcode) {
        this.IDcode = IDcode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getT() {
        return T;
    }

    public void setT(String t) {
        T = t;
    }

    public String getWT() {
        return WT;
    }

    public void setWT(String WT) {
        this.WT = WT;
    }

    public String getOT() {
        return OT;
    }

    public void setOT(String OT) {
        this.OT = OT;
    }

    public String getFed() {
        return Fed;
    }

    public void setFed(String fed) {
        Fed = fed;
    }

    public String getRtg() {
        return Rtg;
    }

    public void setRtg(String rtg) {
        Rtg = rtg;
    }

    public String getRpd() {
        return Rpd;
    }

    public void setRpd(String rpd) {
        Rpd = rpd;
    }

    public String getBlz() {
        return Blz;
    }

    public void setBlz(String blz) {
        Blz = blz;
    }

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

    public String getB_Year() {
        return B_Year;
    }

    public void setB_Year(String b_Year) {
        B_Year = b_Year;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }
}
