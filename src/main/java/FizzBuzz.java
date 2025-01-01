public class FizzBuzz {

    public String print(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Input must be between 1 and 100.");
        }

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (isFizz(i) && isBuzz(i)) {
                output.append("FizzBuzz");
            } else if (isFizz(i)) {
                output.append("Fizz");
            } else if (isBuzz(i)) {
                output.append("Buzz");
            } else {
                output.append(i);
            }
            if (i < n) {
                output.append(",");
            }
        }
        System.out.println(output);
        return output.toString();
    }

    public boolean isFizz(int n) {
        return n % 3 == 0;
    }

    public boolean isBuzz(int n) {
        return n % 5 == 0;
    }
}
