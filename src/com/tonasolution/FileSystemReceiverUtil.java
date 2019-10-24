package com.tonasolution;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getFileSystemReceiver() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is " + osName);

        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        }
        else if (osName.contains("Unix")) {
            return new UnixFileSystemReceiver();
        }

        return null;
    }
}
