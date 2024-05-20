package com.example.volumecalculator;

public class ShapeModel {
    int shapeImg;
    String shapeName;

    /**
     * Constructor Of shape Model Class
     * @param shapeImg
     * @param shapeName
     */
    public ShapeModel(int shapeImg, String shapeName) {
        this.shapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    /**
     * @return Image
     */
    public int getShapeImg() {
        return shapeImg;
    }

    /**
     * @param shapeImg
     * Set Image
     */
    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    /**
     * @return Shape Name
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Set Shape Name
     * @param shapeName
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
