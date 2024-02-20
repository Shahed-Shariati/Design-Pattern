package org.example.creationalDP.factory.APP;

public class IOSMobileApp implements MobileApp {
    private String name;
    private Integer version;

    public IOSMobileApp(String name, Integer version) {
        this.name = name;
        this.version = version;
    }
    @Override
    public void buildApp(){
        System.out.println("Building ios " + this.name + " " + this.version);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
