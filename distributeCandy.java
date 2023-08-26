lass Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for(int candy : candyType) {
            hs.add(candy);
        }
        return hs.size() < candyType.length/2 ? hs.size() : candyType.length/2;
    }
}
