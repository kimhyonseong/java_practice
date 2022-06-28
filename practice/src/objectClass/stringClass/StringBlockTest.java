package objectClass.stringClass;

public class StringBlockTest {
    public static void main(String[] args) {
        // JAVA 13부터 제공
        String textBlock = """
                Hello,
                hi,
                how r u""";

        System.out.println(textBlock);
        System.out.println(getBlockOfHtml());

    }

    public static String getBlockOfHtml() {
        return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";

    }

}
