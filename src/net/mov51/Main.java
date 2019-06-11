package net.mov51;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        listRegionsByRadius(0, 0, 750);

    }
    public static void listRegionsByRadius(int x, int z, int radius ){
        int corner1X, corner2X, corner1Z, corner2Z; // initializing corner variables
        corner1X = corner1Z = x - radius; // setting x coordinate corner variables to account for radius
        corner2Z = corner2X = z + radius; // setting z coordinate corner variables to account for radius


        int corner1RegionX = getRegion(getChuck(corner1X)); // finding region positions for the 2 corners
        int corner1RegionZ = getRegion(getChuck(corner1Z)); // calling the get chunk method to return the chunk coordinates required for the getRegion method
        int corner2RegionX = getRegion(getChuck(corner2X));
        int corner2RegionZ = getRegion(getChuck(corner2Z));

        // calling the listRegionsByRectangle method after turning the radius and point coordinate into a rectangle
        listRegionsByRectangle(corner1RegionX, corner1RegionZ, corner2RegionX,corner2RegionZ );


    }
    public static void listRegionsByRectangle(int x1, int z1, int x2, int z2){
        // takes a predefined rectangle and lists all regions within that area
        int numberOfRegions = 0;
        for(int i = z1; i<=z2; i++) { // looping for the length between corner 1 and 2 z
            for(int j = x1; j<=x2; j++) { // looping for the length between corner 1 and 2 x

                numberOfRegions++; // counting the length of the new array for the region files

            }
        }

        String[] regionFiles = new String[numberOfRegions]; // array for the region files to be stored in
        int count = 0; // count for the array

        for(int i = z1; i<=z2; i++) { // looping for the length between corner 1 and 2 z
            for(int j = x1; j<=x2; j++) { // looping for the length between corner 1 and 2 x

                System.out.println("r." + i + "." + j + ".mca"); // printing formatted region file names
                regionFiles[count] = "r." + i + "." + j + ".mca"; // placing region files in array for further use
                count++; // adding 1 to the count int to cycle through the region files array
                //TODO send array to a method that can copy files from a world directory, first step is into an empty "temp" folder

            }
        }

        System.out.println(Arrays.toString(regionFiles)); // prints array for testing
    }

    public static int getChuck(int inputCord){
        return inputCord / 16;
        // takes input block coordinates and returns the chunk coordinates
    }
    public static int getRegion(int inputChunk){
        return (int)Math.floor(inputChunk / 32.0);
        // takes input chunk coordinates and returns the region file coordinates
    }
}
