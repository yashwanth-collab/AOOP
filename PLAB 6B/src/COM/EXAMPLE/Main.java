package COM.EXAMPLE;

public class Main {
    public static void main(String[] args) {
        // Test the implementation
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};

        IntegerMinMax intMinMax = new IntegerMinMax();
        FloatMinMax floatMinMax = new FloatMinMax();
        CharacterMinMax charMinMax = new CharacterMinMax();
        StringMinMax stringMinMax = new StringMinMax();

        System.out.println("Max Integer: " + intMinMax.findMax(intArray));
        System.out.println("Min Integer: " + intMinMax.findMin(intArray));

        System.out.println("Max Float: " + floatMinMax.findMax(floatArray));
        System.out.println("Min Float: " + floatMinMax.findMin(floatArray));

        System.out.println("Max Character: " + charMinMax.findMax(charArray));
        System.out.println("Min Character: " + charMinMax.findMin(charArray));

        System.out.println("Max String: " + stringMinMax.findMax(stringArray));
        System.out.println("Min String: " + stringMinMax.findMin(stringArray));
    }
}