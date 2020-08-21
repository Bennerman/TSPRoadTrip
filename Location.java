class Location implements Comparable<Location>{
    final String NAME;
    final double LATITUDE;
    final double LONGITUDE;

    public Location(String name, double lat, double lon){
        this.NAME = name;
        this.LATITUDE = lat;
        this.LONGITUDE = lon;
    }
    
    /**
     * Assign attached locations 
     * 
     * @param node - other location to be attached
     */ 
    
    public String getName(){
        return this.NAME;
    }

    public double getLatitude(){
        return this.LATITUDE;
    }

    public double getLongitude(){
        return this.LONGITUDE;
    }
    
    /**
     * Compares this cart with the specified object for order.
     * 
     * @return a negative integer, zero, or a positive integer as this cart has a cargo which is less
     *         than, equal to, or greater than the specified other cart's cargo.
     */
    @Override
    public int compareTo(Location other) {
      return NAME.compareTo(other.NAME);
    }
    
}