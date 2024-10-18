public abstract class ChessPiece {
    String color;
    Boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();  // возвращает тип фигуры

    protected boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
