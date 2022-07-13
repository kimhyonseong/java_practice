package design.facade;

public class Main {
    public static void main(String[] args) {
//        Ftp ftp = new Ftp("www.foo.co.kr",22,"/home/etc");
//        ftp.connect();
//        ftp.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileReader();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftp.disConnect();
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
