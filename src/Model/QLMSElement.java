/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class QLMSElement implements Serializable{

    public int getBanDocID() {
        return banDocID;
    }

    public void setBanDocID(int banDocID) {
        this.banDocID = banDocID;
    }

    public int getSachID() {
        return sachID;
    }

    public void setSachID(int sachID) {
        this.sachID = sachID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    int banDocID, sachID, soLuong;

    public QLMSElement() {
        
    }

    public QLMSElement(int banDocID, int sachID, int soLuong) {
        this.banDocID = banDocID;
        this.sachID = sachID;
        this.soLuong = soLuong;
    }
    
}
