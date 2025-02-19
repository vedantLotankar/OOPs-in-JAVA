class Room { 
    private double length; 
    private double breadth; 
 
    // Constructor for square room  
    public Room(double side) { 
        this.length = side; 
        this.breadth = side; 
    } 
 
    // Constructor for rectangular room  
    public Room(double length, double breadth) { 
        this.length = length; 
        this.breadth = breadth; 
    } 
 
    public double computeArea() { 
        return length * breadth; 
    } 
} 
 
public class Q4 { 
    public static void main(String[] args) { 
        Room squareRoom = new Room(5.0);  
        System.out.println("Area of the square room: " + squareRoom.computeArea() + " square units"); 
 
        Room rectangularRoom = new Room(4.0, 6.0);  
        System.out.println("Area of the rectangular room: " + rectangularRoom.computeArea() + " square units"); 
    } 
} 