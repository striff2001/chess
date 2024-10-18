// Пешка
public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (column == toColumn) {
                int dir = color.equals("White") ? 1 : -1;

                if (line + dir == toLine) {
                    return chessBoard.board[toLine][toColumn] == null;
                }

                if (line == 1 && color.equals("White") || line == 6 && color.equals("Black")) {
                    if (line + 2 * dir == toLine) {
                        return chessBoard.board[toLine][toColumn] == null &&
                                chessBoard.board[line + dir][column] == null;
                    }
                }
            } else {
                if ((column - toColumn == 1 || column - toColumn == -1) &&
                        (line - toLine == 1 || line - toLine == -1)) {
                    if (color.equals("White") && line < toLine ||
                            color.equals("Black") && line > toLine) {
                        if (chessBoard.board[toLine][toColumn] != null) {
                            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

}
