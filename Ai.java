package App.Tictactoe;

public class Ai {
    public static void main(String[] args) {
        Data data = new Data();

        String[][] Tiktaktoe = {
                {"#", "#", "#"},
                {"#", "#", "#"},
                {"X", "#", "X"}
        };
        boolean test = true;
        while (test) {
            String[][] tiktaktoe = new String[3][3];
            for (int i = 0 ; i <= Tiktaktoe.length-1;i++){
                for (int j = 0; j <= Tiktaktoe.length-1;j++){
                    tiktaktoe[i][j] = Tiktaktoe[i][j];
                }
            }
            makeAI(tiktaktoe,Tiktaktoe,data);
            for (String[] toktok : tiktaktoe){
                System.out.println();
                for (String tiktik : toktok){
                    System.out.print(tiktik+ " ");
                }
            }
            System.out.println();
            test = false;
        }
        for (String[] toktok : Tiktaktoe){
            System.out.println();
            for (String tiktik : toktok){
                System.out.print(tiktik+ " ");
            }
        }
    }
    public static boolean makeAI(String[][] tiktaktoe, String[][] Tiktaktoe, Data data){
        for (int i = 0; i <= tiktaktoe.length - 1; i++) {
            for (int j = 0; j <= tiktaktoe.length - 1; j++) {
                if (tiktaktoe[i][j].equals("#")) {
//                    System.out.println(i+" "+ j);
                        System.out.println(i+" "+j+" Hai\n");
                        if (data.win(Tiktaktoe)) {
                            tiktaktoe[i][j] = "X";
                            System.out.println(i + " " + j + " balo\n");
                            if (!data.win(tiktaktoe)) {
                                System.out.println(i + " " + j + " haloo\n");
                                Tiktaktoe[i][j] = "O";
                            }
                            if (j == 1 || j == 3) {
                                tiktaktoe[i][j] = "#";
                            }
                        }
                }
            }
        }
        return false;
    }
}
