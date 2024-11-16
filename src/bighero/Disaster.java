package bighero;

/**
 *
 * @author ROKAYA SULTANA RAKA
 */
public class Disaster {

    private String type;
    private int difficultyLevel;
    private String attributeRequired;

    public Disaster(String type, int difficultyLevel, String attributeRequired) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
        this.attributeRequired = attributeRequired;

    }

    public String getType() {
        return type;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getAttributeRequired() {
        return attributeRequired;
    }
}
