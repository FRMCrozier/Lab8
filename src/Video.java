/**
 * Класс дополнительного объекта, входящего в основной список
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "1080p",
        "720p",
        "480p",
        "360p"
})

public class Video {

    private String _1080p;
    private String _720p;
    private String _480p;
    private String _360p;


    public String get1080p() {
        return _1080p;
    }

    public void set1080p(String _1080p) {
        this._1080p = _1080p;
    }


    public String get720p() {
        return _720p;
    }

    public void set720p(String _720p) {
        this._720p = _720p;
    }


    public String get480p() {
        return _480p;
    }

    public void set480p(String _480p) {
        this._480p = _480p;
    }


    public String get360p() {
        return _360p;
    }

    public void set360p(String _360p) {
        this._360p = _360p;
    }

    @Override
    public String toString() {
        return "Video {" +
                "1080p = '" + _1080p + '\'' +
                ", 720p = '" + _720p + '\'' +
                ", 480p = '" + _480p + '\'' +
                ", 360p = '" + _360p + '\'' +
                '}';
    }
}