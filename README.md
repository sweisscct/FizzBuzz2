 public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt(); // User inputs a number

        for (int num = 1; num <= limit; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

        scanner.close();
    }

     
