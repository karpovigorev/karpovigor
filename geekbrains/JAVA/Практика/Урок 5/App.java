public class App {

  static int[][] getMap() {
    return new int[][] {
        { 00, 00, 00, 00, 00, 00, 00, 00 },
        { 00, 00, -1, 00, 00, 00, 00, 00 },
        { 00, 00, -1, 00, -1, 00, -1, 00 },
        { 00, 00, -1, 00, 00, 00, -1, 00 },
        { 00, 00, -1, 00, 00, 00, -1, 00 },
        { 00, -1, -1, -1, -1, -1, -1, 00 },
        { 00, 00, -1, 00, 00, 00, -1, 00 },
        { 00, 00, -1, 00, 00, 00, -1, 00 },
        { 00, 00, 00, 00, 00, 00, -1, 00 },
        { 00, 00, 00, 00, 00, 00, -1, 00 },
        { 00, 00, 00, 00, 00, 00, 00, 00 }
    };
  }

  static void pprint(int[][] m) {
    int rows = m.length;
    int colums = m[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colums; j++) {
        if (m[i][j] == -1)
          System.out.printf("%s", " @ ");
        else if (m[i][j] == -2)
          System.out.printf("%s", " # ");
        else
          System.out.printf("%s", "в–‘в–‘в–‘");

        // System.out.printf("%4d", m[i][j]);в–€
      }
      System.out.println();
    }
  }

  static void start(int[][] map, int x, int y) {
    map[x][y] = -2;
  }

  public static void main(String[] args) {
    int[][] map = getMap();
    start(map, 7, 4);
    pprint(map);
  }
}