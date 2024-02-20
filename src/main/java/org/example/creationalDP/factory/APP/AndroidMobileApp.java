package org.example.creationalDP.factory.APP;

public class AndroidMobileApp implements MobileApp {
    private String name;
    private Integer version;


    public AndroidMobileApp(String name, Integer version) {
        this.name = name;
        this.version = version;
    }
    @Override
    public void buildApp(){
        System.out.println("Building Android " + this.name + " " + this.version);
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
