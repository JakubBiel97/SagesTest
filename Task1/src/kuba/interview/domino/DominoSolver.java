package kuba.interview.domino;

public class DominoSolver implements DominoSolverInt {

    public String solve(String domino){
        return solve(domino, 1);
    }

    public String solve(String domino, int iterations) {
        StringBuilder sb = new StringBuilder(domino);

        for(int iter =0 ; iter < iterations; iter++){

            int length = sb.length();

            for (int i = 0; i < length; i++) {

                char c = sb.charAt(i);

                if(c == '|'){
                } else if (c == '/'){
                    if((i+1) < length && sb.charAt(i+1) == '|'){
                        sb.setCharAt(i+1, '/');
                        i++;
                    }
                } else if (c == '\\'){
                    if(i > 0 && sb.charAt(i-1) == '|'){
                        sb.setCharAt(i-1, '\\');
                    }
                } else {
                    return "Spotted wrong character - cannot solve domino";
                }
            }
        }
        return sb.toString();
    }

    public String reverseSolving(String domino){
        return reverseSolving(domino, 1);
    }

    public String reverseSolving(String domino, int iterations) {
        StringBuilder sb = new StringBuilder(domino);

        for(int iter = 0 ; iter < iterations; iter++){
            int length = sb.length();

            for (int i = 0; i < length; i++) {
                char c = sb.charAt(i);
                if(c == '|'){
                } else if (c == '/'){
                    while((i+1) < length && sb.charAt(i+1) == '/') {
                        i++;
                    }
                    sb.setCharAt(i, '|');
                } else if (c == '\\'){
                    sb.setCharAt(i, '|');
                    while((i+1) < length && sb.charAt(i+1) == '\\'){
                        i++;
                    }
                } else {
                    return "Spotted wrong character - cannot reverse solve domino";
                }
            }
        }
        return sb.toString();
    }
}
