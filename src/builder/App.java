package builder;

public class App {
	public static void main(String[] args) {
//		URL url = new URL();
//		
//		url.setProtocol("http://");
//		url.setHostName("mywebsite");
//		url.setPort(":8080/");
//		url.setPathParam("homepage");
//		url.setQueryParam("?random");
//		
//		System.out.print(url.getProtocol());
//		System.out.print(url.getHostName());
//		System.out.print(url.getPort());
//		System.out.print(url.getPathParam());
		
		URLBuilder builder = new URLBuilder.Builder()
								.protocol("http://").hostName("localhost/")
								.port("8080").build();
		
		System.out.print(builder.protocol);
		
		
//		URLBuilder.Builder builder = new URLBuilder.Builder();
//		builder.protocol("http://").hostName("localhost:").port("8080");
//		URLBuilder urlBuilder = builder.build();
		
		
//		System.out.println(urlBuilder);
		
	}

}
