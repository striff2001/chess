// Ладья
public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (line != toLine && column != toColumn) return false;

            int step = (line != toLine) ? Integer.compare(toLine, line) : Integer.compare(toColumn, column);
            int currentLine = line, currentColumn = column;

            while (currentLine != toLine || currentColumn != toColumn) {
                currentLine += (line != toLine) ? step : 0;
                currentColumn += (column != toColumn) ? step : 0;

                if (currentLine == toLine && currentColumn == toColumn) {
                    return chessBoard.board[toLine][toColumn] == null ||
                            !chessBoard.board[toLine][toColumn].getColor().equals(color);
                }

                if (chessBoard.board[currentLine][currentColumn] != null) return false;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
