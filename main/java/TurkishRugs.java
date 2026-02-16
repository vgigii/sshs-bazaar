public class TurkishRugs {

    public static void main(String[] args) {

        System.out.println("PLAID");
        weave(plaid());

        System.out.println("DIAGONAL");
        weave(diagonal());

        System.out.println("VERTICAL");
        weave(vertical());

        System.out.println("HORIZONTAL");
        weave(horizontal());

        System.out.println("SOLID");
        weave(solid());
    }

    // Prints the 2D rug
    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // SOLID
    public static String[][] solid() {
        String[][] rug = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                rug[i][j] = "🔷";
            }
        }
        return rug;
    }

    // HORIZONTAL STRIPES
    public static String[][] horizontal() {
        String[][] rug = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if (i % 2 == 0) {
                    rug[i][j] = "⭐";
                } else {
                    rug[i][j] = "🔷";
                }
            }
        }
        return rug;
    }

    // VERTICAL STRIPES
    public static String[][] vertical() {
        String[][] rug = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if (j % 2 == 0) {
                    rug[i][j] = "⭐";
                } else {
                    rug[i][j] = "🔷";
                }
            }
        }
        return rug;
    }

    // DIAGONAL (repeating diagonal like photo)
    public static String[][] diagonal() {
        String[][] rug = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if ((i + j) % 2 == 0) {
                    rug[i][j] = "⭐";
                } else {
                    rug[i][j] = "🔷";
                }
            }
        }
        return rug;
    }

    // PLAID (crossed grid lines)
    public static String[][] plaid() {
        String[][] rug = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if (i % 3 == 0 || j % 3 == 0) {
                    rug[i][j] = "⭐";
                } else {
                    rug[i][j] = "🔷";
                }
            }
        }
        return rug;
    }
}

