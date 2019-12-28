/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QLMS implements Serializable{
    BanDoc bandoc;
    ArrayList< Pair<Sach, Integer> > sachs;
    
    public QLMS(){
        
    }
    
    public QLMS(BanDoc bandoc){
        this.bandoc = bandoc;
        this.sachs = new ArrayList< Pair<Sach, Integer> >();
    }
    
    public void addSach(Sach sach){
        for (Pair <Sach, Integer> p : sachs){
            if (sach == p.getKey()){
                Integer sl = p.getValue();
                sl += 1;
                return ;
            }
        }
        this.sachs.add(new Pair<Sach, Integer>(sach, 1));
    }
    
    public BanDoc getBanDoc() {
        return bandoc;
    }

    public void setBanDoc(BanDoc BanDoc) {
        this.bandoc = BanDoc;
    }

    public ArrayList<Pair<Sach, Integer>> getSachs() {
        return sachs;
    }

    public void setSachs(ArrayList<Pair<Sach, Integer>> sachs) {
        this.sachs = sachs;
    }
    
    
    
}
