class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"2", "3", "q", "4"}, {"6", "3", "2", "1"}, {"g", "r", "5", "3"}};

        try {
            methodeArray(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Массив должен быть [4] на [4]");

        }
        try {
            int result = getSumArray(array);
            System.out.println(result);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Неправильное значение массива");

        }

    }

    public static void methodeArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
    }

    public static int getSumArray(String[][] array) throws MyArrayDataException {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    counter = counter + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }

        return counter;
    }


}

class MyArraySizeException extends Exception {
}

class MyArrayDataException extends Exception {
}