package App.Tictactoe;

public class  Data {

    public boolean win(String[][] test){
        boolean win = true;
        String me = "X";
        if (me.equals(test[0][0]) && me.equals(test[1][1]) && me.equals(test[2][2])){
            win = false;
        }else if (me.equals(test[0][0]) && me.equals(test[0][1]) && me.equals(test[0][2])){
            win = false;
        }else if (me.equals(test[0][1]) && me.equals(test[1][1]) && me.equals(test[2][1])){
            win = false;
        }else if (me.equals(test[1][0]) && me.equals(test[1][1]) && me.equals(test[1][2])){
            win = false;
        }else if (me.equals(test[2][0]) && me.equals(test[2][1]) && me.equals(test[2][2])){
            win = false;
        }else if (me.equals(test[0][2]) && me.equals(test[1][2]) && me.equals(test[2][2])){
            win = false;
        }else if (me.equals(test[2][0]) && me.equals(test[1][1]) && me.equals(test[0][2])){
            win = false;
        }else if (me.equals(test[0][0]) && me.equals(test[1][0]) && me.equals(test[2][0])) {
            win = false;
        }
        return win;
    }
    public boolean winC(String[][] test){
        boolean win = true;
        String computer = "O";
        if (computer.equals(test[0][0]) && computer.equals(test[1][1]) && computer.equals(test[2][2])){
            win = false;
        }else if (computer.equals(test[0][0]) && computer.equals(test[0][1]) && computer.equals(test[0][2])){
            win = false;
        }else if (computer.equals(test[0][1]) && computer.equals(test[1][1]) && computer.equals(test[2][1])){
            win = false;
        }else if (computer.equals(test[1][0]) && computer.equals(test[1][1]) && computer.equals(test[1][2])){
            win = false;
        }else if (computer.equals(test[2][0]) && computer.equals(test[2][1]) && computer.equals(test[2][2])){
            win = false;
        }else if (computer.equals(test[0][2]) && computer.equals(test[1][2]) && computer.equals(test[2][2])){
            win = false;
        }else if (computer.equals(test[2][0]) && computer.equals(test[1][1]) && computer.equals(test[0][2])){
            win = false;
        }else if (computer.equals(test[0][0]) && computer.equals(test[1][0]) && computer.equals(test[2][0])) {
            win = false;
        }
        return win;
    }
    public void player(String[][] Tiktaktoe,int set){
        switch (set){
            case 1:
                Tiktaktoe[0][0] = "X";
                break;
            case 2:
                Tiktaktoe[0][1] = "X";
                break;
            case 3:
                Tiktaktoe[0][2] = "X";
                break;
            case 4:
                Tiktaktoe[1][0] = "X";
                break;
            case 5:
                Tiktaktoe[1][1] = "X";
                break;
            case 6:
                Tiktaktoe[1][2] = "X";
                break;
            case 7:
                Tiktaktoe[2][0] = "X";
                break;
            case 8:
                Tiktaktoe[2][1] = "X";
                break;
            case 9:
                Tiktaktoe[2][2] = "X";
                break;
            default:
                break;
        }
    }
    public boolean computer(String[][] Tiktaktoe, int OneC, int TwoC){
        boolean test;
        if (Tiktaktoe[OneC][TwoC].equals("X") || Tiktaktoe[OneC][TwoC].equals("O")){
            test = true;
        }else {
            Tiktaktoe[OneC][TwoC] = "O";
            test = false;
        }
        return test;
    }
//    public boolean ifWin(String[][] Tictak, int OneC, int TwoC,Data win){
//        if (Tictak == win){
//            Tictak[OneC][TwoC] = "O";
//        }
//    }
}
