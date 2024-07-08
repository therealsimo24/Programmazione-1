package provaemase2;

/**
 *
 * @author therealsimo24
 */
public class Image extends Multimedia {
    
    private int xPixel;
    private int yPixel;

    public Image(int xPixel, int yPixel, String fileName, char resolution, boolean raw) {
        super(fileName, resolution, raw);
        this.xPixel = xPixel;
        this.yPixel = yPixel;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Image, avente pixel X: "+ xPixel + " e pixel Y: "+ yPixel;
    }
    
    @Override
    public void resize(int percentage) throws IllegalArgumentException{
        
        if(percentage <= 0 || percentage >= 100) {
          
            throw new IllegalArgumentException();
            
        }else{
        //modifica pixel x
        int modificax = 0;
        modificax = (xPixel * percentage)/ 100;
        xPixel = xPixel-modificax;
        
        //modifica pixel y
        int modificay = 0;
        modificay = (yPixel * percentage)/ 100;
        yPixel = yPixel-modificay;
        }
        
        
    }
    
    
}
