import lombok.Data;

import java.io.Serializable;

public class SerializingExample {

	public static void main(String[] args) {
		new Any("test");
	}

	@Data
	public static class Any implements Serializable {
		private String name;

		public Any(String a){
			name = a;
		}
	}
}
