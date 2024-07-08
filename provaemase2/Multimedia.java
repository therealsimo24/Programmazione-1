package provaemase2;

import java.util.Objects;

/**
 *
 * @author therealsimo24
 */
public abstract class Multimedia implements Resizable{
    
    private String fileName;
    private char resolution;
    private boolean raw;

    public Multimedia(String fileName, char resolution, boolean raw) {
        this.fileName = fileName;
        this.resolution = resolution;
        this.raw = raw;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multimedia other = (Multimedia) obj;
        return Objects.equals(this.fileName, other.fileName);
    }

    @Override
    public String toString() {
        return "File multimediale, nome: "+ fileName + ", resolution: " + resolution + ", raw: " + raw + ". Di tipo ";
    }
    
    @Override
    public boolean checkQuality(){
        boolean conferma = false;
        
        if(this.raw == true && (this.resolution == 'e' || this.resolution == 'h')){
            
            conferma = true;
            return conferma;
            
        }else{
            return conferma;
        }
    }
    
    
}
