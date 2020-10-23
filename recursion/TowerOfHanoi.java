package recursion;

public class TowerOfHanoi {

  public static void main(String[] args) {
    int n = 4;
    processTowerOfHanoi(n, 'A', 'B', 'C');
  }

  private static void processTowerOfHanoi(int n, char source, char aux, char destination) {

    if (n == 1) {
      System.out.println("Move " + n + " disk from " + source + " to " + destination);
      return;
    }

    processTowerOfHanoi(n - 1, source, destination, aux);
    System.out.println("Move " + n + " disk from " + source + " to " + destination);
    processTowerOfHanoi(n - 1, aux, source, destination);
  }

}
