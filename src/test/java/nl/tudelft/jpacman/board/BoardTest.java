package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Basic implementation of unit.
 *
 * @author Danai Suwantanee
 */

public class BoardTest {
     /**
     * Creates a test for valid board
     */
    @Test
    void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);

        assertThat(board.invariant()).isTrue();
    }
     /**
     * Creates a test for valid board with null square
     */
    @Test
    void testBoardNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        Board board = new Board(grid);

        assertThat(board.invariant()).isFalse();
        assertThrows(NullPointerException.class, () -> board.squareAt(0, 0).getOccupants());
    }
}
