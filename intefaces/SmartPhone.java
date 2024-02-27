package intefaces;

public class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    @Override
    public boolean testCompatibility() {
        String version = getOperatingSystemVersion();
        if(getOperatingSystemName().equals("Saturn")) {
            if(networkGeneration.equals("3G")) {
                if(version.equals("1.1") || version.equals("1.2") || version.equals("1.3"))
                    return true;
                else
                    return false;
            }
            else if(networkGeneration.equals("4G")) {
                if(version.equals("1.2") || version.equals("1.3"))
                    return true;
                else
                    return false;
            }
            else if(networkGeneration.equals("5G")) {
                if(version.equals("1.3"))
                    return true;
                else
                    return false;
            } else {
                return false;
            }
        }
        else if(getOperatingSystemName().equals("Gara")) {
            if(networkGeneration.equals("3G")) {
                if(version.equals("EXRT.1") || version.equals("EXRT.2") || version.equals("EXRU.1"))
                    return true;
                else
                    return false;
            }
            else if(networkGeneration.equals("4G")) {
                if(version.equals("EXRT.2") || version.equals("EXRU.1"))
                    return true;
                else
                    return false;
            }
            else if(networkGeneration.equals("5G")) {
                if(version.equals("EXRU.1"))
                    return true;
                else
                    return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
