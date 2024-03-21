class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) 
                res.add(interval); //already added or dont need to add new
            else if (interval[0] > newInterval[1]) {
                res.add(newInterval); //add before
                res.add(interval);
                newInterval = null;
            } else { //merge
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) res.add(newInterval);//add at end
        return res.toArray(new int[res.size()][]);
    }
}
