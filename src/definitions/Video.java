/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 17-08-2020
 *  Time: 10:37 PM
 */
package definitions;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
