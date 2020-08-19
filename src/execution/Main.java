/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 01:04 PM
 */
package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("Robot"); // constructor
        System.out.println(video.getVideoName() + ", " + video.getRating() + ", " + video.isCheckOut() + " .");
        Video video1 = new Video(); // constructor
        System.out.println(video1.getVideoName() + ", " + video1.getRating() + ", " + video1.isCheckOut() + " .");
        Video video2 = new Video(); // constructor
        System.out.println(video2.getVideoName() + ", " + video2.getRating() + ", " + video2.isCheckOut() + " .");
        Video video3 = new Video(); // constructor
        System.out.println(video3.getVideoName() + ", " + video3.getRating() + ", " + video3.isCheckOut() + " .");

    }
}
