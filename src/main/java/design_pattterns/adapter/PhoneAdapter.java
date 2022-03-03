package design_pattterns.adapter;

public class PhoneAdapter {
    public  static IPhone toIPhone(AndroidPhone androidPhone){
        return new IPhone() {
            @Override
            public String getPlatform() {
                return androidPhone.getPlatform();
            }

            @Override
            public String getVersion() {
                return androidPhone.getVersion();
            }
        };
    }

    public  static AndroidPhone toAndroidPhone(IPhone phone){
        return new AndroidPhone() {
            @Override
            public String getPlatform() {
                return phone.getPlatform();
            }

            @Override
            public String getVersion() {
                return phone.getVersion();
            }
        };
    }


}
