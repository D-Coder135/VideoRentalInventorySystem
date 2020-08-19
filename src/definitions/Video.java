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

    public Video() {
        videoName = "Soryavansham";
        rating = 5;
        checkOut = true;
    }

    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 4;
        this.checkOut = false;
    }

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
