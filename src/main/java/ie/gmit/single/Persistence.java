package ie.gmit.single;

public class Persistence {
    Store store = new Store();
    public void StoreUser(User user) {
        store.store(user);
    }
}
