
enum DescriptorType{ViewId, ViewLabel, ViewTagValue,ViewHint, ViewContentDescription}


public class WidgetDescriptor {
    private DescriptorType viewDescriptorType;
    private String value;

    public void SetDescriptor(DescriptorType viewDescriptor, String value){
        this.value = value;
        this.viewDescriptorType = viewDescriptor;
    }

    public DescriptorType getViewDescriptorType() {
        return viewDescriptorType;
    }

    public String getValue() {
        return value;
    }

}
