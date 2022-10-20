public abstract class Main {
    public static void main(String[] args) {   
    }

    public void solve_hanoi(int N, String from_peg, String  to_peg, String spare_peg) {
        if (N<1) {
            return;
        }
        if (N>1) {
            solve_hanoi(N-1, from_peg, spare_peg, to_peg);
        }
        System.out.println("move from " + from_peg + " to " + to_peg);
        if (N>1) {
            solve_hanoi(N-1, spare_peg, to_peg, from_peg);
        }
    }
}

// Complexidade: O(2^n)   Considerando a presença de 2 IFs recursivos
