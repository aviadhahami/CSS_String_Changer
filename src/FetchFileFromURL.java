import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FetchFileFromURL {
	static String url = "";

	public FetchFileFromURL(String url) {
		FetchFileFromURL.url = url;
	}

	public static void main(String[] args) {
		// Check if url is defined
		if (url == "" || url.isEmpty()) {
			return;
		}

		try {
			URL website = new URL(url);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/aviadh/Desktop/information.xml");
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		} catch (Exception e) {

		}
		System.out.println("Fetched");

	}
}
