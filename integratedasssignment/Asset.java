package integratedasssignment;

public class Asset {
    private String assetId;
    private String assetName;
    private String assetExpiry;

    public Asset(String assetId, String assetName, String assetExpiry) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.assetExpiry = assetExpiry;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        String regex = "^(DSK|LTP|IPH)-\\d{6}[HL]$";

        if(assetId.matches(regex)) {
            this.assetId = assetId;
        }
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetExpiry() {
        return assetExpiry;
    }

    public void setAssetExpiry(String assetExpiry) {
        this.assetExpiry = assetExpiry;
    }
}
