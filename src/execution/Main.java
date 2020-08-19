/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 19-08-2020
 *  Time: 01:04 PM
 */
package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Malang");
        video.setRating(5);
        video.setCheckOut(true);
        System.out.println(video.getVideoName());
        System.out.println(video.getRating());
        System.out.println(video.isCheckOut());
    }
}
