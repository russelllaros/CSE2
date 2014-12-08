import java.util.Scanner;

public class TTT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Welcome to a game of tic-tac-toe");
            String[][] show = game();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(show[i][j] + " ");
                }
                System.out.println();
            }
            getSpot(game());
        } while (again());

    }

    public static boolean again() {
        boolean check = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Go again? (enter 'yes' to continue, anything else to quit) ");
        String ans = scan.next();
        ans = ans.toUpperCase();
        if (!ans.equals("YES")) {
            check = false;
        }
        return check;
    }

    public static String[][] game() {
        String[][] game = new String[][]{{" ", "A", "B", "C"}, {"1", " ", " ", " "}, {"2", " ", " ", " "}, {"3", " ", " ", " "}};
        return game;
    }

    public static String[][] getSpot(String[][] game) {
        int winner = 0;
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int check3 = 0;
        String play = "";
        do {
            System.out.println("X's or O's (X's go first, O's second): ");
            String player = scan.next();
            player = player.toUpperCase();
            if (player.equals("X")) {

                play = "X";
            } else if (player.equals("O")) {

                play = "O";
            } else {
                System.out.println("Invalid. Try again");
                check3 = 1;
            }
        } while (check3 == 1);
        if ("X".equals(play)) {
            for (int i = 0; i < 5; i++) {
                if ("X".equals(checkWin(game))) {
                    winner = 1;
                    System.out.println("You Win!!");
                    break;
                } else if ("O".equals(checkWin(game))) {
                    winner = 1;
                    System.out.println("Computer Wins");
                    break;
                }
                System.out.println("Your Move");

                int check2 = 0;
                do {
                    int roww = 0;
                    int columnn = 0;
                    int check = 0;
                    do {
                        System.out.print("Row: ");
                        String row = scan.next();
                        check = 0;
                        if (row.equals("1")) {
                            roww = 1;
                        } else if (row.equals("2")) {
                            roww = 2;
                        } else if (row.equals("3")) {
                            roww = 3;
                        } else {
                            System.out.println("Invalid. Try again");
                            check = 1;
                        }
                    } while (check == 1);
                    do {
                        System.out.print("Column: ");
                        String column = scan.next();
                        column = column.toUpperCase();
                        check = 0;
                        if (column.equals("A")) {
                            columnn = 1;
                        } else if (column.equals("B")) {
                            columnn = 2;
                        } else if (column.equals("C")) {
                            columnn = 3;
                        } else {
                            System.out.println("Invalid. Try again");
                            check = 1;
                        }
                    } while (check == 1);
                    check2 = 0;
                    if (" ".equals(game[roww][columnn]) && !"O".equals(game[roww][columnn]) && !"X".equals(game[roww][columnn])) {
                        game[roww][columnn] = play;
                    } else {
                        System.out.println("Invalid. Try again");
                        check2 = 1;
                    }
                } while (check2 == 1);
                game = comp(game, play);
            }
        }
        if ("O".equals(play)) {
            for (int i = 0; i < 4; i++) {
                if ("O".equals(checkWin(game))) {
                    winner = 1;
                    System.out.println("You Win!!");
                    break;
                } else if ("X".equals(checkWin(game))) {
                    winner = 1;
                    System.out.println("Computer Wins");
                    break;
                }
                game = comp(game, play);
                System.out.println("Your Move");

                int check2 = 0;
                do {
                    int roww = 0;
                    int columnn = 0;
                    int check = 0;
                    do {
                        System.out.print("Row: ");
                        String row = scan.next();
                        check = 0;
                        if (row.equals("1")) {
                            roww = 1;
                        } else if (row.equals("2")) {
                            roww = 2;
                        } else if (row.equals("3")) {
                            roww = 3;
                        } else {
                            System.out.println("Invalid. Try again");
                            check = 1;
                        }
                    } while (check == 1);
                    do {
                        System.out.print("Column: ");
                        String column = scan.next();
                        column = column.toUpperCase();
                        check = 0;
                        if (column.equals("A")) {
                            columnn = 1;
                        } else if (column.equals("B")) {
                            columnn = 2;
                        } else if (column.equals("C")) {
                            columnn = 3;
                        } else {
                            System.out.println("Invalid. Try again");
                            check = 1;
                        }
                    } while (check == 1);
                    check2 = 0;

                    if (" ".equals(game[roww][columnn]) || !"O".equals(game[roww][columnn]) || !"X".equals(game[roww][columnn])) {
                        game[roww][columnn] = play;
                    } else {
                        System.out.println("Invalid. Try again");
                        check2 = 1;
                    }

                } while (check2 == 1);
            }
            
        }
        if ("O".equals(checkWin(game)) && winner == 0) {
            System.out.println("You Win!!");
        } else if ("X".equals(checkWin(game)) && winner == 0) {
            System.out.println("Computer Wins");
        }
        return game;
    }

    public static String[][] comp(String[][] game, String player) {
        int check2 = 0;
        String move = "";
        do {
            int rand1 = (int) (Math.random() * 3 + 1);
            int rand2 = (int) (Math.random() * 3 + 1);
            check2 = 0;
            if ("O".equals(player)) {
                move = "X";
            } else if ("X".equals(player)) {
                move = "O";
            }

            if (" ".equals(game[rand1][rand2]) && !"O".equals(game[rand1][rand2]) && !"X".equals(game[rand1][rand2])) {
                game[rand1][rand2] = move;
            } else {
                check2 = 1;
            }
        } while (check2 == 1);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
        return game;
    }

    public static String checkWin(String[][] game) {
        String winner = " ";
        if ("X".equals(game[1][1]) && "X".equals(game[1][2]) && "X".equals(game[1][3])) {
            winner = "X";
        } else if ("X".equals(game[2][1]) && "X".equals(game[2][2]) && "X".equals(game[2][3])) {
            winner = "X";
        } else if ("X".equals(game[3][1]) && "X".equals(game[3][2]) && "X".equals(game[3][3])) {
            winner = "X";
        } else if ("X".equals(game[1][1]) && "X".equals(game[2][1]) && "X".equals(game[3][1])) {
            winner = "X";
        } else if ("X".equals(game[1][2]) && "X".equals(game[2][2]) && "X".equals(game[3][2])) {
            winner = "X";
        } else if ("X".equals(game[1][3]) && "X".equals(game[2][3]) && "X".equals(game[3][3])) {
            winner = "X";
        } else if ("X".equals(game[1][1]) && "X".equals(game[2][2]) && "X".equals(game[3][3])) {
            winner = "X";
        } else if ("X".equals(game[1][3]) && "X".equals(game[2][2]) && "X".equals(game[3][1])) {
            winner = "X";
        }

        if ("O".equals(game[1][1]) && "O".equals(game[1][2]) && "O".equals(game[1][3])) {
            winner = "O";
        } else if ("O".equals(game[2][1]) && "O".equals(game[2][2]) && "O".equals(game[2][3])) {
            winner = "O";
        } else if ("O".equals(game[3][1]) && "O".equals(game[3][2]) && "O".equals(game[3][3])) {
            winner = "O";
        } else if ("O".equals(game[1][1]) && "O".equals(game[2][1]) && "O".equals(game[3][1])) {
            winner = "O";
        } else if ("O".equals(game[1][2]) && "O".equals(game[2][2]) && "O".equals(game[3][2])) {
            winner = "O";
        } else if ("O".equals(game[1][3]) && "O".equals(game[2][3]) && "O".equals(game[3][3])) {
            winner = "O";
        } else if ("O".equals(game[1][1]) && "O".equals(game[2][2]) && "O".equals(game[3][3])) {
            winner = "O";
        } else if ("O".equals(game[1][3]) && "O".equals(game[2][2]) && "O".equals(game[3][1])) {
            winner = "O";
        }
        return winner;

    }

}
