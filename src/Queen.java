// Королева
public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (line == toLine || column == toColumn || Math.abs(line - toLine) == Math.abs(column - toColumn)) {
                int stepLine = Integer.compare(toLine, line);
                int stepColumn = Integer.compare(toColumn, column);
                int currentLine = line + stepLine, currentColumn = column + stepColumn;

                while (currentLine != toLine || currentColumn != toColumn) {
                    if (chessBoard.board[currentLine][currentColumn] != null) return false;
                    currentLine += stepLine;
                    currentColumn += stepColumn;
                }

                return chessBoard.board[toLine][toColumn] == null ||
                        !chessBoard.board[toLine][toColumn].getColor().equals(color);
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
