package org.itstep.lessons;

public class Cens {
    private String str;
    private String censoure;
    private String mat;

    public String Zam(String str, String censoure, String mat){
        this.str = str.replace(mat, censoure);
        return this.str;
    }

}
