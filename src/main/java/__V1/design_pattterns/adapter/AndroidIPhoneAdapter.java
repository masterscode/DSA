package __V1.design_pattterns.adapter;

public class AndroidIPhoneAdapter implements IPhone{
    AndroidPhone androidPhone;
    public AndroidIPhoneAdapter(AndroidPhone phone){
        this.androidPhone = phone;
    }
    @Override
    public String getPlatform() {
        return androidPhone.getPlatform();
    }

    @Override
    public String getVersion() {
        return androidPhone.getVersion();
    }
}
