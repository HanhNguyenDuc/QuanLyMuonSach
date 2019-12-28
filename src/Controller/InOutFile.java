/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileInputStream;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class InOutFile {
    public void writeFile(List list, String path){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Object o : list){
                oos.writeObject(o);
                
            }
            oos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(InOutFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readFile(List list, String path){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean cont = true;
            while (cont){
                Object o = ois.readObject();
                if (o != null){
                        list.add(o);
                }
                else{
                    cont = false;
                }
            }
            ois.close();
        } catch (Exception ex) {
            
        }
        
    }
}
