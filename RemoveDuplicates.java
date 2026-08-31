public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
