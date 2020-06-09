package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void whenLegalBishopMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenIllegalBishopMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new PawnBlack(Cell.B2));
        boolean rsl = logic.move(Cell.A1, Cell.F6);
        assertThat(rsl, is(false));
    }
}