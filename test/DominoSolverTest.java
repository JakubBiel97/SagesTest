import kuba.interview.domino.DominoSolver;
import kuba.interview.domino.DominoSolverInt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DominoSolverTest {

	private static DominoSolverInt dominoSolver;

	@BeforeEach
    public void setUp() throws Exception {
        dominoSolver = new DominoSolver();
    }
   
	@Test
	@DisplayName("Simple domino solving")
	public void testSimpleDomino() {
		assertEquals("//|", dominoSolver.solve("/||"));
	}
}