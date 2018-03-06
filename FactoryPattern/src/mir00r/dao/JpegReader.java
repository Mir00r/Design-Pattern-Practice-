package mir00r.dao;

import mir00r.model.DecodedImage;
import mir00r.service.ImageReader;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;


    public JpegReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
