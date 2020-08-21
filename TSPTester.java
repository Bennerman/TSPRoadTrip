import java.util.*;
class TSPTester{
    

    public static void main(String args[]){
        
        
        //Location location1 = new Location();
        //Location location2 = new Location();
        Location location3 = new Location("White House", 38.897696, -77.036519);
        //Location location4 = new Location();
        Location location5 = new Location("Grand Canyon", 36.587413, -112.131334);
        Location location6 = new Location("Rocky Mountains", 40.418420, -105.710521);
        Location location7 = new Location("Yosemite Park", 38.959803, -119.452580);
        Location location8 = new Location("San Hose", 37.342356, -121.890244);
        
        
        
    
        
        
        Route routeInit = new Route(location3);
        //routeInit.addDestination(location2);
        routeInit.addDestination(location3);
        //routeInit.addDestination(location4);
        routeInit.addDestination(location5);
        routeInit.addDestination(location6);
        routeInit.addDestination(location7);
        routeInit.addDestination(location8);
        int initDistance = routeInit.routeDistance();
        System.out.println(routeInit.toString());        
        System.out.println(initDistance);
        
        Route finalRoute = Tsp.findShortestPath(routeInit);
        
        int finalDist = finalRoute.routeDistance();
        System.out.println(finalRoute.toString());
        System.out.println(finalDist);




    }
}