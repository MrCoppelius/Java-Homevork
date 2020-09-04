package enums;

public class Server {
    public static void main(String[] args) {
        String inputString = "dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah";
        HttpCodeService service = new HttpCodeService("(httpcode:\\s*\\d+)");
        service.processHttp(inputString);
    }
}