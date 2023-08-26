        HashSet<Integer> hs = new HashSet<>();
        while(n != 1 && ! hs.contains(n)) {
            hs.add(n);
            int sum = 0;
            while(n != 0) {
                sum += (n%10) * (n%10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
