public class DFA {
    public static void main(String[] args) {
        String input = "01";

        if (StateChecking(input) == true) {
            System.out.println(input + " Input is accepted! ");
        } else {
            System.out.println(input + " Input is not accepted! ");
        }
    }

    public static boolean StateChecking(String input) {
        String state = "Q0";

        for (int x = 0; x < input.length(); x++) {
            if (state.equals("Q0")) {
                if (input.charAt(x) == '0') {
                    state = "Q1";
                } else if (input.charAt(x) == '1') {
                    state = "Q2";
                } else {
                    return false;
                }
            } else if (state.equals("Q1")) {
                if (input.charAt(x) == '0') {
                    state = "Q0";
                } else if (input.charAt(x) == '1') {
                    state = "Q2";
                } else {
                    return false;
                }
            } else if (state.equals("Q2")) {
                if (input.charAt(x) == '0') {
                    state = "Q1";
                } else if (input.charAt(x) == '1') {
                    state = "Q0";
                } else {
                    return false;
                }
            }
        }

        return state.equals("Q2");
    }
}
