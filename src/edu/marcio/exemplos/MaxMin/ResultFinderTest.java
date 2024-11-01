package edu.marcio.exemplos.MaxMin;

public class ResultFinderTest {
    public static void main(String[] args) {
        MaxFinder maxfinder = new MaxFinder();
        maxfinder.determineMax();

        MinFinder minFinder = new MinFinder();
        minFinder.determineMin();
    }
}
