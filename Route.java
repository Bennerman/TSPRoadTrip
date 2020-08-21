
public class Route {
    
    private LinkedLocation head;
    private LinkedLocation tail;
    public int size;
    private int capacity;
    
    
    public Route(Location head) {
        LinkedLocation startLocation = new LinkedLocation(head);
        this.capacity = 20;       
        this.head = startLocation;
        this.tail = startLocation;
        size++;
    }
    
    public void addDestination(Location newObject) throws IllegalArgumentException {
        LinkedLocation newNode = new LinkedLocation(newObject);
        LinkedLocation currLocation = this.head;
        
        if(this.size == this.capacity) {
            throw new IllegalArgumentException("Cannot add another destination");
        }
        else {
            if(size > 1) {
                for(int i = 1; i < size; i++) {
                    currLocation = currLocation.getNext();                   
                }
                
                
            }
            currLocation.setNext(newNode);
            newNode.setPrevious(currLocation);
            newNode.setNext(this.head);
            this.tail = newNode;
            this.head.setPrevious(this.tail);
            size++;            
            
        }
        
        
        
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    
    }
    
    public int routeDistance() {
        int totalDist = 0;
        LinkedLocation currLocation = this.head;
        
        for(int i = 0; i < size; i++) {
            totalDist += Tsp.calcDistance(currLocation.getLocation(), 
                currLocation.getNext().getLocation());
            currLocation = currLocation.getNext();
        }
        
        
        return totalDist; 
        
    }
    
    public LinkedLocation getNode(int j) {
       
        LinkedLocation currLocation = this.head;
        
        for(int i = 0; i < j; i++  ) {
           currLocation = currLocation.getNext();
        }
        
        
        return currLocation;
    }
    
    public Route swap(int i, int j) {
         Route newRoute = new Route(this.head.getLocation());
         LinkedLocation currLocation = this.head;
         
         //step one
         for(int k = 1; k < i ; ++k) {
             currLocation = this.head;
             for(int m = 0; m < k; m++) {
                 currLocation = currLocation.getNext();
             }
             newRoute.addDestination(currLocation.getLocation());
         }
         
         //step 2
         for(int k = j; k > i - 1; k--) {
             currLocation = this.head;
             for(int m = 0; m < k ; m++) {
                 currLocation = currLocation.getNext();
             }
             newRoute.addDestination(currLocation.getLocation());
         }
         
         //step 3
         for(int k = j + 1; k < this.size; k++) {
             currLocation = this.head;
             for(int m = 0; m < k; m++) {
                 currLocation = currLocation.getNext();
             }
             newRoute.addDestination(currLocation.getLocation());
         }
        
         return newRoute;
    }
    
    public String toString() {
        String string = "This route contains " + this.size + " destinations \n";
        
        if (size == 0) {
            return string;
        }
        int i = 0;
        LinkedLocation currLocation = this.head;
        
        while(i < size) {
            string += currLocation.getLocation().getName() + ", ";
            currLocation = currLocation.getNext();
            i++;
        }
        
        return string;
        
        
        
        
    }
    
    
    
    
    
    
    
}
    
