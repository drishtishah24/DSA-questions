
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);
        
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            
            //north
            if (direction == 'N') {
                y++;
            } 
            //south
            else if (direction == 'S') {
                y--;
            }
            //east
             else if (direction == 'E') {
                x++;
            }
            //west 
            else if (direction == 'W') {
                x--;
            }
            String currentPos = x + "," + y;
            
            // If the set already contains this key, the path has crossed itself
            if (visited.contains(currentPos)) {
                return true;
            }
            
            // Otherwise, document the visit by adding it to set
            visited.add(currentPos);
        }
        
        // If the path completes without any duplicates, it never crossed
        return false;
    }
}

