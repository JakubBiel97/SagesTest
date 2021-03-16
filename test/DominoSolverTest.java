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
	
	@Test
    @DisplayName("Wrong input test")
    public void testWrongInput() {
        assertEquals("Spotted wrong character - cannot solve domino",
                dominoSolver.solve("/asd||"));
    }

    @Test
    @DisplayName("Ensure correct handling multiple iterations")
    public void testMultiplyIterations() {
        assertEquals("///", dominoSolver.solve("/||",2));
    }
	
	
}