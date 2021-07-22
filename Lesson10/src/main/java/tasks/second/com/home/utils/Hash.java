package tasks.second.com.home.utils;

public enum Hash {
    JACKET_HASH(1),
    PANTS_HASH(2),
    SHOES_HASH(3);

    private final int hash;

    Hash(int hash) {
        this.hash = hash;
    }
}
