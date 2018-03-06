import mir00r.dao.GifReader;
import mir00r.dao.JpegReader;
import mir00r.model.DecodedImage;
import mir00r.service.ImageReader;

public class Main {

    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;

        String image = "image.gif";
        String format = image.substring(image.indexOf('.') + 1, (image.length()));

        if (format.equals("gif")) {
            reader = new GifReader(image);
        }

        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }

        assert reader != null;
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
