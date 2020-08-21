import java.util.ArrayList;

class Tsp{
   
    
    
    

    /**
     * Calculates the distance between two coordinates currently.
     * @param points - an array of coordinates
     * @param i
     * @param j
     * @return
     */
    
    public static double calcDistance(Location loc1, Location loc2){
        final double AVERAGE_RADIUS_OF_EARTH_KM = 6371;
        double distance;
        double distLon1 = loc1.getLongitude();
        double distLon2 = loc2.getLongitude();
        double distLat1 = loc1.getLatitude();
        double distLat2 = loc2.getLatitude();
        double distLon;
        double distLat;
        double a;
        double c;

        distLon = Math.abs((distLon2 - distLon1)) * Math.PI/180;
        distLat = Math.abs((distLat2 - distLat1)) * Math.PI/180;
        
        distLat1 = distLat1 * Math.PI/180;
        distLat2 = distLat2 * Math.PI/180;
        
        //System.out.println("distLon =" + distLon);
        //System.out.println("distLat =" + distLat);



        a = Math.pow(Math.sin(distLat / 2), 2) + Math.pow(Math.sin(distLon / 2), 2) * Math.cos(distLat1) * Math.cos(distLat2);
        //System.out.println("a =" + a);
        c = 2 * Math.asin(Math.sqrt(a));

        distance = AVERAGE_RADIUS_OF_EARTH_KM * c;




        return distance;
    }
    
    

    public static Route findShortestPath(Route routeInit){
        int iterations = 0;
        int improve = 0;
        Route bestRoute = routeInit;
        
        while(improve < 800) {
            
            
            
            for(int i = 1; i < bestRoute.size - 1; i++) {
                for(int k = i + 1; k < routeInit.size; k++) {
                    iterations++;
                    Route newRoute = bestRoute.swap(i, k);
                    
                    
                    double newRouteDist = newRoute.routeDistance();
                    double bestRouteDist = bestRoute.routeDistance();
                    
                    //RESET
                    if( newRouteDist < bestRouteDist ) {
                        improve = 0;
                        bestRoute = newRoute;
                    }
                    //System.out.println(bestRouteDist);
                }
            }
            
            
            
            improve++;
            //System.out.println("Iteration: " + iterations);
            //System.out.println("Improve: " + improve);
            
        }
        
        
        return bestRoute; 
    }

}