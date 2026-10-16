class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int take = Math.min(boxTypes[i][0], truckSize);
            totalUnits = totalUnits + (take * boxTypes[i][1]);
            truckSize = truckSize - take;
            if (truckSize == 0) {
                break;
            }
        }
        return totalUnits;
    }
}