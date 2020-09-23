# TSPRoadTrip
Calculates the best route for spontaneous road trips


This project uses the common 2 - opt switch algorithm frequently seen as a solution
to the Traveling Salesman Problem.

The 2 - opt switch simply takes two nodes and switches their next destinations.
For example (from WIKI):


 - A   B -             - A - B -
     ×         ==>
 - C   D -             - C - D -
 
 I calculated distances using the Haversine formula, though currently,
 you have to manually have to find the coordinates of your sight-seeing destinations/nodes.
 Hopefully i will fix this with geocoding in the future.
 
 

