public class DFAexp {
    public static void main(String[] args) {
        String state = "q0";
        String input = "abbbabab";

        for (int x = 0; x < input.length(); x++) {
            if (state.equals("q0") && input.charAt(x) == 'a') {

                state = "q1";
            } else if (state.equals("q0") && input.charAt(x) == 'b') {

                state = "q0";
            } else if (state.equals("q1") && input.charAt(x) == 'a') {

                state = "q1";
            } else if (state.equals("q1") && input.charAt(x) == 'b') {

                state = "q0";
            } else {
                System.out.println("Invalid input.. Exiting automaton");
            }

        }
        // check if state is final state
        if (state.equals("q1")) {
            System.out.println("String accepted");
        } else {
            System.out.println("String not accepted");
        }
    }
}
