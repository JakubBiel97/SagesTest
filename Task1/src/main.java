import kuba.interview.domino.DominoSolver;
import kuba.interview.domino.DominoSolverInt;

public class main {
    public static void main(String[] args) {
        DominoSolverInt dominoSolver = new DominoSolver();

        String example  = "||//||\\||/\\|";
        System.out.println("Solution: " + dominoSolver.solve(example, 2));
		example = dominoSolver.solve(example, 2);
        System.out.println("Solution: " + dominoSolver.reverseSolving(example, 2));
    }
}
