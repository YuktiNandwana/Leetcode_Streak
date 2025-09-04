public class FindClosestPerson {
    
    // method to find closest person
    public int find_closest_person(int x, int y, int z) {
        int distanceFromPerson1 = Math.abs(x - z);
        int distanceFromPerson2 = Math.abs(y - z);

        if (distanceFromPerson1 == distanceFromPerson2) {
            return 0; // both are equal distance
        } else if (distanceFromPerson1 < distanceFromPerson2) {
            return 1; // person 1 closer
        } else {
            return 2; // person 2 closer
        }
    }

    // main method
    public static void main(String[] args) {
        FindClosestPerson sol = new FindClosestPerson();

        System.out.println(sol.find_closest_person(1, 2, 3));  // output: 2
        System.out.println(sol.find_closest_person(5, 9, 7));  // output: 0
        System.out.println(sol.find_closest_person(10, 2, 6)); // output: 0
    }
}
