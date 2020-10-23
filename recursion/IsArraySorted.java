package recursion;

public class IsArraySorted {

  public static void main(String[] args) {
    int[] A = new int[]{1, 2, 4, 5, 6, 7};
    int result = isArraySorted(A, 0);
    System.out.println("IsArraySorted: " + (result == 1 ? "yes" : "no"));
  }

  private static int isArraySorted(int[] A, int index) {
    if (A.length == 1 || index >= A.length - 1) {
      return 1;
    }
    return (A[index] > A[index + 1]) ? 0 : isArraySorted(A, index + 1);
  }
}
