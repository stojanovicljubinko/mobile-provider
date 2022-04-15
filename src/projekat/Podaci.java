package projekat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class Podaci extends Object implements Serializable{
    
    private List<Provajder> lista;
    private static final long serialVersionUID = 1L;

    public Podaci(List<Provajder> lista) {
        this.lista = lista;
    }
    
    Podaci() {
    }
    public void dodaj(Provajder p) {
        this.lista.add(p);
    }
    public boolean daLiIDPostojiTrenutno(int identifikacioniBroj) {
        Iterator<Provajder> i = lista.iterator();
        while (i.hasNext()) {
            if (i.next().getId()== identifikacioniBroj) {
                return true;
            }
        }
        return false;
    }

    public List<Provajder> getLista() {
        return lista;
    }
    public void serijalizuj() throws IOException{
        JFileChooser jfc = new JFileChooser();
        jfc.showSaveDialog(jfc);
        String adr = jfc.getSelectedFile().getAbsolutePath();
        
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(adr));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.lista);
        oos.close();fos.close();  
    }
    
    public void desirijalizuj() throws FileNotFoundException, IOException, ClassNotFoundException{
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jfc);
        String adr = jfc.getSelectedFile().getAbsolutePath();
        
        FileInputStream fis = new FileInputStream(new File(adr));
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.lista =  (List<Provajder>) ois.readObject();
        ois.close();fis.close();             
    }
}
