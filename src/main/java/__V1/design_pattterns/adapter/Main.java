package __V1.design_pattterns.adapter;

public class Main {

    public static void main(String[] args) {

        IPhone iPhone = IPhoneX.builder().platform("iOS").version("15.0").build();
        AndroidPhone androidPhone = Xiaomi.builder().platform("Android").version("12.0").build();

        IPhone newIPhone = new AndroidIPhoneAdapter(androidPhone);
        AndroidPhone convertedIPhone = PhoneAdapter.toAndroidPhone(newIPhone);
        AndroidPhone anotherConvertedIPhone = PhoneAdapter.toAndroidPhone(iPhone);
    }
}
