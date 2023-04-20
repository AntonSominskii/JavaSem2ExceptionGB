class StringValidator {
    public static void validateInput(String input) throws Exception {
        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя.");
        }
    }

    public static void processInput(String input) {
        try {
            validateInput(input);
            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}