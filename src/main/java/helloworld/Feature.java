package helloworld;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "feature-v3")
public class Feature {

    private String propertyId;
    private String type;
    private String parking;
    private String yearBuilt;
    private double hoa;
    private String heating;
    private String cooling;
    private double priceSqft;

    //primary key is propertyId
    @DynamoDBHashKey(attributeName = "propertyId")
    public String getPropertyId() {
        return propertyId;
    }

    @DynamoDBAttribute(attributeName = "type")
    public String getType() {
        return type;
    }

    @DynamoDBAttribute(attributeName = "parking")
    public String getParking() {
        return parking;
    }

    @DynamoDBAttribute(attributeName = "yearBuilt")
    public String getYearBuilt() {
        return yearBuilt;
    }

    @DynamoDBAttribute(attributeName = "hoa")
    public double getHoa() {
        return hoa;
    }

    @DynamoDBAttribute(attributeName = "heating")
    public String getHeating() {
        return heating;
    }

    @DynamoDBAttribute(attributeName = "cooling")
    public String getCooling() {
        return cooling;
    }

    @DynamoDBAttribute(attributeName = "priceSqft")
    public double getPriceSqft() {
        return priceSqft;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public void setType(String type) { this.type = type; }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public void setPriceSqft(double priceSqft) {
        this.priceSqft = priceSqft;
    }

}
