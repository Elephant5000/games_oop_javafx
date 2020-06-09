package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void whenCopyTest() {
        BishopBlack firstBishopBlack = new BishopBlack(Cell.A1);
        Figure secondBishopBlack = firstBishopBlack.copy(Cell.A2);
        assertThat(secondBishopBlack.position(), is(Cell.A2));
    }

    @Test
    public void whenWayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.A1, Cell.G5), is(expected));
    }
}