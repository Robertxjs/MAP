public class Aufgabe3 {
    public int[] arraySum(int[] a, int[] b) {
        int[] result = new int[a.length + 1];
        int extra = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] + b[i] + extra > 9) {
                result[i + 1] = (a[i] + b[i] + extra) % 10;
                extra = 1;
            } else {
                result[i + 1] = a[i] + b[i] + extra;
                extra = 0;
            }
        }
        if (extra == 1) {
            result[0] = 1;
            return result;
        } else {
            int[] trimmedResult = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                trimmedResult[i] = result[i + 1];
            }
            return trimmedResult;
        }
    }

    public int[] arrayDiff (int[] a, int[] b) {
        int[] result = new int[a.length];
        int extra = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] - b[i] - extra < 0) {
                result[i] = (a[i] - b[i] - extra + 10);
                extra = 1;
            } else {
                result[i] = a[i] - b[i] - extra;
                extra = 0;
            }
        }

        int i = 0;
        int ct0 = 0;
        while (result[i] == 0) {
            ct0++;
            i++;
        }

        if (ct0 == 0) {
            return result;
        } else {
            int[] trimmedResult = new int[a.length - ct0];
            for (int j = 0; j < trimmedResult.length; j++) {
                trimmedResult[j] = result[j + ct0];
            }
            return trimmedResult;
        }
    }

    public int[] arrayMull(int[] a, int b) {
        int[] result = new int[a.length + 1];
        int extra = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            result[i+1] = (a[i] * b + extra) % 10;
            extra = (a[i] * b + extra) / 10;
        }

        if (extra != 0) {
            result[0] = extra;
            return result;
        } else {
            int[] trimmedResult = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                trimmedResult[i] = result[i + 1];
            }
            return trimmedResult;
        }
    }

    public int[] arrayDiv(int[] a, int b) {
        int[] result = new int[a.length];
        int extra = 0;

        for (int i = 0; i < a.length; i++) {
            result[i] = (extra * 10 + a[i]) /b;
            extra = (extra * 10 + a[i]) % b;
        }

        if (result[0] != 0) {
            return result;
        } else {
            int ct0 = 0;
            while (result[ct0] == 0) {
                ct0++;
            }

            int[] trimmedResult = new int[a.length - ct0];
            for (int i = 0; i < trimmedResult.length; i++) {
                trimmedResult[i] = result[i + ct0];
            }
            return trimmedResult;
        }
    }
}
