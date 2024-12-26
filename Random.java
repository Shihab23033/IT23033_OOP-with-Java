public class Random {
    private long seed;
    long a = 1664525; // Multiplier
    long c = 12345; // Increment
    long m = 2147483647; // Modulus (2^32)
    public Random(long seed)
    {
        this.seed=seed;
    }
    public long GenRandom() {
        seed = (a * seed + c) % m;
        return seed;
    }

    public static void main(String[] args) {
        Random rnd=new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.GenRandom());
        }
    }
}
