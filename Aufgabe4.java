public class Aufgabe4 {
    int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int i = 1; i < keyboards.length; i++) {
            if (keyboards[i] < min) {
                min = keyboards[i];
            }
        }
        return min;
    }

    int mostExpensiveItem(int[] keyboards, int[] usb) {
        int max = keyboards[0];
        for (int i = 1; i < keyboards.length; i++) {
            if (keyboards[i] > max) {
                max = keyboards[i];
            }
        }
        for (int i = 0; i < usb.length; i++) {
            if (usb[i] > max) {
                max = usb[i];
            }
        }
        return max;
    }

    int mostExpensiveUsb(int[] usb, int budget) {
        int maxAffordable = -1;
        for (int i = 0; i < usb.length; i++) {
            if (usb[i] <= budget && usb[i] > maxAffordable) {
                maxAffordable = usb[i];
            }
        }
        return maxAffordable;
    }

    int maxBudget(int[] keyboards, int[] usb, int budget) {
        int max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < usb.length; j++) {
                int total = keyboards[i] + usb[j];
                if (total <= budget && total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

}
