import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class AoC2016Day5Part1 {
	public static void main(String[] args) {
		String result;

		result = test("abc");
		assert (result.equals("18f47a30"));
		System.out.println(result);

		result = test("ugkcyxxp");
		System.out.println(result);
	}

	public static String test(final String s) {
		final char[] password = new char[8];

		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			int j = 0;
			for (int i = 0; i < 1000000000; ++i) {
				String ss = s + i;
				digest.update(ss.getBytes());
				byte[] bytes = digest.digest();
				String hash = String.format(Locale.US, "%032x", new BigInteger(
						1, bytes));
				if (hash.startsWith("00000")) {
					password[j] = hash.charAt(5);
					System.out.println("found character " + j + ": "
							+ password[j]);
					++j;
					if (j >= 8) {
						break;
					}
				}
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return String.valueOf(password);
	}
}