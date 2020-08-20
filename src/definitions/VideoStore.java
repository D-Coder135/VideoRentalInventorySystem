/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 10:20 PM
 */
package definitions;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public Video[] getStore() {
        return store.clone();
    }

    public void setStore(Video[] store) {
        this.store = store;
    }
}
