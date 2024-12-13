import java.util.Comparator;

public class Arrays {
    private static void checkRange(int length, int fromIndex, int toIndex) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > length) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
    }
    // 1
    static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 2
    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 3
    static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 4
    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 5
    static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 6
    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 7
    static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 8
    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 9
    static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 10
    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 11
    static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 12
    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 13
    static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }
    // 14
    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
    // 15
    static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }
    // 16
    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        checkRange(a.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }
}
