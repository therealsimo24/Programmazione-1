package provaemase2;

/**
 *
 * @author therealsimo24
 */
public class Video extends Multimedia{
    
    private int numFrames;

    public Video(int numFrames, String fileName, char resolution, boolean raw) {
        super(fileName, resolution, raw);
        this.numFrames = numFrames;
    }

    public int getNumFrames() {
        return numFrames;
    }

    public void setNumFrames(int numFrames) {
        this.numFrames = numFrames;
    }

    
    
    @Override
    public void resize(int percentage) throws IllegalArgumentException{
        
        if(percentage <= 0 || percentage >= 100){
            
            throw new IllegalArgumentException();
            
        }else{
            
        int modifica = 0;
        modifica = (numFrames * percentage)/ 100;
        
        numFrames = numFrames - modifica;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Video, avente numero frames: "+numFrames;
    }
    
    
    
    
    
}
