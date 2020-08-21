
public class LinkedLocation {
    
    private final Location LOCATION;
    private LinkedLocation previous;
    private LinkedLocation next;
    
    
    public LinkedLocation(Location location) {
        this.LOCATION = location;
        this.previous = null;
        this.next = null;
            
    }
    
    
    public LinkedLocation(Location location, LinkedLocation previous, 
        LinkedLocation next) {
        this.LOCATION = location;
        this.next = next;
        this.previous = previous;
        
    }
    
    public Location getLocation() {
        return this.LOCATION;
    }
    
    public LinkedLocation getPrevious() {
        return this.previous;
    }
    
    public void setPrevious(LinkedLocation previous) {
        this.previous = previous;
    }
    
    public LinkedLocation getNext() {
        return this.next;       
    }
    
    public void setNext(LinkedLocation next) {
        this.next = next;
    }
}
