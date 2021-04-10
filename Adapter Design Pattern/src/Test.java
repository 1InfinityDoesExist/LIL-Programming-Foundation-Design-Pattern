
public class Test {
	public static void main(String[] args) {
		AndroidCharger androidCharger = new AndroidCharger();
		AndroidPhone androidPhone = new Samgsunj();
		androidCharger.charge(androidPhone);

		IPhoneCharger iPhoneCharger = new IPhoneCharger();
		IPhone iPhone = new IPhoneXS();
		iPhoneCharger.charge(iPhone);

		AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
		iPhoneCharger.charge(adapter);
	}
}
